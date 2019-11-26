package u014.v4;

/**
 * Created by HuGuodong on 11/26/19.
 */
public interface Subject {
  void attach(Observer obs);
  void detach(Observer obs);
  void notifyObs();
}
