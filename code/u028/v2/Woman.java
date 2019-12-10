package u028.v2;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class Woman extends Person {

  public Woman(String action) {
    super(action);
  }

  @Override
  public void getConclusion() {
    if (action.equals("succeed")) {
      System.out.printf("%s %s 时，背后大多又一个不成功的男人。\n", getClass().getSimpleName(), action);
    } else if (action.equals("fail")) {
      System.out.printf("%s %s 时，泪眼汪汪，谁也劝不了。\n", getClass().getSimpleName(), action);
    }
  }
}
