/**
 * 
 */
package board;

/**
 * @author dailson
 *
 */
public class Position {
	private int row;
	private int column;

	/**
	 * This constructor initializes a Position with a <b>Row</b> and <b>Column</b>
	 * 
	 * @param row
	 * @param column
	 */
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	/**
	 * This method returns the Row
	 *
	 * @return row
	 */
	public int getRow() {
		return this.row;
	}

	/**
	 * This method returns the column
	 * 
	 * @return column
	 */
	public int getColumn() {
		return this.column;
	}

	/**
	 * @param row the row to set
	 */
	public void setRow(int row) {
		this.row = row;
	}
	
	/**
	 * @param column the column to set
	 */
	public void setColumn(int column) {
		this.column = column;
	}
	
	/**
	 * This method sets the row and the column
	 * 
	 * @param row
	 * @param column
	 */
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(row + ", ");
		strBuilder.append(column);
		return strBuilder.toString();
	}
}
