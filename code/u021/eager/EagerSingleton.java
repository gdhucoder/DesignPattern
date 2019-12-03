package u021.eager;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class EagerSingleton {

  private static volatile EagerSingleton instance = new EagerSingleton();

  public static EagerSingleton getInstance() {
    return instance;
  }

  private EagerSingleton() {
    System.out.printf("%s Instance Created!\n", this.getClass().getSimpleName());
  }
}
