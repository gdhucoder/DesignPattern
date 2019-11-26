package u015.v1;

/**
 * Created by HuGuodong on 11/27/19.
 */
public class Client {

  public static void main(String[] args) {
    User user = new User();
    SqlServerUser server = new SqlServerUser();
    server.insert(user);
    server.getUser(1);
//    add a new user.
//    find a user.
  }
}
