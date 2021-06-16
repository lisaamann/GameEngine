package at.rocketgame;


import org.newdawn.slick.*;

import java.util.ArrayList;
import java.util.Random;

public class RocketGameMain extends BasicGame {
    private RocketObject rocketObject;
    private ArrayList<Actor> enemys;


    public RocketGameMain(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.enemys = new ArrayList<>();
        Random random = new Random();
        this.rocketObject = new RocketObject();
        for (int i = 0; i < 5; i++) {
            Enemy enemy = new Enemy();
            this.enemys.add(enemy);
            this.rocketObject.addCollisionPartner(enemy);
        }
        this.enemys.add(rocketObject);

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        for (Actor actor:this.enemys) {
            actor.update(gameContainer, delta);
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        for (Actor actor:this.enemys) {
            actor.render(graphics);
        }

    }

    @Override
    public void keyPressed(int key, char c) {


        if (key == Input.KEY_SPACE) {
            CanonBall canonBall = new CanonBall(this.rocketObject.getX(),this.rocketObject.getY());
            this.enemys.add(canonBall);
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
