package u023.v2;

/**
 * Created by HuGuodong on 12/7/19.
 */
public class Client {

  public static void main(String[] args) {

    Light light = new Light(); // receiver

    RemoteController controller = new RemoteController(); // invoker

    controller.setCommand(new TurnOnLightCommand(light));
    controller.buttonPressed();

    controller.setCommand(new TurnOffLightCommand(light)); // set new command
    controller.buttonPressed();
//    output
//    TurnOnLightCommand
//    light is on
//    TurnOffLightCommand
//    light is off
  }
}
