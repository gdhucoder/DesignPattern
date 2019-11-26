package u015.v2;

import u015.v1.User;

/**
 * Created by HuGuodong on 11/27/19.
 */
public class Client {

  public static void main(String[] args) {
    User user = new User();
    IFactory factory = new AccessFactory();
    IUser u = factory.createUser();
    u.insert(user);
    u.getUser(1);
//    Create AccessFactory -> createUser
//    AccessUser insert
//    AccessUser getUser
  }
}
