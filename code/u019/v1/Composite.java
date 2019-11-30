package u019.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 12/1/19.
 */
public class Composite extends Component {

  List<Component> children = new ArrayList<>();

  public Composite(String name) {
    super(name);
  }

  @Override
  public void add(Component c) {
    children.add(c);
  }

  @Override
  public void remove(Component c) {
    children.remove(c);
  }

  @Override
  public void display(int depth) {
    System.out.println("-".repeat(depth) + name);
    children.forEach(component -> {
      component.display(depth + 2);
    });
  }
}
