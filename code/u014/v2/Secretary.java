package u014.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 11/25/19.
 */
public class Secretary {
  private List<Observer> observers = new ArrayList<>();

  public String action;

  public void attach(Observer observer){
    observers.add(observer);
  }

  public void detach(Observer observer){
    observers.remove(observer);
  }

  public void notifyObs(){
    observers.forEach(Observer::update);
  }
}
