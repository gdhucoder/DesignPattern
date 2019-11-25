package u014.v1;

/**
 * Created by HuGuodong on 11/24/19.
 */
public class Client {

  public static void main(String[] args) {
    Secretary notifier = new Secretary();

    StockObserver observer1 = new StockObserver("xiaoming", notifier);
    StockObserver observer2 = new StockObserver("xiaoqiang", notifier);

    notifier.attach(observer1);
    notifier.attach(observer2);

    notifier.action = "Boss is coming";
    notifier.notifyObs();
//
//    Boss is coming, xiaoming 关闭股票行情，继续工作！
//    Boss is coming, xiaoqiang 关闭股票行情，继续工作！
  }
}
