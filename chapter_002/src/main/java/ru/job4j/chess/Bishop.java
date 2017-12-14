package ru.job4j.chess;
/**
 * Bishop.
 */
public class Bishop extends Figure {
    /**
     *
     * @param cell ячейка на которой стоит фигура.
     */
    public Bishop(Cell cell) {
        super(cell);
    }
    /**
     *
     * @param dist ячейка назначения.
     * @return массив клеток.
     * @throws ImpossibleMoveException фигура не может двигаться.
     */
    @Override
    public Cell[] way(Cell dist) throws ImpossibleMoveException {

        int distX = dist.getIndexX() - this.getPosition().getIndexX();
        int distY = dist.getIndexY() - this.getPosition().getIndexY();

        if (Math.abs(distX) == Math.abs(distY)) {

            Cell[] cells = new Cell[Math.abs(distX) - 1];

            for (int i = 1; i < Math.abs(distX); i++) {
                if (distX > 0 && distY > 0) {
                    cells[i - 1] = new Cell(
                            this.getPosition().getIndexX() + i,
                            this.getPosition().getIndexY() + i);
                } else if (distX > 0 && distY < 0) {
                    cells[i - 1] = new Cell(
                            this.getPosition().getIndexX() + i,
                            this.getPosition().getIndexY() - i);
                } else if (distX < 0 && distY > 0) {
                    cells[i - 1] = new Cell(
                            this.getPosition().getIndexX() - i,
                            this.getPosition().getIndexY() + i);
                } else {
                    cells[i - 1] = new Cell(
                            this.getPosition().getIndexX() - i,
                            this.getPosition().getIndexY() - i);
                }
            }
            return cells;
        }
        throw new ImpossibleMoveException("Ход не по правилам");
    }
    /**
     * копирование фигуры на новую ячейку.
     * @param dist новая ячейка.
     * @return фигура на новой ячейке.
     */
    @Override
    public Bishop clone(Cell dist) {
        return new Bishop(dist);
    }
}
