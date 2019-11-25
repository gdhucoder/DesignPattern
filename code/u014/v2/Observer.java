package u014.v2;

/**
 * Created by HuGuodong on 11/25/19.
 */
abstract public class Observer {

  protected String name;
  protected Secretary sub;

  public Observer(String name, Secretary sub) {
    this.name = name;
    this.sub = sub;
  }
}
