package u014.v3;

/**
 * Created by HuGuodong on 11/25/19.
 */
abstract public class Observer {

  protected String name;
  protected Subject sub;

  public Observer(String name, Subject sub) {
    this.name = name;
    this.sub = sub;
  }
  public abstract void update();
}
