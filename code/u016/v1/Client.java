package u016.v1;

import static u016.v1.WriteProgram.HOUR;
import static u016.v1.WriteProgram.workFinished;
import static u016.v1.WriteProgram.writeProgram;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class Client {

  public static void main(String[] args) {
    HOUR = 10;
    writeProgram();
    workFinished = true;
    HOUR = 22;
    writeProgram();
  }
}
