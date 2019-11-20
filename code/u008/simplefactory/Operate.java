package u008.simplefactory;

/**
 * Created by HuGuodong on 11/21/19.
 */
public abstract class Operate {

  protected double numA;
  protected double numB;

  protected abstract double getResult();
}

class AddOper extends Operate {

  @Override
  protected double getResult() {
    return numA + numB;
  }
}

class MultOper extends Operate {

  @Override
  protected double getResult() {
    return numA * numB;
  }
}


class OperateFactory {

  public static Operate createOperate(String op) {
    switch (op) {
      case "+":
        return new AddOper();
      case "*":
        return new MultOper();
      default:
        throw new IllegalArgumentException("not implemented yet");
    }
  }
}


