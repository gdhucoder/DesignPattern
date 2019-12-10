package u028.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 12/10/19.
 */
class ObjectStructure {

  private List<Element> elements = new ArrayList<>();

  public void add(Element e) {
    elements.add(e);
  }

  public void remove(Element e) {
    elements.remove(e);
  }

  public void accept(Visitor v) {
    elements.forEach(e -> e.accept(v));
  }
}
