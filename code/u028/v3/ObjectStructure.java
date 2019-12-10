package u028.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class ObjectStructure {
  private List<Person> elements = new ArrayList<>();

  public void add(Person p){
    elements.add(p);
  }

  public void remove(Person p){
    elements.remove(p);
  }

  public void display(Action visitor){
    for(Person p : elements){
      p.accept(visitor);
    }
  }

}
