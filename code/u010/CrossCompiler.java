package u010;

/**
 * Created by HuGuodong on 11/22/19.
 */
public abstract class CrossCompiler {
  public abstract void collectSource();
  public abstract void compileToTarget();
  public final void compile(){
    collectSource();
    compileToTarget();
  }
}

class AandroidCompiler extends CrossCompiler{

  @Override
  public void collectSource() {
    System.out.println("AandroidCompiler collectSource");
  }

  @Override
  public void compileToTarget() {
    System.out.println("AandroidCompiler compileToTarget");
  }
}

class IPhoneCompiler extends CrossCompiler{

  @Override
  public void collectSource() {
    System.out.println("IPhoneCompiler collectSource");
  }

  @Override
  public void compileToTarget() {
    System.out.println("IPhoneCompiler compileToTarget");
  }
}