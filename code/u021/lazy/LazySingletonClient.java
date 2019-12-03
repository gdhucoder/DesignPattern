package u021.lazy;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class LazySingletonClient {

  public static void main(String[] args) {
    // The first time instance is requested. i.e. address is u021.lazy.LazySingleton@2812cbfa
    LazySingleton instance = LazySingleton.getInstance();
    for (int i = 0; i < 100; i++) {
      Runnable r = ()->{
        // print address to check whether LazySingleton works well in multi thread environment.
        // because instance was created in the beginning of the main function, so
        // console will show the same address of instance.
        // u021.lazy.LazySingleton@2812cbfa ...
        LazySingleton.getInstance();
      };
      var t = new Thread(r);
      t.start();
    }
//    output
//    instance address: u021.lazy.LazySingleton@2812cbfa
//    instance address: u021.lazy.LazySingleton@2812cbfa
//    instance address: u021.lazy.LazySingleton@2812cbfa
//    instance address: u021.lazy.LazySingleton@2812cbfa
//    instance address: u021.lazy.LazySingleton@2812cbfa

  }
}
