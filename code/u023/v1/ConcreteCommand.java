package u023.v1;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class ConcreteCommand implements Command {
  private Receiver receiver;
  public ConcreteCommand(Receiver receiver){
    this.receiver = receiver;
  }
  @Override
  public void execute() {
    receiver.doAction();
    System.out.println("execute concrete command");
  }
}
