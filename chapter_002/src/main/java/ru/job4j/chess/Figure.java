package ru.job4j.chess;


/**
 * Figure.
 */
public abstract class Figure {
    /**
     * position.
     */
    private final Cell position;

    /**
     *
     * @return position.
     */
    public Cell getPosition() {
        return position;
    }

    /**
     *
     * @param position position.
     */
    Figure(Cell position) {
        this.position = position;
    }

    /**
     *
     * @param dist ячейка назначения.
     * @return массив ячеек пути без начальной и конечной.
     * @throws ImpossibleMoveException фигура не может идти в эту ячейку по правилам передвижения.
     */
    public abstract Cell[] way(Cell dist) throws ImpossibleMoveException;

    /**
     * копирование фигуры на новую ячейку.
     * @param dist новая ячейка.
     * @return фигура на новой ячейке.
     */
    public abstract Figure clone(Cell dist);
}
