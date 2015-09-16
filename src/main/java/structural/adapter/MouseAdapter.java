package structural.adapter;

public class MouseAdapter implements TouchpadClicker {

  private MouseClicker mouseClicker;

  public MouseAdapter(MouseClicker mouseClicker) {
    this.mouseClicker = mouseClicker;
  }

  @Override
  public void click(int x, int y, double pressingForce) {
    mouseClicker.click(x, y);
  }
}
