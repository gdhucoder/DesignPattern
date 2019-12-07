package u024.v1;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Client {

  public static void main(String[] args) {
    Apply apply = new Apply(APPLY_TYPE.VOCATION, "vocation 10 days", 10);
    Manager manager = new Manager("BOB", LEVEL.MANAGER);
    Manager supervisor = new Manager("JOE", LEVEL.SUPERVISOR);
    Manager director = new Manager("BOSS", LEVEL.DIRECTOR);
    manager.dealApply(apply);
    supervisor.dealApply(apply);
    director.dealApply(apply);
//    I can not deal with it.
//    I can not deal with it.
//    Apply{applyType='VOCATION', applyContent='vocation 10 days', applyNum='10'} approved!
  }
}
