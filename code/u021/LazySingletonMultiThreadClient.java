package u021;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class LazySingletonMultiThreadClient {

  public static void main(String[] args) {

    for (int i = 0; i < 100; i++) {
      Runnable r = ()->{
        LazySingleton.getInstance();
      };
      var t = new Thread(r);
      t.start();
    }
    // multi thread will generate two or more instances.
    // if your result is different from mine, run several times to verify yours.
//    instance address: u021.LazySingleton@45e8464f
//    instance address: u021.LazySingleton@40567879
//    instance address: u021.LazySingleton@41e066da
//    instance address: u021.LazySingleton@7eb2f567
  }
}
