package u024.v1;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Manager {

  private String name;
  private LEVEL level;

  public Manager(String name, LEVEL level) {
    this.name = name;
    this.level = level;
  }

  public void dealApply(Apply apply) {
    if (level == LEVEL.MANAGER) {
      if (apply.getApplyType() == APPLY_TYPE.VOCATION
          && apply.getApplyNum() <= 2) {
        System.out.println(apply.toString() + " approved!");
      } else {
        System.out.println("I can not deal with it.");
      }
    } else if (level == LEVEL.SUPERVISOR) {
      if (apply.getApplyType() == APPLY_TYPE.VOCATION
          && apply.getApplyNum() <= 5) {
        System.out.println(apply.toString() + " approved!");
      } else {
        System.out.println("I can not deal with it.");
      }
    } else if (level == LEVEL.DIRECTOR) {
      if (apply.getApplyType() == APPLY_TYPE.VOCATION
          && apply.getApplyNum() <= 10) {
        System.out.println(apply.toString() + " approved!");
      } else {
        System.out.println("I can not deal with it.");
      }
    } else {
      throw new RuntimeException("legal apply");
    }



  }
}
