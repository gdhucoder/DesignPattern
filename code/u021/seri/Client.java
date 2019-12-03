package u021.seri;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

/**
 * Created by HuGuodong on 12/3/19.
 */
public class Client {
  static DemoSingleton instance = DemoSingleton.getInstance();
  public static void main(String[] args)  throws Exception{
//    ObjectOutput output = new ObjectOutputStream(new FileOutputStream("filename.ser"));
//    output.writeObject(instance);
//    output.close();
//    instance.setI(20);
    ObjectInput input = new ObjectInputStream(new FileInputStream("filename.ser"));
    DemoSingleton instanceTwo = (DemoSingleton)input.readObject();
    input.close();

    System.out.println(instance.getI());
    System.out.println(instanceTwo.getI());
    System.out.println(instance);
    System.out.println(instanceTwo);
  }
}
