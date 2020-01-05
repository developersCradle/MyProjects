package com.chess.egine.pieces;

import java.util.ArrayList;
import java.util.List;

import com.chess.egine.Alliance;
import com.chess.egine.board.Board;
import com.chess.egine.board.BoardUtils;
import com.chess.egine.board.Move;
import com.chess.egine.board.Tile;
import com.google.common.collect.ImmutableList;

public class Knight extends Piece {

	private final static int[] CANDITATE_MOVE_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17 };

	Knight(final int piecePosition, final Alliance pieceAlliance) {
		super(piecePosition, pieceAlliance);
	}

	@Override
	public List<Move> calculteLegalMoves(Board board) {

		int cadidateDestinationCoordinate;
		final List<Move> legalMoves = new ArrayList();

		for (final int currentCandidate : CANDITATE_MOVE_COORDINATES) {
			cadidateDestinationCoordinate = this.piecePosition + currentCandidate;

			if (BoardUtils.isValidTileCoordinate(cadidateDestinationCoordinate)) {
				final Tile candidateDestinationTile = board.getTile(cadidateDestinationCoordinate);
				if (!candidateDestinationTile.isTileOccupied()) {
					legalMoves.add(new Move()); // Adding non attacking legal move
				} else {
					final Piece pieceAtDestination = candidateDestinationTile.getPiece();
					final Alliance pieceAlliance = pieceAtDestination.getPieaceAlliance();
					if (this.pieceAlliance != pieceAlliance) {
						legalMoves.add(new Move());
					}
				}
			}
		}
		return ImmutableList.copyOf(legalMoves);
	}

	private static boolen isFirstCol

}
