package structural.decorator;

public class DecoratorLoginUtil implements LoginUtil, CachedLoginUtil {

  private LoginUtil loginUtil;
  private String userId;

  public DecoratorLoginUtil(LoginUtil loginUtil) {
    this.loginUtil = loginUtil;
  }

  @Override
  public String authentication(String login, String password) {
    userId = loginUtil.authentication(login, password);
    return userId;
  }

  @Override
  public String getLastUserId() {
    return userId;
  }
}
