package u025;

/**
 * Created by HuGuodong on 12/8/19.
 */
public  abstract class User {
  protected String id;
  protected String name;
  protected IChatRoom mediator;

  public User(IChatRoom mediator, String id, String name){
    this.mediator = mediator;
    this.id = id;
    this.name = name;
  }

  public abstract void send(String msg, String toUserId);

  public abstract void receive(String msg);

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public IChatRoom getMediator() {
    return mediator;
  }
}
