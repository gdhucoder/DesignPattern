package u008.simplefactory;

/**
 * Created by HuGuodong on 11/21/19.
 */
public class Client {

  public static void main(String[] args) {
    Operate op = OperateFactory.createOperate("+");
    op.numA = 100;
    op.numB = 200;
    double ans = op.getResult();
    System.out.printf("%.2f\n", ans); // 300

    // IllegalArgumentException: not implemented yet
//    op = OperateFactory.createOperate("-");
    op = OperateFactory.createOperate("*");
    op.numA = 100;
    op.numB = 0.33;

    ans = op.getResult();
    System.out.printf("%.2f\n", ans); // 33.00

  }
}
