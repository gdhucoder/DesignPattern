package u012;

/**
 * Created by HuGuodong on 11/23/19.
 */
public interface IInvestment {
  void buy();
  void sell();
}

class Stock implements IInvestment{
  protected String name;
  public Stock(String name){
    this.name = name;
  }

  @Override
  public void buy() {
    System.out.println("buy stock: "+ name);
  }

  @Override
  public void sell() {
    System.out.println("sell stock: "+ name);
  }
}

class RealState implements IInvestment{
  private String name;
  public RealState(String name){
    this.name = name;
  }
  @Override
  public void buy() {
    System.out.println("buy realstate: "+ name);
  }

  @Override
  public void sell() {
    System.out.println("sell realstate: "+ name);
  }
}

class NationalDebt implements IInvestment{
  private String desc;
  public NationalDebt(String desc){
    this.desc = desc;
  }
  @Override
  public void buy() {
    System.out.println("buy debt: "+ desc);
  }

  @Override
  public void sell() {
    System.out.println("sell debt: " + desc);
  }
}

