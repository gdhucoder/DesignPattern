package u021;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class BillPughSingleton {

  public static int NUM = 10;

  private BillPughSingleton() {
    System.out.println("create singleton.");
  }

  private static class LazyHolder {

    static {
      System.out.println("create class LazyHolder...");
    }

    private static final BillPughSingleton instance = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return LazyHolder.instance;
  }
}
