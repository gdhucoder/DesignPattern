package u015.v3;

/**
 * Created by HuGuodong on 11/27/19.
 */
public interface IFactory {
  IUser createUser();
  IDepartment createDepartment();
}

class SqlServerFactory implements IFactory {

  @Override
  public IUser createUser() {
    System.out.println("Create SqlServerFactory -> createUser");
    return new SqlServerUser();
  }

  @Override
  public IDepartment createDepartment() {
    return new SqlServerDepartment();
  }
}

class AccessFactory implements IFactory {

  @Override
  public IUser createUser() {
    System.out.println("Create AccessFactory -> createUser");
    return new AccessUser();
  }

  @Override
  public IDepartment createDepartment() {
    return new AccessDepartment();
  }
}