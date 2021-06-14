package at.rocketgame;

import at.la.games.firstgame.Actor;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.*;

public class RocketGameMain extends BasicGame {
    private RocketObject raketchen;

    public RocketGameMain(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        RocketObject rocketObject = new RocketObject();

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        raketchen.update(gameContainer, delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        raketchen.render(graphics);
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
