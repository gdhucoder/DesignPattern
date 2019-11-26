package u015.v1;

/**
 * Created by HuGuodong on 11/27/19.
 */
public class User {
  private int id;
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}

class SqlServerUser{
  public void insert(User user){
    System.out.println("add a new user.");
  }

  public User getUser(int id){
    System.out.println("find a user.");
    return null;
  }
}
