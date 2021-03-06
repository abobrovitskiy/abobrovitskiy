package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Класс BoardTest для тестирования класса Board.
*/
public class BoardTest {
	/**
	* метод whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows
	* тестирует доску 3 X 3.
	*/
    @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X%s X %sX X%s", line, line, line);
        assertThat(result, is(expected));
    }
	/**
	* метод whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows
	* тестирует доску 5 X 4.
	*/
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("X X X%s X X %sX X X%s X X %s", line, line, line, line);
        assertThat(result, is(expected));
    }
}