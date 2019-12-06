package u023.v1;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Client {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker();
    invoker.setCommand(command);
    invoker.executeCommand();
  }
}
