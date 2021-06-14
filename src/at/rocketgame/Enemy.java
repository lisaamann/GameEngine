package at.rocketgame;

import at.la.games.firstgame.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import java.util.Random;

public class Enemy implements Actor {
    private float x;
    private float y;
    private float speed;
    private int diameterEnemy;

    public Enemy() throws SlickException {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameterEnemy = 20;
    }


    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 20, 20);
        this.speed = 10.0f;
    }


    public void update(GameContainer gameContainer, int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;
        }
    }
}
