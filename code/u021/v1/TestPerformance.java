package u021.v1;

import util._Stopwatch;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class TestPerformance {

  public static void main(String[] args) {
    int NUM = 100000;
    _Stopwatch time = new _Stopwatch();
    for (int i = 0; i < NUM; i++) {
      Runnable r = () -> {
        FooV1.getInstance();
      };
      var t = new Thread(r);
      t.start();
    }
    System.out.println(time.elapsedTime());
    for (int i = 0; i < NUM; i++) {
      Runnable r = () -> {
        FooV2.getInstance2();
      };
      var t = new Thread(r);
      t.start();
    }
    System.out.println(time.elapsedTime());
//    4.307s sync a method is slower
//    4.119s faster
  }
}
