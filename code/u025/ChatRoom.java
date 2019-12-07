package u025;

import java.util.HashMap;
import java.util.Map;
import u023.v2.ICommand;

/**
 * Created by HuGuodong on 12/8/19.
 */
public class ChatRoom implements IChatRoom {

  private Map<String, User> userMap = new HashMap<>();

  @Override
  public void sendMessage(String msg, String userid) {
    User user = userMap.get(userid);
    user.receive(msg);
  }

  @Override
  public void addUser(User user) {
    userMap.put(user.getId(), user);
  }
}
