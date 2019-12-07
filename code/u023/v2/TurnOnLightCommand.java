package u023.v2;


/**
 * Created by HuGuodong on 12/7/19.
 */
public class TurnOnLightCommand implements ICommand {

  private Light light;

  public TurnOnLightCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    System.out.println("TurnOnLightCommand");
    light.turnOn();
  }
}
