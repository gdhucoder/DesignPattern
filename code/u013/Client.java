package u013;

/**
 * Created by HuGuodong on 11/24/19.
 */
public class Client {

  public static void main(String[] args) {
    PersonBuilder thinBuilder = new ThinPersonBuilder();
    PersonDirector director = new PersonDirector(thinBuilder);
    director.createPerson();

    PersonBuilder fatBuilder = new FatPersonBuilder();
    director = new PersonDirector(fatBuilder);
    director.createPerson();

//    ThinPersonBuilder: buildHead
//    ThinPersonBuilder: buildBody
//    ThinPersonBuilder: buildArms
//    ThinPersonBuilder: buildLegs
//    FatPersonBuilder: buildHead
//    FatPersonBuilder: buildBody
//    FatPersonBuilder: buildArms
//    FatPersonBuilder: buildLegs

  }
}
