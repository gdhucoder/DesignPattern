package u021.v1;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class FooV2 {

  private static FooV2 instance;

  private FooV2() {}

  public static FooV2 getInstance2() {
    if (instance == null) {
      synchronized (FooV2.class) {
        if (instance == null) {
          instance = new FooV2();
        }
      }
    }
    return instance;
  }

  public static void main(String[] args) {

  }
}
