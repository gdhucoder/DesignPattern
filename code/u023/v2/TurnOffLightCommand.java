package u023.v2;


/**
 * Created by HuGuodong on 12/7/19.
 */
public class TurnOffLightCommand implements ICommand {

  private Light light;

  public TurnOffLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("TurnOffLightCommand");
    light.turnOff();
  }
}
