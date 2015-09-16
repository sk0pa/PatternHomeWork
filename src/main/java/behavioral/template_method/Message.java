package behavioral.template_method;

import java.io.Serializable;
import java.util.Map;

public class Message implements Serializable {

  private String commandName;
  private Map<String, String> parameter;

  public String getCommandName() {
    return commandName;
  }

  public Message setCommandName(String commandName) {
    this.commandName = commandName;
    return this;
  }

  public Map<String, String> getParameter() {
    return parameter;
  }

  public Message setParameter(Map<String, String> parameter) {
    this.parameter = parameter;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Message message = (Message) o;

    if (commandName != null ? !commandName.equals(message.commandName) : message.commandName != null) {
      return false;
    }
    return !(parameter != null ? !parameter.equals(message.parameter) : message.parameter != null);

  }

  @Override
  public int hashCode() {
    int result = commandName != null ? commandName.hashCode() : 0;
    result = 31 * result + (parameter != null ? parameter.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Message{" +
           "commandName='" + commandName + '\'' +
           ", parameter=" + parameter +
           '}';
  }
}
