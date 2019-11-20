package u006;

/**
 * Created by HuGuodong on 11/20/19.
 */
public interface ICar {

  void makeOrder();
}

class ModelX implements ICar {

  @Override
  public void makeOrder() {
    System.out.println("A new order has been made. Car: " + this.getClass().getName());
  }
}

class BMW implements ICar {

  @Override
  public void makeOrder() {
    System.out.println("A new order has been made.Car: " + this.getClass().getName());
  }
}

abstract class CarDecorator implements ICar{

  protected ICar car;

  public CarDecorator(ICar car) {
    this.car = car;
  }

  public abstract void makeOrder();

}

class AudioDecorator extends CarDecorator {

  public AudioDecorator(ICar car) {
    super(car);
  }

  @Override
  public void makeOrder() {
    car.makeOrder();
    showAudioDevices();
  }

  public void showAudioDevices(){
    System.out.println("Audio devices are awesome.");
  }

}

class LeatherSeats extends CarDecorator {

  public LeatherSeats(ICar car) {
    super(car);
  }

  @Override
  public void makeOrder() {
    car.makeOrder();
    addLeatherSeats();
  }

  private void addLeatherSeats(){
    System.out.println("Leather seats have been added.");
  }
}
