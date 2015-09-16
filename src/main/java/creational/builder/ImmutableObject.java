package creational.builder;

public class ImmutableObject {

  private final int firstField;
  private final int secondField;

  private ImmutableObject(int firstField, int secondField) {
    this.firstField = firstField;
    this.secondField = secondField;
  }

  public int getFirstField() {
    return firstField;
  }

  public int getSecondField() {
    return secondField;
  }

  public static class ImmutableObjectBuilder {

    private int firstField;
    private int secondField;

    public ImmutableObjectBuilder setFirstField(int firstField) {
      this.firstField = firstField;
      return this;
    }

    public ImmutableObjectBuilder setSecondField(int secondField) {
      this.secondField = secondField;
      return this;
    }

    public int getFirstField() {
      return firstField;
    }

    public int getSecondField() {
      return secondField;
    }

    public ImmutableObject build() {
      return new ImmutableObject(firstField, secondField);
    }
  }
}
