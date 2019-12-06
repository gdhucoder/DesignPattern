package u023.v1;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Invoker {
  private Command command;


  /**
   * set concrete command
   * @param command
   */
  public void setCommand(Command command){
    this.command = command;
  }

  /**
   * execute concrete command
   */
  public void executeCommand(){
    command.execute();
  }
}
