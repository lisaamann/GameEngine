package at.la.games.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangles {
    private enum DIRECTION {RIGHT, LEFT, UP, DOWN};
    private float x;
    private float y;
    private float speed;
    private DIRECTION direction = DIRECTION.RIGHT;


    public Rectangles(float x, float y, float speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }


    public void update(int delta) throws SlickException {
        this.x += (float) delta/this.speed;
        if (this.x>800){
            this.x = 0;
        }
    }


    public void render(Graphics graphics) throws SlickException {
        graphics.drawRect(this.x, this.y, 70, 70);
    }

}
