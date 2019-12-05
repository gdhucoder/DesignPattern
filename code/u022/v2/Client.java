package u022.v2;

/**
 * Created by HuGuodong on 12/5/19.
 */
public class Client {

  public static void main(String[] args) {
    Color red = new Red();
    Shape rec = new Rectangle(red);
    rec.draw();
  }
}
