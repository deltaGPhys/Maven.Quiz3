package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
        this.board = new String[3][3];
    }

    public String[] getRow(Integer value) {
        return board[value];
    }

    public String[] getColumn(Integer value) {
        return new String[] {board[0][value],board[1][value],board[2][value]};
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        String [] row = this.getRow(rowIndex);
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        String [] row = this.getColumn(columnIndex);
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        for (int i = 0; i < 3; i++) {
            if (this.isRowHomogenous(i)) {
                return this.getRow(i)[0];
            }
            if (this.isColumnHomogeneous(i)) {
                return this.getColumn(i)[0];
            }
        }

        if (this.board[0][0] == this.board[1][1] && this.board[2][2] == this.board[1][1]) {
            return this.board[0][0];
        }

        if (this.board[2][0] == this.board[1][1] && this.board[0][2] == this.board[1][1]) {
            return this.board[2][0];
        }
        return "";
    }

    public String[][] getBoard() {
        return null;
    }
}
