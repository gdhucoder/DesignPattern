package u015.v3;

import java.text.DecimalFormat;

/**
 * Created by HuGuodong on 11/27/19.
 */
public interface IDepartment {
  void insert(Department department);
  Department getDepartment(int id);
}

class SqlServerDepartment implements IDepartment{

  @Override
  public void insert(Department department) {

  }

  @Override
  public Department getDepartment(int id) {
    return null;
  }
}

class AccessDepartment implements  IDepartment{

  @Override
  public void insert(Department department) {

  }

  @Override
  public Department getDepartment(int id) {
    return null;
  }
}