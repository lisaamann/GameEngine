package at.rocketgame;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CanonBall implements Actor {
    private float x;
    private float y;

    public CanonBall(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, 10, 10);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
    }
}
