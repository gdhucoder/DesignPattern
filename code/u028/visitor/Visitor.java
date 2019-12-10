package u028.visitor;

/**
 * Created by HuGuodong on 12/10/19.
 */
abstract public class Visitor {
  abstract void visitConcreteElementA(ConcreteElementA a);
  abstract void visitConcreteElementB(ConcreteElementB b);
}
