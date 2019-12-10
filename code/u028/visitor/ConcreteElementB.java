package u028.visitor;

import java.util.Vector;

/**
 * Created by HuGuodong on 12/10/19.
 */
class ConcreteElementB extends Element {

  @Override
  void accept(Visitor v) {
    v.visitConcreteElementB(this);
  }
}
