package u009;

/**
 * Created by HuGuodong on 11/21/19.
 */
public class Client {

  public static void main(String[] args) throws Exception{
    IResume r1 = new Resume_deep();
    r1.setPersonalInfo("Allen", 23);
    r1.setWorkExperience("2010-2020", "AWS");


//    IResume r2 = (Resume_deep)  ((Resume_deep) r1).clone();
//    deepCopy
    IResume r2 = (Resume_deep)  ((Resume_deep) r1).deepCopy();
    r2.setWorkExperience("2009-2015", "ShenzhenPingShan hospital");
    r1.print();
    r2.print();
//    Resume{name='Allen', age=23, timeSpan='2010-2020', company='AWS'}
//    Resume{name='Allen', age=23, timeSpan='2009-2015', company='ShenzhenPingShan hospital'}
  }
}
