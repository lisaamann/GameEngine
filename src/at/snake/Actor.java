package at.snake;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public interface Actor {
    public void render(GameContainer gameContainercontainer, Graphics graphics);
    public void update(int delta);
}
