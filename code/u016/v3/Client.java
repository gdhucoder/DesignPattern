package u016.v3;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class Client {

  public static void main(String[] args) {
    Work w = new Work();
    w.setHour(14);
    w.writeProgram();
    w.setHour(11);
    w.writeProgram();
  }
}
