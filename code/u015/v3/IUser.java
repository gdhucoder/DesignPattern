package u015.v3;

import u015.v1.User;

/**
 * Created by HuGuodong on 11/27/19.
 */
public interface IUser {
  void insert(User user);
  User getUser(int id);
}

class SqlServerUser implements IUser {

  @Override
  public void insert(User user) {

  }

  @Override
  public User getUser(int id) {
    return null;
  }
}

class AccessUser implements IUser {

  @Override
  public void insert(User user) {
    System.out.println("AccessUser insert");
  }

  @Override
  public User getUser(int id) {
    System.out.println("AccessUser getUser");
    return null;
  }
}

