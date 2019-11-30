package u019.v1;

/**
 * Created by HuGuodong on 12/1/19.
 */
public abstract class Component {
  protected String name;
  public Component(String name){
    this.name = name;
  }

  public abstract void add(Component c);
  public abstract void remove(Component c);
  public abstract void display(int depth);
}
