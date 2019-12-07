package u025;

/**
 * Created by HuGuodong on 12/8/19.
 */
public interface IChatRoom {
  void sendMessage(String msg, String userid);
  void addUser(User user);
}
