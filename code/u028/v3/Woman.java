package u028.v3;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class Woman extends Person {

  @Override
  public void accept(Action visitor) {
    visitor.getWomanConclusion(this);
  }
}
