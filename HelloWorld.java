import coco.Decoder;
import java.util.HashMap;

public class HelloWorld {
  public static void main(String args[]){
    var m = new HashMap<Integer, String>();
    m.put(2103, "hey");
    m.put(238,"ad");

    System.out.println(m.size());
    for (var i: m.keySet()){
      System.out.printf("%d: %s\n", i, m.get(i));
    }
    System.out.println("Hello, World!");
    var c = new Decoder("huwn");
    c.decode();
    System.out.println(c.getCode());
  }
}

