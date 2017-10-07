package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* класс PaintTest тестирует класс Paint.
*/
public class PaintTest {
	/**
	* метод whenPyramidWithHeightTwoThenStringWithTwoRows тестирует пирамиду высотой 2.
	*/
    @Test
    public void whenPyramidWithHeightTwoThenStringWithTwoRows() {
		Paint paint = new Paint();
		String result = paint.pyramid(2);
		String expected = String.format(" ^ %s^^^%s", System.getProperty("line.separator"));
		assertThat(result, is(expected));
    }
	/**
	* whenPyramidWithHeightThreeThenStringWithThreeRows теститирует пирамиду высотой 3.
	*/
    @Test
    public void whenPyramidWithHeightThreeThenStringWithThreeRows() {
		Paint paint = new Paint();
		String result = paint.pyramid(3);
		String expected = String.format(" ^ %s^^^ %s ^^^^^", System.getProperty("line.separator"));
		assertThat(result, is(expected));
    }
}