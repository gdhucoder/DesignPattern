package u009;

/**
 * Created by HuGuodong on 11/21/19.
 */
public class Resume_shallow implements Cloneable, IResume {
  private String name;
  private int age;
  private String timeSpan;
  private String company;
  public void setPersonalInfo(String name, int age){
    this.name = name;
    this.age = age;
  }

  public void setWorkExperience(String timeSpan, String company){
    this.timeSpan = timeSpan;
    this.company = company;
  }

  public void print(){
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "Resume{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", timeSpan='" + timeSpan + '\'' +
        ", company='" + company + '\'' +
        '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
