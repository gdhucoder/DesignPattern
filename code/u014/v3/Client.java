package u014.v3;

/**
 * Created by HuGuodong on 11/25/19.
 */
public class Client {

  public static void main(String[] args) {
    Subject sub = new Secretary();

    Observer observer1 = new StockObserver("Ming", sub);
    Observer nbaObserver2 = new NBAObserver("Joe", sub);
    sub.setAction("Boss is coming");

    sub.attach(observer1);
    sub.attach(nbaObserver2);
    sub.detach(observer1);
    sub.notifyObs();
//    Boss is coming, Joe 关闭NBA，继续工作！


  }
}
