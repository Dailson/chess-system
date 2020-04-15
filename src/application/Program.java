/**
 * 
 */
package application;

import board.exceptions.BoardException;
import chess.ChessMatch;

/**
 * @author dailson
 *
 */
public class Program {
	public static void main(String[] args) throws BoardException {

	//	try {

			ChessMatch chessMatch = new ChessMatch();
			UI.printBoard(chessMatch.getPieces());

//		} catch (BoardException e) {
//			System.out.println("Error: " + e.getMessage());
//		
//		} catch (Exception e) {
//			System.out.println("Unexpected error");
//		}

	}
}
