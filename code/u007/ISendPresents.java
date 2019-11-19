package u007;

/**
 * Created by HuGuodong on 11/19/19.
 */
public interface ISendPresents {

  void sendFlower();

  void sendDoll();

  void sendChocolate();
}

class Pursuit implements ISendPresents {

  private String girlName;

  public Pursuit(String name) {
    this.girlName = name;
  }

  @Override
  public void sendFlower() {
    System.out.printf("%s, here is your flower.\n", girlName);
  }

  @Override
  public void sendDoll() {
    System.out.printf("%s, here is your doll.\n", girlName);
  }

  @Override
  public void sendChocolate() {
    System.out.printf("%s, here is your chocolate.\n", girlName);
  }
}

class Proxy implements ISendPresents {

  private Pursuit p;

  public Proxy(Pursuit p) {
    this.p = p;
  }

  @Override
  public void sendFlower() {
    p.sendFlower();
  }

  @Override
  public void sendDoll() {
    p.sendDoll();
  }

  @Override
  public void sendChocolate() {
    p.sendChocolate();
  }
}