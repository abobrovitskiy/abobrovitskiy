package ru.job4j.chess;
/**
 * Board.
 */
public class Board {
    /**
     * Массив из фигур.
     */
    private Figure[] figures;
    /**
     *
     * @param figures figures.
     */
    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }
    /**
     *
     * @param source source.
     * @param dist dist.
     * @return boolean.
     * @throws ImpossibleMoveException фигура не может двигаться.
     * @throws OccupiedWayException клетка занята другой фигурой.
     * @throws FigureNotFoundException пустая клетка.
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException, OccupiedWayException, FigureNotFoundException {

        Figure figure = getFigureOnCell(source);

        if (figure != null) {
            for (Cell cell: figure.way(dist)) {
                if (getFigureOnCell(cell) != null) {
                    throw new OccupiedWayException("Впереди мешает другая фигура");
                }
            }

            if (getFigureOnCell(dist) != null) {
                throw new OccupiedWayException("Клетка занята!");
            }

            for (int i = 0; i < figures.length; i++) {
                if (figures[i].getPosition().getIndex() == source.getIndex()) {
                    figures[i] = figures[i].clone(dist);

                }
            } return true;
        } else {
            throw new FigureNotFoundException("Вы не выбрали фигуру, клетка пустая!");
        }
    }
    /**
     *
     * @param cell cell.
     * @return figure.
     */
    public Figure getFigureOnCell(Cell cell) {
        for (Figure figure: figures) {
            if (cell.getIndex() == figure.getPosition().getIndex()) {
                return figure;
            }
        }
        return null;
    }
}
