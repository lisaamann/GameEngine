package at.rocketgame;


import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;

import java.util.Random;

public class Enemy implements Actor, CollisionShape {
    private float x;
    private float y;
    private float speed;
    private int diameterEnemy;
    private Shape collisionShape;

    public Enemy() throws SlickException {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameterEnemy = 20;
        this.collisionShape = new Circle(this.x,this.y,this.diameterEnemy/2);
    }


    public void render(Graphics graphics) {
        graphics.drawOval(this.x, this.y, 20, 20);
        graphics.draw(this.collisionShape);
        this.speed = 10.0f;
    }


    public void update(GameContainer gameContainer, int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;
        }
        this.collisionShape.setCenterX(this.x+10);
        this.collisionShape.setCenterY(this.y+10);
    }


    @Override
    public Shape getShape() {
        return null;
    }
}
