package u013;

import java.awt.Graphics;

/**
 * Created by HuGuodong on 11/24/19.
 */
public abstract class PersonBuilder {

  public abstract void buildHead();

  public abstract void buildBody();

  public abstract void buildArms();

  public abstract void buildLegs();
}

class ThinPersonBuilder extends PersonBuilder {

  @Override
  public void buildHead() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildHead");
  }

  @Override
  public void buildBody() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildBody");
  }

  @Override
  public void buildArms() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildArms");
  }

  @Override
  public void buildLegs() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildLegs");
  }
}

class FatPersonBuilder extends PersonBuilder {

  @Override
  public void buildHead() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildHead");
  }

  @Override
  public void buildBody() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildBody");
  }

  @Override
  public void buildArms() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildArms");
  }

  @Override
  public void buildLegs() {
    System.out.printf("%s: %s\n", this.getClass().getSimpleName(), "buildLegs");
  }
}

