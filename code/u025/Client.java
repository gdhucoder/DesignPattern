package u025;

/**
 * Created by HuGuodong on 12/8/19.
 */
public class Client {

  public static void main(String[] args) {
    IChatRoom room = new ChatRoom();
    User chatUser1 = new ChatUser(room, "1", "Bob");
    User chatUser2 = new ChatUser(room, "2", "Kevin");
    User chatUser3 = new ChatUser(room, "3", "Joe");

    room.addUser(chatUser1);
    room.addUser(chatUser2);
    room.addUser(chatUser3);

    chatUser1.send("Hello Kevin", "2");
    chatUser2.send("今天去哪吃呀？","1");
//    Bob send message: Hello Kevin
//    Kevin received: Hello Kevin
//    Kevin send message: 今天去哪吃呀？
//    Bob received: 今天去哪吃呀？

  }
}
