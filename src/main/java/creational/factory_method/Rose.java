package creational.factory_method;

public class Rose implements Flower {

  public String smell;
  public String colour;

  public Rose(String smell, String colour) {
    this.smell = smell;
    this.colour = colour;
  }

  public String getSmell() {
    return smell;
  }

  public void setSmell(String smell) {
    this.smell = smell;
  }

  public String getColour() {
    return colour;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }
}
