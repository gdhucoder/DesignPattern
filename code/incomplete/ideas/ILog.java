package incomplete.ideas;

import java.io.OutputStream;

/**
 * Created by HuGuodong on 11/20/19.
 */
public interface ILog {

  enum Type {
    LOW,
    MEDIUM,
    HIGH
  }

  interface InILog{
    void initInLog();
  }

  default void init() {
    Type t = Type.LOW;
    System.out.println(t.ordinal());
  }

  static void OS() {
    System.out.println(System.getProperty("os.name", "linux"));
  }

  void log(OutputStream out);
}


class ConsoleLog implements ILog {

  @Override
  public void log(OutputStream out) {
    System.out.println("ConsoleLog...");
  }
}
