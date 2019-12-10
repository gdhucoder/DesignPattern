package u028.v3;

import u013.PersonDirector;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class Man extends Person {

  @Override
  public void accept(Action visitor) {
    visitor.getManConclusion(this);
  }
}
