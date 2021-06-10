package at.la.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Oval {
    private enum DIRECTION {LEFT, RIGHT};
    private float x;
    private float y;
    private float speed;
    private DIRECTION direction = DIRECTION.RIGHT;

    public Oval(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    public void update(int delta) throws SlickException {
        if (direction == DIRECTION.RIGHT){
            this.x += (float) delta/this.speed;
            if (x>700){
                this.direction = DIRECTION.LEFT;
            }
        }
        if (direction==DIRECTION.LEFT){
            this.x -= (float) delta/this.speed;
            if (x<50){
                this.direction = DIRECTION.RIGHT;
            }
        }
    }

    public void render(Graphics graphics) throws SlickException {
        graphics.drawOval(this.x, this.y, 50, 20);
    }

}
