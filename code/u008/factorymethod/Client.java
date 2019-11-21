package u008.factorymethod;

/**
 * Created by HuGuodong on 11/21/19.
 */
public class Client {

  public static void main(String[] args) {
    IOperationFactory operationFactory = new AddFactory();
    Operation oper = operationFactory.createOperation();
    oper.numA = 10;
    oper.numB = 15;
    System.out.println(oper.getResult());
  }
}
