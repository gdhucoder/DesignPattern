package incomplete.ideas;

/**
 * Created by HuGuodong on 11/20/19.
 */
public class Client {

  public static void main(String[] args) {
    ILog log= new ConsoleLog();
    log.log(null);
    log.init();
    ILog.OS();
  }
}
