package u026.v1;

/**
 * Created by HuGuodong on 12/9/19.
 */
public class WebSite {
  private String name;
  public WebSite(String name){
    this.name = name;
  }
  public void use(){
    System.out.println("网站分类："+ name);
  }

  public static void main(String[] args) {
    WebSite s1 = new WebSite("产品展示");
    s1.use();
    WebSite s2 = new WebSite("博客");
    s2.use();
  }
}


