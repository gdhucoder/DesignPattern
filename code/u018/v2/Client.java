package u018.v2;

/**
 * Created by HuGuodong on 11/30/19.
 */
public class Client {

  public static void main(String[] args) {
    // create memento
    // recover state
    Originator o = new Originator();
    o.setState("init state");
    o.show();

    // save memento
    Caretaker c = new Caretaker();
    // set
    c.setMemento(o.createMemento()); // createMemento

    o.setState("state changed");
    o.show();

    // recover state by c.get memento
    o.recover(c.getMemento());
    o.show();

//    Originator{state='init state'}
//    Originator{state='state changed'}
//    using memento to recover state
//    Originator{state='init state'}
  }
}
