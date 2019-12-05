package u022.v3;

/**
 * Created by HuGuodong on 12/5/19.
 */
public interface FileDownloaderImplementor {
  Object downloadFile(String path);
  boolean storeFile(Object object);
  // v3: we add deleteFile method, it does not affect FileAbstraction layer, so client will not bu affected.
  boolean deleteFile(Object object);
}
