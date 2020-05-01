/**
 * 
 */
package chess;

import board.Board;
import board.Piece;
import board.Position;

/**
 * @author dailson
 *
 */
public abstract class ChessPiece extends Piece {
	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	/**
	 * @return the moveCount
	 */
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increaseMoveCount() {
		this.moveCount ++;
	}
	
	public void decreaseMoveCount() {
		this.moveCount --;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}

}
