package u016.v2;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class Context {

  private State state;

  public Context(State state) {
    this.state = state;
  }

  public void setState(State state) {
    this.state = state;
    System.out.println("state updates");
  }

  public State getState() {
    return this.state;
  }

  public void request() {
    state.handle(this);
  }
}
