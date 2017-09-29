package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Класс PointTest - для определения принадлежности точки к функции.
*/
public class PointTest {
	/**
	* метод whenPointOnLineThenTrue определяет лежит ли точка на прямой.
	*/
    @Test
    public void whenPointOnLineThenTrue() {
		/**
		* create of new point.
		*/
        Point a = new Point(1, 1);
		//execute method - is and get result;
		boolean rsl = a.is(0, 1);
		//assert result by excepted value.
		assertThat(rsl, is(true));
   }
}