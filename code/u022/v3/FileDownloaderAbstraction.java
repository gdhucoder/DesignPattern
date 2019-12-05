package u022.v3;

/**
 * Created by HuGuodong on 12/5/19.
 */
public interface FileDownloaderAbstraction {
  // v1
  Object download(String path);
  boolean store(Object object);

  // v2 assume we add a new method at abstraction level, i.e. delete
  boolean delete(Object object);
}
