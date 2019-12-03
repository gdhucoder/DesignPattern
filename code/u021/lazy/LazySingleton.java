package u021.lazy;

/**
 * Created by HuGuodong on 12/3/19.
 */
public final class LazySingleton {

  private static volatile LazySingleton instance = null;

  private LazySingleton() {
//    System.out.println("instance address: " + instance);
  }

  public static LazySingleton getInstance() {
    if (instance == null) {
      synchronized (LazySingleton.class) { // lock
        instance = new LazySingleton();
        // multi thread will generate two or more instances.
        System.out.println("instance address: " + instance);
      }
    }
    // System.out.println("instance address: " + instance);
    return instance;
  }
}
