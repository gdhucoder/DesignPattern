package u014.v4;

/**
 * Created by HuGuodong on 11/26/19.
 */
public class Client {

  public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();
    subject.attach(new ConcreteObserver(subject)); // ConcreteObserver has a reference to a concrete subject
    subject.attach(new ConcreteObserver(subject));
    subject.setState("update state");
    subject.notifyObs();
//    update state
//    update state
  }
}
