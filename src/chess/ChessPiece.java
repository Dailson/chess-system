/**
 * 
 */
package chess;

import board.Board;
import board.Piece;

/**
 * @author dailson
 *
 */
public abstract class ChessPiece extends Piece{
	private Color color;
	
	
	public ChessPiece(Board board, Color color, int moveCount) {
		super(board);
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}


}