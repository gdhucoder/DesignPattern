package u021;

/**
 * Created by HuGuodong on 12/3/19.
 */
public final class LazySingleton {

  private static volatile LazySingleton instance = null;

  private LazySingleton() {
  }

  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) { // lock
        instance = new LazySingleton();
        System.out.println("instance address: " + instance);
      }
    }
    System.out.println("instance address: " + instance);
    return instance;
  }
}
