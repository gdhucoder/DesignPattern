package u014.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 11/24/19.
 */
public class Secretary {
  private List<StockObserver> observers = new ArrayList<>();
  public String action;

  public void attach(StockObserver observer){
    observers.add(observer);
  }

  public void notifyObs(){
    observers.forEach(StockObserver::update);
  }

}
