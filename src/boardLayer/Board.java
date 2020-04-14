/**
 * 
 */
package boardLayer;

/**
 * @author dailson
 *
 */
public class Board {
	private	int rows;
	private int columns;
	
	private Piece[][] pieces;

	/**
	 * @param rows
	 * @param columns
	 */
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}
	
	/**
	 * @param rows the rows to set
	 */
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}
	
	/**
	 * @param columns the columns to set
	 */
	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	/**
	 * @return the columns
	 */
	public int getColumns() {
		return columns;
	}
	
}
