package u028.visitor;


/**
 * Created by HuGuodong on 12/10/19.
 */
class ConcreteElementA extends Element {

  @Override
  void accept(Visitor v) {
    v.visitConcreteElementA(this);
  }
}
