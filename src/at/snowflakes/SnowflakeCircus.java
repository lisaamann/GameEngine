package at.snowflakes;

import at.la.games.firstgame.Actor;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Random;

public class SnowflakeCircus extends BasicGame {
    private ArrayList<Actor> snowflakes;

    public SnowflakeCircus(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.snowflakes = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            Snowflake snowflake1 = new Snowflake(Snowflake.SIZE.SMALL);
            Snowflake snowflake2 = new Snowflake(Snowflake.SIZE.MEDIUM);
            Snowflake snowflake3 = new Snowflake(Snowflake.SIZE.LARGE);
            this.snowflakes.add(snowflake1);
            this.snowflakes.add(snowflake2);
            this.snowflakes.add(snowflake3);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor:this.snowflakes) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor:this.snowflakes) {
            actor.render(graphics);
        }
    }

    //region MAIN
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SnowflakeCircus("Schneegestöber"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    //endregion
}
