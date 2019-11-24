package u013;

/**
 * Created by HuGuodong on 11/24/19.
 */
public class PersonDirector {
  private PersonBuilder builder;
  public PersonDirector(PersonBuilder builder){
    this.builder = builder;
  }
  public void createPerson(){
    builder.buildHead();
    builder.buildBody();
    builder.buildArms();
    builder.buildLegs();
  }
}
