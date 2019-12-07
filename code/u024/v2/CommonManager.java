package u024.v2;

import u024.v1.APPLY_TYPE;
import u024.v1.Apply;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class CommonManager extends Manager {

  public CommonManager(String name){
    super(name);
  }

  @Override
  public void HandleApplication(Apply apply) {
    if(apply.getApplyType()== APPLY_TYPE.VOCATION && apply.getApplyNum()<=2){
      System.out.println(apply +" is approved!");
    }else{
      if(superior!=null){
        superior.HandleApplication(apply);
      }
    }
  }
}
