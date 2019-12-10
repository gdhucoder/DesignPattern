package u028.visitor;

/**
 * Created by HuGuodong on 12/10/19.
 */
public class ConcreteVisitorA  extends Visitor {

  @Override
  void visitConcreteElementA(ConcreteElementA a) {
    System.out.println("visit concrete a");
  }

  @Override
  void visitConcreteElementB(ConcreteElementB b) {
    System.out.println("visit concrete b");
  }
}
