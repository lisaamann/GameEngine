package at.snake;

import at.rocketgame.RocketGameMain;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class SnakeGame extends BasicGame {
    public static final int GRID_SIZE = 40;
    public List<Actor> actors;
    private Element tail, tip;

    public SnakeGame(String title) {
        super(title);
    }


    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();

        Element e1 = new Element(3, 3);
        Element e2 = new Element(4, 3);
        Element e3 = new Element(5, 3);
        Element e4 = new Element(6, 3);

        e1.setNext(e2);
        e2.setNext(e3);
        e3.setNext(e4);
        this.tail = e1;
        this.tip = e4;

        this.actors.add(e1);
        this.actors.add(e2);
        this.actors.add(e3);
        this.actors.add(e4);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor : this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(gameContainer, graphics);
        }
    }

    //region MAIN
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new SnakeGame("Snake"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    //endregion
}
