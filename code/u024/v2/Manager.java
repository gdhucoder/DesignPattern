package u024.v2;

import u024.v1.Apply;

/**
 * Created by HuGuodong on 12/7/19.
 */
public abstract class Manager {
  protected String name;
  protected Manager superior;

  public Manager(String name){
    this.name = name;
  }

  public void setSuperior(Manager superior){
    this.superior = superior;
  }

  public abstract void HandleApplication(Apply apply);


}
