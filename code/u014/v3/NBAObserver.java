package u014.v3;

/**
 * Created by HuGuodong on 11/25/19.
 */
public class NBAObserver extends Observer {

  public NBAObserver(String name, Subject sub){
    super(name, sub);
  }
  @Override
  public void update() {
    System.out.printf("%s, %s 关闭NBA，继续工作！\n", sub.getAction(), name);
  }
}
