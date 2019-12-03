package u021.lazy;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class LazySingletonV2Client {

  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      Runnable r = ()->{
        // print address to check whether LazySingletonV2 works well in multi thread environment.
        LazySingletonV2.getInstance();
      };
      var t = new Thread(r);
      t.start();
    }
    // output
    // instance address: u021.lazy.LazySingletonV2@1f3dd942

  }
}
