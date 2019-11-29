package u018.v1;

/**
 * Created by HuGuodong on 11/30/19.
 */
public class Client {

  public static void main(String[] args) {
    GameRole role = new GameRole(100,100,100); // current state
    GameRole backRole = new GameRole(role);
    role.showState();
    role.die(); // state changes
    role.showState();

    role.loadState(backRole); // recover state
    role.showState();

//    GameRole{life=100, atk=100, def=100}
//    GameRole{life=0, atk=0, def=0}
//    GameRole{life=100, atk=100, def=100}

  }
}
