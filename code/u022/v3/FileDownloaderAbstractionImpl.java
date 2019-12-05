package u022.v3;

/**
 * Created by HuGuodong on 12/5/19.
 */
public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {

  private FileDownloaderImplementor provider = null;

  public FileDownloaderAbstractionImpl(FileDownloaderImplementor provider){
    this.provider = provider;
  }

  @Override
  public Object download(String path) {
    return provider.downloadFile(path);
  }

  @Override
  public boolean store(Object object) {
    return provider.storeFile(object);
  }

  // v2 : add delete, it does not affect provider
  @Override
  public boolean delete(Object object) {
    return false;
  }
}
