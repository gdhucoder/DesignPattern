package u028.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuGuodong on 12/10/19.
 */
class Client {
  private static final String SUCCESS ="success";
  private static final String FAIL ="fail";

  public static void main(String[] args) {
    List<Person> persons  = new ArrayList<>();
    Person man1 = new Man(SUCCESS);
    persons.add(man1);
    Person woman1 = new Woman(FAIL);
    persons.add(woman1);
    persons.forEach(p->{p.getConclusion();});

  }
}
