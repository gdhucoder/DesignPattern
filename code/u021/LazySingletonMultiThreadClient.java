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
//    private constructor, instance created. u021.LazySingleton@179810e7
//    private constructor, instance created. u021.LazySingleton@50b2315d
//    private constructor, instance created. u021.LazySingleton@14d3f560
//    private constructor, instance created. u021.LazySingleton@12c22898
//    private constructor, instance created. u021.LazySingleton@1fe7344e
  }
}
