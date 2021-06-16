package at.snake;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Element implements Actor {
    private int x;
    private int y;

    public Element(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void update(GameContainer container, Graphics graphics) {
        graphics.fillOval(this.x * SnakeGame.GRID_SIZE, this.y * SnakeGame.GRID_SIZE, SnakeGame.GRID_SIZE - 1, SnakeGame.GRID_SIZE - 1);
    }

    @Override
    public void render(int delta) {

    }
}
