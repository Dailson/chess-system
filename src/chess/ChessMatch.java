/**
 * 
 */
package chess;

import board.Board;
import board.exceptions.BoardException;
import chess.pieces.King;
import chess.pieces.Rook;

/**
 * @author dailson
 *
 */
public class ChessMatch {
	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	/**
	 * @return
	 * @throws BoardException 
	 */
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public void initialSetup() {
		placeNewPiece('b', 2, new Rook(board, Color.WHITE));
		placeNewPiece('h', 5, new King(board, Color.BLACK));

	}
}
