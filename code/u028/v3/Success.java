package u028.v3;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class Success extends Action {

  @Override
  public void getManConclusion(Man concreteElementA) {
    System.out.printf("%s %s 时，背后大多有一个成功的女人。\n", concreteElementA.getClass().getSimpleName(), getClass().getSimpleName());
  }

  @Override
  public void getWomanConclusion(Woman concreteElementB) {
    System.out.printf("%s %s 时，背后大多又一个不成功的男人。\n", concreteElementB.getClass().getSimpleName(), getClass().getSimpleName());
  }
}
