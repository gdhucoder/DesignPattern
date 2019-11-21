package u008.factorymethod;

/**
 * Created by HuGuodong on 11/21/19.
 */
public abstract class Operation {

  protected double numA;
  protected double numB;

  public abstract double getResult();
}

class AddOper extends Operation {

  @Override
  public double getResult() {
    return numA + numB;
  }
}

class MultOper extends Operation {

  @Override
  public double getResult() {
    return numA * numB;
  }
}