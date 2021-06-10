package at.la.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsGame extends BasicGame {
    private Rectangles rectangles;
    private Rectangles rectangles2;

    public ObjectsGame(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.rectangles = new Rectangles(200, 200, 5.0f);
        this.rectangles2 = new Rectangles(50, 50, 5.0f);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        this.rectangles.update(delta);
        this.rectangles2.update(delta);
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