package at.rocketgame;

import org.newdawn.slick.*;

public class RocketObject implements Actor {
    private float x;
    private float y;
    private Image rocket;
    private RocketObject rocketObject;

    public RocketObject() throws SlickException {
        this.x = 700;
        this.y = 500;
        Image temp = new Image("testdata/rocket.png");
        this.rocket = temp.getScaledCopy(70, 70);
    }


    public void render(Graphics graphics) {
        rocket.draw(this.x, this.y);
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

    }



    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}
