package at.la.games.firstgame;

import org.newdawn.slick.*;

public class Circle {
    private enum DIRECTION {UP, DOWN};
    private float x;
    private float y;
    private float speed;
    private int diameter;
    private DIRECTION direction = DIRECTION.UP;

    public Circle(float x, float y, float speed, int diameter) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }


    public void update(int delta) throws SlickException {
        if (direction == DIRECTION.UP){
            this.y -= (float) delta / this.speed;
            if (y<50){
                this.direction = DIRECTION.DOWN;
            }
        }
        if (direction == DIRECTION.DOWN){
            this.y += (float) delta / this.speed;
            if (y>500){
                this.direction = DIRECTION.UP;
            }
        }
    }

    public void render(Graphics graphics) throws SlickException {
        graphics.drawOval(this.x,this.y, 50, 50);
    }


}
