package at.la.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RectanglesMoreAndMoreAndMore extends BasicGame {
    private ArrayList<Actor> actors;

    private RectanglesMoreAndMoreAndMore(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.actors = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            Rectangles rectangles = new Rectangles(random.nextFloat(), random.nextFloat(), random.nextInt(50), Rectangles.DIRECTION.RIGHT);
            actors.add(rectangles);
        }

        for (int i = 0; i < 10; i++) {
            Circle circle1 = new Circle();
            this.actors.add(circle1);
        }

        for (int i = 0; i < 10; i++) {
            Elipse elipse = new Elipse();
            this.actors.add(elipse);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Actor actor:this.actors) {
            actor.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Actor actor:this.actors) {
            actor.render(graphics);
        }

    }

    //region MAIN
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new RectanglesMoreAndMoreAndMore("RectangleGame"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    //endregion
}
