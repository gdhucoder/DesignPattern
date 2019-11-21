package u008.factorymethod;

/**
 * Created by HuGuodong on 11/21/19.
 */
public interface IOperationFactory {
  Operation createOperation();
}

class AddFactory implements IOperationFactory{

  @Override
  public Operation createOperation() {
    return new AddOper();
  }
}

class MultFactory implements IOperationFactory{

  @Override
  public Operation createOperation() {
    return new MultOper();
  }
}
