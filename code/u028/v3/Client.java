package u028.v3;

/**
 * Created by HuGuodong on 12/10/19.
 */
class Client {

  public static void main(String[] args) {
    ObjectStructure o = new ObjectStructure();
    o.add(new Man());
    o.add(new Woman());

    Action success = new Success();// concrete visitor
    o.display(success);
  }
}
