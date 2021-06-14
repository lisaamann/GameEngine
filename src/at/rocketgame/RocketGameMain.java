package at.rocketgame;

import at.la.games.firstgame.Actor;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Random;

public class RocketGameMain extends BasicGame {
    private RocketObject raketchen;
    private ArrayList<Actor> enemys;

    public RocketGameMain(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        //RocketObject rocketObject = new RocketObject();
        this.enemys = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Enemy enemy = new Enemy();
            this.enemys.add(enemy);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        //raketchen.update(gameContainer, delta);
        for (Actor actor:this.enemys) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        //raketchen.render(graphics);
        for (Actor actor:this.enemys) {
            actor.render(graphics);
        }
    }



    //region MAIN
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RocketGameMain("Raketenspielchen"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    //endregion
}
