package com.chess.egine.board;

public class BoardUtils {

	private BoardUtils() {
		throw new RuntimeException("You cannot instatio me!");
	}

	public static boolean isValidTileCoordinate(int coordinate) {
		return coordinate >= 0 && coordinate < 64;
	}

}
