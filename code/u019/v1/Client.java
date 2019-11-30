package u019.v1;

/**
 * Created by HuGuodong on 12/1/19.
 */
public class Client {

  public static void main(String[] args) {

    // build root
    Composite root = new Composite("root");

    // add two leaves
    root.add(new Leaf("leaf-a"));
    root.add(new Leaf("leaf-b"));

    // build a branch
    Composite branch1 = new Composite("branch-1");
    branch1.add(new Leaf("leaf-c"));
    branch1.add(new Leaf("leaf-d"));

    // add branch to root
    root.add(branch1);

    // build a branch
    Composite branch2 = new Composite("branch-2");
    branch2.add(new Leaf("leaf-e"));
    branch2.add(new Leaf("leaf-f"));

    // add a branch to a branch
    branch1.add(branch2);

    // display hierarchies
    root.display(0);

//    root
//    --leaf-a
//    --leaf-b
//    --branch-1
//    ----leaf-c
//    ----leaf-d
//    ----branch-2
//    ------leaf-e
//    ------leaf-f

  }
}
