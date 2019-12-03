package util;

/**
 * Created by HuGuodong on 2019/8/6.
 */

public class _Stopwatch {

  private long start;

  public _Stopwatch() {
    start = System.currentTimeMillis();
  }

  public double elapsedTime() {
    long now = System.currentTimeMillis();
    long begin = start;
    start = now;
    return (now - begin) / 1000.0;
  }
}
