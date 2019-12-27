package u028.v3;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class Woman extends Person {

  /**
   * accept 状态
   * @param visitor
   */
  @Override
  public void accept(Action visitor) {
    visitor.getWomanConclusion(this);
  }
}
