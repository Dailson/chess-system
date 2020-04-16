/**
 * 
 */
package chess.exceptions;

/**
 * @author dailson
 *
 */
public class ChessException extends RuntimeException{
	private static final long serialVersionUID = 1L;


	/**
	 * @param msg
	 */
	public ChessException(String msg) {
		super(msg);
	}
	
}
