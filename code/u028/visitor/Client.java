package u028.visitor;

/**
 * Created by HuGuodong on 12/10/19.
 */
class Client {

  public static void main(String[] args) {
    ObjectStructure o = new ObjectStructure();
    o.add(new ConcreteElementA());
    o.add(new ConcreteElementB());

    Visitor v = new ConcreteVisitorA();
    o.accept(v);
//    visit concrete a
//    visit concrete b
  }
}
