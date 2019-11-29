package u017.v1;

/**
 * Created by HuGuodong on 11/29/19.
 */
public class Adapter extends Target {
  private Adaptee adaptee = new Adaptee();
  @Override
  void request() {
    System.out.println("Adapter.");
    adaptee.specificRequest();
  }
}
