package ru.job4j.shape;
import org.junit.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
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
		Triangle triangle = new Triangle();
		String expected = String.format("   ^\r\n  ^^^\r\n ^^^^^\r\n^^^^^^^");
		assertThat(triangle.pic(), is(expected));
	}
	/**
	 * метод whenNewSquareThenPaintSquare отображает квадрат.
	 */
	@Test
	public void whenNewSquareThenPaintSquare() {
		Square square = new Square();
		String expected = String.format("####\r\n#  #\r\n####");
		assertThat(square.pic(), is(expected));
	}

	/**
	 * метод whenDrawSquare тестирует метод Paint.
	 */
    @Test
    public void whenDrawSquare() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Square());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
								.append("####")
								.append(System.lineSeparator())
								.append("#  #")
								.append(System.lineSeparator())
								.append("####")
								.append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}