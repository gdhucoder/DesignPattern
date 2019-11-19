package u007;

/**
 * Created by HuGuodong on 11/19/19.
 */
public class Client {

  public static void main(String[] args) {
      Proxy xiao_gang = new Proxy(new Pursuit("Lovely Girl"));
      xiao_gang.sendFlower();
      xiao_gang.sendChocolate();
      xiao_gang.sendDoll();
//    Lovely Girl, here is your flower.
//    Lovely Girl, here is your chocolate.
//    Lovely Girl, here is your doll.
  }
}
