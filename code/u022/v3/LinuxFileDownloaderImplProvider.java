package u022.v3;

/**
 * Created by HuGuodong on 12/5/19.
 */
public class LinuxFileDownloaderImplProvider implements FileDownloaderImplementor {

  @Override
  public Object downloadFile(String path) {
    System.out.println("linux download file.");
    return new Object();
  }

  @Override
  public boolean storeFile(Object object) {
    System.out.println("linux store file.");
    return true;
  }

  @Override
  public boolean deleteFile(Object object) {
    return false;
  }
}
