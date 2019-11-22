package u010;

/**
 * Created by HuGuodong on 11/22/19.
 */
public class Client {

  public static void main(String[] args) {
    CrossCompiler iphoneCompiler = new IPhoneCompiler();
    iphoneCompiler.compile();

    CrossCompiler androidCompiler = new AandroidCompiler();
    androidCompiler.compile();
//    IPhoneCompiler collectSource
//    IPhoneCompiler compileToTarget
//    AandroidCompiler collectSource
//    AandroidCompiler compileToTarget
  }
}
