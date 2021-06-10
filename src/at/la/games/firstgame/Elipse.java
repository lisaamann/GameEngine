package at.la.games.firstgame;

import org.newdawn.slick.Graphics;

public class Elipse implements Actor {
    private int x, y;
    private int speed;

    public Elipse(int x, int y) {
        this.x = x;
        this.y = y;
        this.speed = 5;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 50, 10);
    }

    @Override
    public void update(int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
        if (this.x > 600) {
            this.x = 0;
        }
    }
}
