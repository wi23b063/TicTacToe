import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    @Test
    public void testIsCellEmptyPositive() {
        Board board = new Board();
        assertTrue(board.isCellEmpty(0, 0), "Zelle (0, 0) sollte leer sein");
        assertTrue(board.isCellEmpty(1, 1), "Zelle (1, 1) sollte leer sein");
    }

    @Test
    public void testIsCellEmptyNegative() {
        Board board = new Board();
        board.cells[0][0] = 'X';
        assertFalse(board.isCellEmpty(0, 0), "Zelle (0, 0) sollte nicht leer sein");
        board.cells[2][2] = 'O';
        assertFalse(board.isCellEmpty(2, 2), "Zelle (2, 2) sollte nicht leer sein");
    }

    @Test
    public void testIsFullPositive() {
        Board board = new Board();
        assertFalse(board.isFull(), "Board sollte nicht voll sein");

        fillBoard(board, 'X');
        assertTrue(board.isFull(), "Board sollte voll sein");
    }

    @Test
    public void testIsFullNegative() {
        Board board = new Board();
        assertFalse(board.isFull(), "Board sollte nicht voll sein");

        board.cells[0][0] = 'X';
        board.cells[0][1] = 'X';
        assertFalse(board.isFull(), "Board sollte nicht voll sein");
    }
    @Test
    public void testFillBoard() {
        Board board = new Board();
        fillBoard(board, 'X');

        // Überprüfen, ob alle Zellen mit 'X' gefüllt sind
        for (int i = 0; i < board.cells.length; i++) {
            for (int j = 0; j < board.cells[i].length; j++) {
                assertEquals('X', board.cells[i][j], "Die Zelle (" + i + ", " + j + ") sollte mit 'X' gefüllt sein");
            }
        }
    }

    private void fillBoard(Board board, char symbol) {
        for (int i = 0; i < board.cells.length; i++) {
            for (int j = 0; j < board.cells[i].length; j++) {
                board.cells[i][j] = symbol;
            }
        }
    }
}