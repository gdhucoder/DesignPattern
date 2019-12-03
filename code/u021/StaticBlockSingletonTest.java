package u021;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class StaticBlockSingletonTest {


  public static void main(String[] args) {
    var ins = StaticBlockSingleton.getInstance();
    System.out.println(ins);
  }
}
