package DarkMaze;

import java.awt.Color;
import java.awt.Graphics;

public class Coin {
    private int row;
    private int col;
    private final int cellSize = 20;

    public Coin(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public void draw(Graphics g) {
        int centerX = (col * cellSize) + (cellSize / 2);
        int centerY = (row * cellSize) + (cellSize / 2);
        int radius = cellSize / 2;

        g.setColor(Color.YELLOW);
        g.fillOval(centerX - radius, centerY - radius, cellSize, cellSize);
    }
}
