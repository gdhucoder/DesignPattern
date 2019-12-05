package u022.v2;

/**
 * Created by HuGuodong on 12/5/19.
 */
public abstract class Shape {
  protected Color color;
  abstract void draw();
  public Shape(Color color){
    this.color = color;
  }

}

class Rectangle extends Shape{
  public Rectangle(Color color){
    super(color);
  }

  @Override
  void draw() {
    color.draw();
    System.out.println("Rectangle");
  }
}