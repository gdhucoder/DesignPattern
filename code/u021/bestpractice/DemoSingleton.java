package u021.bestpractice;

import java.io.Serializable;

/**
 * Created by HuGuodong on 12/4/19.
 */
public class DemoSingleton implements Serializable {

  private static final long serialVersionUID = 1L;

  private DemoSingleton() {}

  private static class DemoSingletonHolder {

    private static final DemoSingleton instance = new DemoSingleton();
  }

  public static DemoSingleton getInstance() {
    return DemoSingletonHolder.instance;
  }

  protected Object readResolve() {
    return getInstance();
  }
}
