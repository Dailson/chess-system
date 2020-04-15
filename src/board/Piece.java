/**
 * 
 */
package board;

/**
 * @author dailson
 *
 */
public class Piece {
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}
	
	/**
	 * @return the board
	 */
	protected Board getBoard() {
		return board;
	}
	
	/**
	 * This method returns the position os a piece
	 * 
	 * @return position
	 */
	public Position getPosition() {
		return this.position;
	}
	
	public boolean[][] possibleMovies() {
		
		return null;
	}
	
	public boolean possibleMovie(Position position) {
		
		return false;
	}
	
	public boolean isTheereAnyPossibleMove() {
		
		return false;
	}
}
