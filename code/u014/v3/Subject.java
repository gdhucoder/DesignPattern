package u014.v3;

/**
 * Created by HuGuodong on 11/26/19.
 */
public interface Subject {
  void attach(Observer observer);
  void detach(Observer observer);
  void notifyObs();
  String getAction();
  void setAction(String action);
}
