package at.la.games.firstgame;

import org.newdawn.slick.*;

public class ObjectsMain extends BasicGame {
    private enum DIRECTION {RIGHT, LEFT, UP, DOWN};

    private float xRectangle;
    private float yRectangle;
    private DIRECTION rectangleDirection;

    private float xCircle;
    private float yCircle;
    private DIRECTION circleDirection;

    private float xOval;
    private float yOval;
    private DIRECTION ovalDircetion;

    private float speed;


    public ObjectsMain(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        this.xRectangle = 100;
        this.speed = 2.0f;
        this.rectangleDirection = DIRECTION.RIGHT;

        this.yCircle = 50;
        this.circleDirection = DIRECTION.DOWN;

        this.xOval = 50;
        this.ovalDircetion = DIRECTION.RIGHT;
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        if (this.circleDirection == DIRECTION.DOWN) {
            this.yCircle += (float) delta / this.speed;
            if (this.yCircle > 500) {
                this.circleDirection = DIRECTION.UP;
            }
        }else {
            this.yCircle-= (float) delta/this.speed;
            if (this.yCircle<100){
                this.circleDirection= DIRECTION.DOWN;
            }
        }
        if (this.ovalDircetion==DIRECTION.RIGHT){
            this.xOval += (float) delta/this.speed;
            if (this.xOval>600){
                this.ovalDircetion= DIRECTION.LEFT;
            }
        }else {
            this.xOval-= (float) delta/this.speed;
            if (this.xOval<50){
                this.ovalDircetion = DIRECTION.RIGHT;
            }
        }
        if (rectangleDirection==DIRECTION.RIGHT){
            this.xRectangle += (float) delta/this.speed;
            if (this.xRectangle>600){
                rectangleDirection = DIRECTION.DOWN;
            }
        }else if (rectangleDirection ==DIRECTION.DOWN){
            this.yRectangle += (float) delta/this.speed;
            if (this.yRectangle>400){
                rectangleDirection = DIRECTION.LEFT;
            }
        }else if (rectangleDirection == DIRECTION.LEFT){
            this.xRectangle -= (float) delta/this.speed;
            if (this.xRectangle<100){
                this.rectangleDirection = DIRECTION.UP;
            }
        }else {
            this.yRectangle -= (float) delta/this.speed;
            if (this.yRectangle<100){
                this.rectangleDirection = DIRECTION.RIGHT;
            }
        }
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        graphics.drawRect(this.xRectangle,this.yRectangle,70, 70);
        graphics.drawOval(this.xCircle,this.yCircle, 50, 50);
        graphics.drawOval(this.xOval,this.yOval,50, 20);

    }
    //region MAIN
    public static void main(String[] argv) {
        try {
            AppGameContainer container = new AppGameContainer(new ObjectsMain("Objects"));
            container.setDisplayMode(800, 600, false);
            container.setTargetFrameRate(60);
            container.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
    //endregion
}

