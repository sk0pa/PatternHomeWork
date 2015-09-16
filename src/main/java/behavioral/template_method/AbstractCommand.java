package behavioral.template_method;

public abstract class AbstractCommand {

  public String commandName;

  public AbstractCommand(String commandName) {
    this.commandName = commandName;
  }

  public abstract String execute(Message message);

  public void check(Message message) {
    if (commandName.equals(message.getCommandName())) {
      execute(message);
    }
  }
}
