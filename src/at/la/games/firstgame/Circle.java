package at.la.games.firstgame;

import org.newdawn.slick.*;

import java.util.Random;

public class Circle implements Actor{
    private enum DIRECTION {UP, DOWN};
    private float x;
    private float y;
    private float speed;
    private int diameter;
    private DIRECTION direction = DIRECTION.UP;

    public Circle() {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40)+10;
        this.diameter = random.nextInt(20)+20;
    }


    public void update(int delta)  {
        this.y += (float) delta/this.speed;
        if (this.y>600){
            this.y = 0;

        }
        this.diameter ++;
    }

    public void render(Graphics graphics) {
        graphics.drawOval(this.x,this.y, this.diameter, this.diameter);
    }


}
