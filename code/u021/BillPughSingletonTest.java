package u021;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class BillPughSingletonTest {

  public static void main(String[] args) {
    // output 10, instance does not create.
//    System.out.println(BillPughSingleton.NUM);
//
//    System.out.println(BillPughSingleton.getInstance());
//    System.out.println(BillPughSingleton.getInstance());
//    create singleton.
//    u021.BillPughSingleton@1134affc
//    u021.BillPughSingleton@1134affc

    for (int i = 0; i < 100; i++) {
      Runnable r = ()->{
        BillPughSingleton.getInstance(); // only create one time.
      };
      var t = new Thread(r);
      t.start();
    }


  }
}
