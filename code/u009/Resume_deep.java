package u009;

/**
 * Created by HuGuodong on 11/21/19.
 */
public class Resume_deep implements Cloneable, IResume{
  private String name;
  private int age;

  // workExperience 为引用类型，浅拷贝只复制地址。
  // 必须使用深拷贝
  private WorkExperience workExperience;

  public Resume_deep(){
    this.workExperience = new WorkExperience();
  }

  public void setPersonalInfo(String name, int age){
    this.name = name;
    this.age = age;
  }


  public void setWorkExperience(String timeSpan, String company){
    workExperience.setTimeSpan(timeSpan);
    workExperience.setCompany(company);
  }

  @Override
  public String toString() {
    return "Resume_deep{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", workExperience=" + workExperience +
        '}';
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public Object deepCopy(){
    Resume_deep  obj = null;
    try{
     obj = new Resume_deep();
      obj.name = this.name;
      obj.age = this.age;
      obj.workExperience = (WorkExperience) this.workExperience.clone();
    }catch (Exception e){
      e.printStackTrace();
    }

    return obj;

  }

  public void print(){
    System.out.println(toString());
  }
}
class WorkExperience implements Cloneable{
  private String timeSpan;
  private String company;
  public WorkExperience(){

  }

  public void setTimeSpan(String timeSpan) {
    this.timeSpan = timeSpan;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getTimeSpan() {
    return timeSpan;
  }

  public String getCompany() {
    return company;
  }

  @Override
  public String toString() {
    return "WorkExperience{" +
        "timeSpan='" + timeSpan + '\'' +
        ", company='" + company + '\'' +
        '}';
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}