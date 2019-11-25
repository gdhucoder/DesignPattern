package u014.v1;

/**
 * Created by HuGuodong on 11/24/19.
 */
public class StockObserver {
  private String name;
  private Secretary sub;

  public StockObserver(String name, Secretary sub){
    this.name = name;
    this.sub = sub;
  }

  public void update(){
    System.out.printf("%s, %s 关闭股票行情，继续工作！\n", sub.action, name);
  }
}
