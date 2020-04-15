/**
 * 
 */
package board;

import board.exceptions.BoardException;

/**
 * @author dailson
 *
 */
public class Board {
	private int rows;
	private int columns;

	private Piece[][] pieces;

	/**
	 * @param rows
	 * @param columns
	 * @throws BoardException
	 */
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	/**
	 * @return the rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * @return the columns
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * @param row
	 * @param column
	 * @return piece
	 * @throws BoardException
	 */
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[row][column];
	}

	/**
	 * @param position
	 * @return piece on position
	 * @throws BoardException
	 */
	public Piece piece(Position position){
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	/**
	 * @param piece
	 * @param position
	 * @throws BoardException
	 */
	public void placePiece(Piece piece, Position position){
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	/**
	 * @param row
	 * @param column
	 * @return true or false
	 */
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	/**
	 * @param position
	 * @return piece
	 */
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	/**
	 * @param position
	 * @return true or false
	 * @throws BoardException
	 */
	public boolean thereIsAPiece(Position position){
//		if (thereIsAPiece(position)) {
//			throw new BoardException("There is a piece on position");
//		}
		return piece(position) != null;
	}

}
