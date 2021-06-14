package at.rocketgame;


import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;

public class CanonBall implements Actor {
    private float x;
    private float y;
    private Shape collisionShape;

    public CanonBall(float x, float y) {
        this.x = x;
        this.y = y;
        this.collisionShape = new Circle(this.x,this.y,5);
    }

    @Override
    public void render(Graphics graphics) {
        graphics.fillOval(this.x, this.y, 10, 10);
        graphics.draw(this.collisionShape);
    }

    @Override
    public void update(GameContainer gameContainer, int delta) {
        this.y--;
        this.collisionShape.setCenterX(this.x+5);
        this.collisionShape.setCenterY(this.y+5);
    }
}
