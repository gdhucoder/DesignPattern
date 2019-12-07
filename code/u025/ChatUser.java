package u025;

/**
 * Created by HuGuodong on 12/8/19.
 */
public class ChatUser extends User {

  public ChatUser(IChatRoom room, String userId, String name) {
    super(room, userId, name);
  }

  @Override
  public void send(String msg, String toUserId) {
    System.out.printf("%s send message: %s\n", name, msg);
    mediator.sendMessage(msg, toUserId);
  }

  @Override
  public void receive(String msg) {
    System.out.println(name + " received: " + msg);
  }
}
