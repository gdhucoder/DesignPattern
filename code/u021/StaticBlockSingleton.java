package u021;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class StaticBlockSingleton {

  private static final StaticBlockSingleton instance;

  static {
    instance = new StaticBlockSingleton();
  }

  private StaticBlockSingleton() {}

  public static StaticBlockSingleton getInstance() {
    return instance;
  }

}
