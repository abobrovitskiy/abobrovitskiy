package ru.job4j.shape;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* класс PaintTest тестирует класс Paint.
*/
public class PaintTest {
	/**
	 * метод whenNewTriangleThenPaintTriangle отображает треугольник.
	 */
	@Test
	public void whenNewTriangleThenPaintTriangle() {
		Paint paint = new Paint();
		paint.setShape(new Triangle());
		String result = paint.draw();
		String expected = String.format("   ^\r\n  ^^^\r\n ^^^^^\r\n^^^^^^^");
		assertThat(result, is(expected));
	}
	/**
	 * метод whenNewSquareThenPaintSquare отображает квадрат.
	 */
	@Test
	public void whenNewSquareThenPaintSquare() {
		Paint paint = new Paint();
		paint.setShape(new Square());
		String result = paint.draw();
		String expected = String.format("####\r\n#  #\r\n####");
		assertThat(result, is(expected));
	}
}