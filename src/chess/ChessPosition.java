package chess;

import boardgame.Position;

public class ChessPosition {
	private static char column = 'a';
	private static int row = 0;
	
	protected Position toPosition() {
		
	}
	
	protected static ChessPosition fromPosition(Position position) {
		char[] positions = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
		
		setRow(position.getRow());
		setColumn(positions[position.getColumn()]);
		
		return ChessPosition.getRow();
	}

	public static char getColumn() {
		return column;
	}

	public static void setColumn(char column) {
		ChessPosition.column = column;
	}

	public static int getRow() {
		return row;
	}

	public static void setRow(int row) {
		ChessPosition.row = row;
	}
}
