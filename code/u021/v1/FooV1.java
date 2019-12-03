package u021.v1;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class FooV1 {

  private static FooV1 instance;

  private FooV1() {}

  // correct but expensive in multi threaded version
  public static synchronized FooV1 getInstance() {
    if (instance == null) {
      instance = new FooV1();
    }
    return instance;
  }

}
