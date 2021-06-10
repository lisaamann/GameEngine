package at.la.games.firstgame;

import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RectanglesMoreAndMoreAndMore extends BasicGame {
    private ArrayList<Rectangles> rectangles1;

    private RectanglesMoreAndMoreAndMore(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Rectangles rectangles = new Rectangles(random.nextFloat(), random.nextFloat(), random.nextInt(50));
            rectangles1.add(rectangles);
        }
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        for (Rectangles rectangle:this.rectangles1) {
            rectangle.update(delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        for (Rectangles rectangle:this.rectangles1) {
            rectangle.render(graphics);
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
