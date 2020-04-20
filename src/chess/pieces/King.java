/**
 * 
 */
package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

/**
 * @author dailson
 *
 */
public class King extends ChessPiece{

	/**
	 * @param board
	 * @param color
	 */
	public King(Board board, Color color) {
		super(board, color);
	}

	
	@Override
	public String toString() {
		return "K";
	}


	@Override
	public boolean[][] possibleMovies() {
		boolean[][] mat = new boolean[super.getBoard().getRows()][super.getBoard().getColumns()];
		return mat;
	}
}
