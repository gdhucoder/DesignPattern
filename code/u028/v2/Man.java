package u028.v2;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class Man extends Person {

  public Man(String action) {
    super(action);
  }

  @Override
  public void getConclusion() {
    if (action.equals("success")) {
      System.out.printf("%s %s 时，背后多半有一个伟大的女人\n", getClass().getSimpleName(), action);
    } else if (action.equals("fail")) {
      System.out.printf("%s %s 时，闷头喝闷酒，谁也不用劝。\n", getClass().getSimpleName(), action);
    }
  }
}
