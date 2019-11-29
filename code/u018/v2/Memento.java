package u018.v2;

/**
 * Created by HuGuodong on 11/30/19.
 */
public class Memento {

  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
