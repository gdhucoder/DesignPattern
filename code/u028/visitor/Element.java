package u028.visitor;

import java.util.Vector;

/**
 * Created by HuGuodong on 12/10/19.
 */
abstract public class Element {
  abstract void accept(Visitor v);
}
