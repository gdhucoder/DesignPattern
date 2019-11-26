package u014.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 11/26/19.
 */
public class ConcreteSubject implements Subject {
  private List<Observer> observers = new ArrayList<>();
  private String state;

  public void setState(String state){
    this.state = state;
  }
  public String getState(){
    return state;
  }
  @Override
  public void attach(Observer obs) {
    observers.add(obs);
  }

  @Override
  public void detach(Observer obs) {
    observers.remove(obs);
  }

  @Override
  public void notifyObs() {
    observers.forEach(Observer::update);
  }
}
