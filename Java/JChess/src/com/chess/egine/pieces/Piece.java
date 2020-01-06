package com.chess.egine.pieces;

import java.util.Collection;

import com.chess.egine.Alliance;
import com.chess.egine.board.Board;
import com.chess.egine.board.Move;

public abstract class Piece {

	protected final int piecePosition;
	protected final Alliance pieceAlliance;

	Piece(final int piecePosition, final Alliance pieceAlliance) {
		this.pieceAlliance = pieceAlliance;
		this.piecePosition = piecePosition;
	}

	public Alliance getPieaceAlliance() {
		return this.pieceAlliance;
	}

	public abstract Collection<Move> calculteLegalMoves(final Board board);
}
