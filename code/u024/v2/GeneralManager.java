package u024.v2;

import u024.v1.APPLY_TYPE;
import u024.v1.Apply;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class GeneralManager extends Manager {

  public GeneralManager(String name) {
    super(name);
  }

  @Override
  public void HandleApplication(Apply apply) {
    if(apply.getApplyType()== APPLY_TYPE.VOCATION && apply.getApplyNum()<=10){
      System.out.println(apply +" is approved!");
    }else if(apply.getApplyType()==APPLY_TYPE.SALARY_RAISE && apply.getApplyNum()<=500){
      System.out.println(apply +" is approved!");
    }else{
      System.out.println("APPLY NOT PASS.");
    }
  }
}
