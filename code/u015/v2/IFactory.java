package u015.v2;

/**
 * Created by HuGuodong on 11/27/19.
 */
public interface IFactory {
  IUser createUser();
}

class SqlServerFactory implements IFactory{

  @Override
  public IUser createUser() {
    System.out.println("Create SqlServerFactory -> createUser");
    return new SqlServerUser();
  }
}

class AccessFactory implements IFactory{

  @Override
  public IUser createUser() {
    System.out.println("Create AccessFactory -> createUser");
    return new AccessUser();
  }
}