package incomplete.ideas;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by HuGuodong on 11/19/19.
 */
public class TestBufferdInputStream {

  public static void main(String[] args) {
    try {
      BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("1.txt")));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
