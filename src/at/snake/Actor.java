package at.snake;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void update(GameContainer container, Graphics graphics);
    public void render(int delta);
}
