/**
 * 
 */
package chess.exceptions;

import board.exceptions.BoardException;

/**
 * @author dailson
 *
 */
public class ChessException extends BoardException{
	private static final long serialVersionUID = 1L;


	/**
	 * @param msg
	 */
	public ChessException(String msg) {
		super(msg);
	}
	
}
