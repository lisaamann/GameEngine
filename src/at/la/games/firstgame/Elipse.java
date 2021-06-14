package at.la.games.firstgame;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import java.util.Random;

public class Elipse implements Actor {
    private float x;
    private float y;
    private float speed;

    public Elipse() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40)+10;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 100, 25);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.x += (float) delta / this.speed;
        this.y += (float) delta / this.speed;
        if (this.x > 600) {
            this.x = 0;
        }
    }
}
