package u016.v3;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class ForenoonState extends State {

  @Override
  void writeProgram(Work w) {
    if(w.getHour()<12){
//      w.setState(new ForenoonState());
      System.out.printf("current time is %d, I feel grate!\n",w.getHour());
    }else{
      w.setState(new NoonState());
      w.writeProgram();
    }
  }
}
