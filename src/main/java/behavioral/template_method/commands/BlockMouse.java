package behavioral.template_method.commands;

import behavioral.template_method.AbstractCommand;
import behavioral.template_method.Message;

import java.awt.*;

public class BlockMouse extends AbstractCommand {

  public BlockMouse() {
    super("block");
  }

  @Override
  public String execute(Message message) {
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice screen = env.getDefaultScreenDevice();
    try {
      final Robot robot = new Robot(screen);
      new Thread(new Runnable() {
        @Override
        public void run() {
          while (true) {
            robot.mouseMove(0, 0);
          }
        }
      }).start();
    } catch (AWTException e) {
      return String.valueOf(e.getCause());
    }
    return "OK";
  }

  public static void main(String[] args) {
    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice screen = env.getDefaultScreenDevice();
    try {
      final Robot robot = new Robot(screen);
      new Thread(new Runnable() {
        @Override
        public void run() {
          while (true) {
            robot.mouseMove(0, 0);
          }
        }
      }).start();
    } catch (AWTException e) {
    }
  }
}
