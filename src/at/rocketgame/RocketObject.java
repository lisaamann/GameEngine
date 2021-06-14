package at.rocketgame;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

public class RocketObject implements Actor {
    private float x;
    private float y;
    private Image rocket;
    private RocketObject rocketObject;
    private Shape collisionShape;

    public RocketObject() throws SlickException {
        this.x = 700;
        this.y = 500;
        Image temp = new Image("testdata/rocket.png");
        this.rocket = temp.getScaledCopy(70, 70);
        this.collisionShape = new Rectangle(this.x, this.y, 70, 70);
    }


    public void render(Graphics graphics) {
        rocket.draw(this.x, this.y);
        graphics.draw(this.collisionShape);
    }

    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)) {
            this.x--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)) {
            this.y--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)) {
            this.y++;
        }
        this.collisionShape.setCenterX(this.x+35);
        this.collisionShape.setCenterY(this.y+35);
    }


    public float getX() {
        return x + 30;
    }

    public float getY() {
        return y;
    }

}
