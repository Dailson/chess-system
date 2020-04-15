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
public class Rook extends ChessPiece{

	/**
	 * @param board
	 * @param color
	 */
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	
	@Override
	public String toString() {
		return "R";
	}

}
