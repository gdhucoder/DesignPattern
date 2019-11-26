package u014.v4;

/**
 * Created by HuGuodong on 11/26/19.
 */
public class ConcreteObserver implements Observer {
  private ConcreteSubject subject;

  public ConcreteObserver(ConcreteSubject subject){
    this.subject = subject;
  }
  @Override
  public void update() {
    System.out.println(subject.getState());
  }
}
