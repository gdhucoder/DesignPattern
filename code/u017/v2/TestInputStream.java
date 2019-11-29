package u017.v2;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by HuGuodong on 11/29/19.
 */
public class TestInputStream {

  public static void main(String[] args) {
    // System.in inputstream
    // BufferedReader <--> character
    // InputStream <--> bytes stream
    // InputStreamReader: Adapter (bytes stream to character)
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
  }
}
