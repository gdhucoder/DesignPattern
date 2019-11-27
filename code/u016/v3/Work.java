package u016.v3;

/**
 * Created by HuGuodong on 11/28/19.
 */
public class Work {

  private int hour;
  private boolean taskFinished;


  private State current;

  public Work() {
    this.current = new ForenoonState();
  }

  public void setState(State s) {
    current = s;
  }

  public void writeProgram() {
    current.writeProgram(this);
  }

  public void setHour(int hour) {
    this.hour = hour;
  }

  public int getHour() {
    return hour;
  }

  public boolean isTaskFinished() {
    return taskFinished;
  }

  public void setTaskFinished(boolean taskFinished) {
    this.taskFinished = taskFinished;
  }
}
