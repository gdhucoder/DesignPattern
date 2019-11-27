package u016.v1;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class WriteProgram {
  public static int HOUR = 0;
  public static boolean workFinished = false;
  public static void writeProgram(){
    if(HOUR<12)
      System.out.printf("current time is %d\n", HOUR);
    else if(HOUR<13)
      System.out.printf("current time is %d\n", HOUR);
    else if(HOUR<17)
      System.out.printf("current time is %d\n", HOUR);
    else {
      if(workFinished){
        System.out.printf("work finished, current time is %d\n", HOUR);
      }else{
        System.out.printf("work not finished, current time is %d\n", HOUR);
      }
    }
  }
}
