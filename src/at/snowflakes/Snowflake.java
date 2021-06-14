package at.snowflakes;

import at.la.games.firstgame.Actor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import java.util.Random;

public class Snowflake implements Actor {
    private Image snowflakeImage;
    public enum SIZE {SMALL, MEDIUM, LARGE};
    private float x;
    private float y;
    private float speed;
    private int diameter;
    public SIZE size;

    public Snowflake(SIZE size) throws SlickException {
        Random random = new Random();
        this.x = random.nextInt(800);
        this.y = random.nextInt(600);
        this.speed = random.nextInt(40) + 10;
        this.diameter = 20;
        this.size = size;
        Image temp = new Image("testdata/snowflake.png");
        this.snowflakeImage = temp.getScaledCopy(getImageSize(size), getImageSize(size));
    }

    private int getImageSize(SIZE size) {
        if (size == SIZE.LARGE) {
            return 60;
        } if (size == SIZE.MEDIUM){
            return 40;
        }if (size==SIZE.SMALL){
            return 20;
        }
        else return 0;
    }

    public void update(GameContainer gameContainer, int delta) {
        this.y += (float) delta / this.speed;
        if (this.y > 600) {
            this.y = 0;
        }
    }

    public void render(Graphics graphics) {
        if (this.size.equals(SIZE.SMALL)) {
            //graphics.drawOval(this.x, this.y, 10, 10);
            snowflakeImage.draw(this.x, this.y);
            snowflakeImage.getScaledCopy(getImageSize(SIZE.SMALL));
            this.speed = 10.0f;
        }
        if (this.size.equals(SIZE.MEDIUM)) {
            //graphics.drawOval(this.x, this.y, 20, 20);
            snowflakeImage.draw(this.x, this.y);
            snowflakeImage.getScaledCopy(getImageSize(SIZE.SMALL));
            this.speed = 5.0f;
        }
        if (this.size.equals(SIZE.LARGE)) {
            //graphics.drawOval(this.x, this.y, 30, 30);
            snowflakeImage.draw(this.x, this.y);
            snowflakeImage.getScaledCopy(getImageSize(SIZE.SMALL));
            this.speed = 2.5f;
        }
        //snowflakeImage.draw(this.x,this.y);
    }
}
