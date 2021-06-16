package at.snake;

import at.rocketgame.RocketGameMain;
import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;

public class SnakeGame extends BasicGame {
    public static final int GRID_SIZE = 40;
    public static final int CLOCK = 500;
    public List<Actor> actors;
    private Element tail, tip;
    private int elapsedTime = 0;

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

        this.elapsedTime += delta;
        if (this.elapsedTime > CLOCK) {
            Element tmp = this.tail;
            this.tail = tmp.getNext();
            tmp.setNext(null);
            tip.setNext(tmp);

            //movement
            int newX = this.tip.getX();
            int newY = this.tip.getY();

            //logic for directions
            newY--;
            if (newY < 0) {
                newY = 15;
            }
            //newX++;
            tmp.setX(newX);
            tmp.setY(newY);

            //finalizing
            this.tip = tmp;
            this.elapsedTime = 0;
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor : this.actors) {
            actor.render(gameContainer, graphics);
        }
    }


    public void keyPressed(int key, char c, GameContainer gameContainer) {
        if (gameContainer.getInput().isKeyDown(Input.KEY_RIGHT)) {
            System.out.println("Rechts");
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_LEFT)){
            System.out.println("Links");
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_UP)){
            System.out.println("Rauf");
        }
        if (gameContainer.getInput().isKeyDown(Input.KEY_DOWN)){
            System.out.println("Runter");
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
