package u016.v3;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class NoonState extends State {

  @Override
  void writeProgram(Work w) {
    w.setState(new ForenoonState());
    System.out.println("noon!");
  }
}
