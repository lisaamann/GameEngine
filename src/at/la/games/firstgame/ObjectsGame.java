package at.la.games.firstgame;

import at.rocketgame.RocketObject;
import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangles rectangles;
    private Rectangles rectangles2;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles = new Rectangles(200f, 200f, 5.0f, Rectangles.DIRECTION.LEFT);
        this.rectangles2 = new Rectangles(50.0f, 50.0f, 5.0f, Rectangles.DIRECTION.LEFT);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangles.update(gameContainer, delta);
        this.rectangles2.update(gameContainer, delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        this.rectangles.render(graphics);
        this.rectangles2.render(graphics);
    }



    //region MAIN
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsGame("ObjectGames"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    //endregion
}
