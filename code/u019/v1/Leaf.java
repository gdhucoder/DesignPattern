package u019.v1;

/**
 * Created by HuGuodong on 12/1/19.
 */
public class Leaf extends Component {

  public Leaf(String name) {
    super(name);
  }

  @Override
  public void add(Component c) {
    throw new UnsupportedOperationException("Can not add to a leaf.");
  }

  @Override
  public void remove(Component c) {
    throw new UnsupportedOperationException("Can not remove from leaf.");
  }

  @Override
  public void display(int depth) {
    System.out.println("-".repeat(depth) + name);
  }
}
