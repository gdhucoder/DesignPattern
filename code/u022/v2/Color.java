package u022.v2;

/**
 * Created by HuGuodong on 12/5/19.
 */
public abstract class Color {
  abstract void draw();
}

class Red extends Color{

  @Override
  void draw() {
    System.out.print("Red");
  }
}


class Blue extends Color{

  @Override
  void draw() {
    System.out.print("Blue");
  }
}