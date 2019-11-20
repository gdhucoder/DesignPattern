package u006;

/**
 * Created by HuGuodong on 11/20/19.
 */
public class Client {

  public static void main(String[] args) {
    ICar bmw = new BMW();
    bmw.makeOrder();
//    A new order has been made.Car: u006.BMW

    // decorate
    ICar bmw_leather = new LeatherSeats(bmw);
    ICar bmw_addAudio = new AudioDecorator(bmw_leather);
    bmw_addAudio.makeOrder();
//    A new order has been made.Car: u006.BMW
//    Leather seats have been added.
//    Audio devices are awesome.

    ICar modelX = new ModelX();
    modelX.makeOrder();
//    A new order has been made. Car: u006.ModelX

    // decorate
    ICar modelX_audio = new AudioDecorator(modelX);
    modelX_audio.makeOrder();
//    A new order has been made. Car: u006.ModelX
//    Audio devices are awesome.

  }
}
