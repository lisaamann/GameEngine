package at.rocketgame;

import at.la.games.firstgame.Actor;
import at.snowflakes.Snowflake;
import org.newdawn.slick.*;

public class RocketObject implements Actor{
    private float x;
    private float y;
    private Image rocket;

    public RocketObject() throws SlickException {
        this.x = 700;
        this.y = 500;
        //this.rocket = new Image("testdata/rocket.png");
        Image temp = new Image("testdata/rocket.png");
        this.rocket = temp.getScaledCopy(50, 50);
    }


    public void render(Graphics graphics) {
        rocket.draw(this.x, this.y);
    }

    public void update(GameContainer gameContainer, int delta) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)){
            this.x++;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            this.x--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            this.y--;
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            this.y++;
        }

    }


}
