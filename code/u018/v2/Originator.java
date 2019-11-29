package u018.v2;

/**
 * Created by HuGuodong on 11/30/19.
 */
public class Originator {
  private String state;
  public Memento createMemento(){
    return new Memento(state);
  }

  public void show(){
    System.out.println(toString());
  }


  public void recover(Memento memento){
    System.out.println("using memento to recover state");
    state = memento.getState();
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return "Originator{" +
        "state='" + state + '\'' +
        '}';
  }
}
