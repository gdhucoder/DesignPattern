package u023.v2;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class RemoteController {
  private ICommand command;
  public void setCommand(ICommand c){
    command = c;
  }

  public void buttonPressed(){
    command.execute();
  }
}
