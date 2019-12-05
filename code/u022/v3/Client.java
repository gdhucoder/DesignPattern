package u022.v3;

/**
 * Created by HuGuodong on 12/5/19.
 */
public class Client {

  public static void main(String[] args) {
    FileDownloaderImplementor provider = new LinuxFileDownloaderImplProvider();
    FileDownloaderAbstraction downloader = new FileDownloaderAbstractionImpl(provider);
    Object o = downloader.download("xxx");
    downloader.store(o);
//    linux download file.
//    linux store file.
  }
}
