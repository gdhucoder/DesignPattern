package u014.v2;

/**
 * Created by HuGuodong on 11/25/19.
 */
public class Client {

  public static void main(String[] args) {
    Secretary sub = new Secretary();

    Observer observer1 = new StockObserver("Ming", sub);
    Observer nbaObserver2 = new NBAObserver("Joe", sub);
    sub.action = "Boss is coming";

    sub.attach(observer1);
    sub.attach(nbaObserver2);
    sub.notifyObs();
//    Boss is coming, Ming 关闭股票行情，继续工作！
//    Boss is coming, Joe 关闭NBA，继续工作！

  }
}
