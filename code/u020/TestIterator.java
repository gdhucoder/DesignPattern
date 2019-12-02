package u020;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by HuGuodong on 12/2/19.
 */
public class TestIterator {

  public static void main(String[] args) {
    List<String> songs = Arrays.asList("南方姑娘", "曾经的你", "Lydia");
    Iterator<String> playListIterator = songs.iterator();
    while (playListIterator.hasNext())
      System.out.println(playListIterator.next());
//    南方姑娘
//    曾经的你
//    Lydia
  }
}
