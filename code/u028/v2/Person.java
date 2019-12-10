package u028.v2;

/**
 * Created by HuGuodong on 12/10/19.
 */
abstract class Person {
  protected String action;
  public Person(String action){
    this.action = action;
  }

  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }
  public abstract void getConclusion();
}
