package u012;

import java.sql.SQLOutput;

/**
 * Created by HuGuodong on 11/23/19.
 */
public class Fund implements IInvestment{
  private String fundName;
  private Stock stock1;
  private Stock stock2;
  private Stock stock3;
  private RealState realState;
  public NationalDebt nationalDebt;
  public Fund(String fundName){
    this.fundName = fundName;
    stock1 = new Stock("GOL");
    stock2 = new Stock("APL");
    stock3 = new Stock("AAL");
    realState = new RealState("WANDA");
    nationalDebt = new NationalDebt("debt 5% interests per year");

  }

  @Override
  public void buy() {
    System.out.println("Fund Buy Operation");
    stock1.buy();
    stock2.buy();
    stock3.buy();
    realState.buy();
    nationalDebt.buy();
  }

  @Override
  public void sell() {
    System.out.println("Fund Sell Operation");
    stock1.sell();
    stock2.sell();
    stock3.sell();
    realState.sell();
    nationalDebt.sell();
  }
}
