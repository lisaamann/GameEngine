package at.la.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

import java.util.Random;

public class Rectangles implements Actor {
    public enum DIRECTION {RIGHT, LEFT};
    private float x;
    private float y;
    private float speed;
    public DIRECTION direction = DIRECTION.RIGHT;


    public Rectangles(float x, float y, float speed, DIRECTION direction) {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40)+10;
        this.direction = direction;
    }


    public void update(int delta) {
        if (direction == DIRECTION.LEFT){
            this.x += (float) delta / this.speed;
            if (this.x > 800) {
                this.x = 0;
            }
        }
        if (direction == DIRECTION.RIGHT){
            this.x -= (float) delta / this.speed;
            if (this.x < 0) {
                this.x = 800;
            }
        }
    }


    public void render(Graphics graphics) {
        graphics.drawRect(this.x, this.y, 70, 70);
    }

}
