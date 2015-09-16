package creational.factory_method;

public class OutsideMagicFlowerbed implements MagicFlowerbed {

  public Flower getFlower() {
    return new Rose("Beautiful", "Red");
  }
}
