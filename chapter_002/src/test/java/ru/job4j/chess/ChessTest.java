package ru.job4j.chess;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * ChessTest теститрует пакет chess.
 */
public class ChessTest {
    /**
     * whenMoveToOccupiedCellThenException тестирует поведение, когда клетка занята.
     */
    @Test
    public void whenMoveToOccupiedCellThenException() {
        Board board = new Board();
        Figure[] figures = {
                new Bishop(new Cell(0, 0)),
                new Bishop(new Cell(3, 3))
        };
        board.setFigures(figures);
        String result = "";
        try {
            board.move(new Cell(0, 0), new Cell(3, 3));
        } catch (Exception e) {
            result = e.toString();
        }

        String expected = (new OccupiedWayException("Клетка занята!")).toString();
        assertThat(result, is(expected));
    }
    /**
     * whenMoveAcrossOccupiedCellThenException теститрует поведение, когда на пути мешает фигура.
     */
    @Test
    public void whenMoveAcrossOccupiedCellThenException() {
        Board board = new Board();
        Figure[] figures = {
                new Bishop(new Cell(0, 0)),
                new Bishop(new Cell(4, 4)),
        };

        board.setFigures(figures);

        String result = "";
        try {
            board.move(new Cell(0, 0), new Cell(5, 5));
        } catch (Exception e) {
            result = e.toString();
        }

        String expected = (new OccupiedWayException("Впереди мешает другая фигура")).toString();
        assertThat(result, is(expected));
    }
    /**
     * whenFigureNotFoundThenException тестирует поведение, когда выбрана пустая клетка.
     */
    @Test
    public void whenFigureNotFoundThenException() {
        Board board = new Board();
        Figure[] figures = {
                new Bishop(new Cell(0, 0))
        };

        board.setFigures(figures);

        String result = "";
        try {
            board.move(new Cell(0, 1), new Cell(5, 5));
        } catch (Exception e) {
            result = e.toString();
        }

        String expected = (new FigureNotFoundException("Вы не выбрали фигуру, клетка пустая!")).toString();
        assertThat(result, is(expected));
    }
    /**
     * whenWrongWayThenException тестирует поведение, когда ход сделан не по правилам..
     */
    @Test
    public void whenWrongWayThenException() {
        Board board = new Board();
        Figure[] figures = {
                new Bishop(new Cell(0, 1))
        };

        board.setFigures(figures);

        String result = "";
        try {
            board.move(new Cell(0, 1), new Cell(5, 5));
        } catch (Exception e) {
            result = e.toString();
        }

        String expected = (new ImpossibleMoveException("Ход не по правилам")).toString();
        assertThat(result, is(expected));
    }
    /**
     * whenBishopCanGoThenItGoing теститрует нормальный ход фигурой.
     */
    @Test
    public void whenBishopCanGoThenItGoing() {
        Board board = new Board();
        Figure[] figures = {
                new Bishop(new Cell(0, 0))
        };

        board.setFigures(figures);

        try {
            board.move(new Cell(0, 0), new Cell(5, 5));
        } catch (Exception e) {
            System.out.println(e);
        }
        Figure result = board.getFigureOnCell(new Cell(5, 5));
        assertThat(result, is(figures[0]));
    }
}
