package at.rocketgame;

import at.la.games.firstgame.Actor;
import at.snowflakes.Snowflake;
import org.newdawn.slick.*;

public class RocketObject implements Actor {
    private Image rocket;
    private float x;
    private float y;
    private float speed;

    public RocketObject() throws SlickException {
        this.x = 100;
        this.y = 100;
        this.speed = speed;
        Image rocketImage = new Image("testdate/rocket.png");
        this.rocket = rocketImage.getScaledCopy(50, 50);
    }


    public void render(Graphics graphics) {
        rocket.draw(this.x, this.y);
        this.speed = 10.0f;
    }

    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;
        }

    }


}
