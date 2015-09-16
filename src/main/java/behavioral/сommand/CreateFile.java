package behavioral.ñommand;

import java.io.File;
import java.io.IOException;

public class CreateFile implements Command {

  private String path;

  public CreateFile(String path) {
    this.path = path;
  }

  @Override
  public void execute() {
    try {
      new File(path).createNewFile();
    } catch (IOException e) {
      throw new IllegalStateException(e);
    }
  }
}
