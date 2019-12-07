package u024.v2;

import u024.v1.APPLY_TYPE;
import u024.v1.Apply;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Client {

  public static void main(String[] args) {
    Apply apply = new Apply(APPLY_TYPE.VOCATION,"vocation 20 days", 20);

    Manager wang = new CommonManager("Wang");
    Manager boss = new GeneralManager("BOB");
    wang.setSuperior(boss);

    wang.HandleApplication(apply);//APPLY NOT PASS.
  }
}
