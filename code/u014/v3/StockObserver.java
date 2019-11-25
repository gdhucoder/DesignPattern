package u014.v3;

/**
 * Created by HuGuodong on 11/25/19.
 */
public class StockObserver extends Observer {
  public StockObserver(String name, Subject sub){
    super(name, sub);
  }
  @Override
  public void update() {
    System.out.printf("%s, %s 关闭股票行情，继续工作！\n", sub.getAction(), name);
  }
}
