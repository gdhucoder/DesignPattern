package u021.seri;

import java.io.Serializable;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class DemoSingleton implements Serializable {

  private static final long serialVersionUID = 1L;

  private static volatile DemoSingleton instance = null;

  public static DemoSingleton getInstance() {
    if (instance == null) {
      instance = new DemoSingleton();
    }
    return instance;
  }

  private int i = 10;

  // return existing instance.
//  protected Object readResolve(){
//    return instance;
//  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  private int j = 100;
  private  int k = 200;
}
