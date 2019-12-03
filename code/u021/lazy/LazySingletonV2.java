package u021.lazy;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class LazySingletonV2 {

  private static LazySingletonV2 instance = null;

  private LazySingletonV2() {}

  public static LazySingletonV2 getInstance() {
    if (instance == null) {
      synchronized (LazySingletonV2.class) {
        if (instance == null) {
          instance = new LazySingletonV2();
          // multi thread will generate two or more instances.
          System.out.println("instance address: " + instance);
        }
      }
    }
    return instance;
  }
}
