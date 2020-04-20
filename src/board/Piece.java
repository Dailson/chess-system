/**
 * 
 */
package board;

/**
 * @author dailson
 *
 */
public abstract class Piece {
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
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
	
	public abstract boolean[][] possibleMovies();

	
	
	/**
	 * HookMethod
	 *
	 * @param position
	 * @return
	 */
	public boolean possibleMovie(Position position) {
		return possibleMovies()[position.getRow()][position.getColumn()];
	}
	
	/**
	 * Implementação concreta que depende de um método abstrato
	 * @return
	 */
	public boolean isTheereAnyPossibleMove() {
		boolean[][] mat = possibleMovies();
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
