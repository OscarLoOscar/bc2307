package demohashset;

import java.util.HashSet;

public class DemoHashSet2 extends HashSet {

  public static void main(String[] args) {


    HashSet<Byte> bytes = new HashSet<>();
    // bytes.add(Byte.valueOf(4));
    // The method valueOf(byte) in the type Byte is not applicable for the arguments (int)
    bytes.add(Byte.valueOf((byte) 4)); // int->byte->Byte
    bytes.add(byteToByte(10));
    System.out.println("size : " + bytes.size());
    // java is not necessary to handle return value
    boolean isAdded4 = bytes.add(byteToByte(4));
    System.out.println(isAdded4);// false

    HashSet<Byte> bytes2 = new HashSet<>();
    bytes2.add(byteToByte(4));
    bytes2.add(byteToByte(20));
    System.out.println("size : " + bytes2.size());
    System.out.println("TEST : " + bytes.equals(bytes2));// true
    // Wrapper class check equals use equals TO check value // notes
    // primitive & enum use ==

    boolean isRemoved = bytes.remove((byteToByte(10)));
    System.out.println(isRemoved);


  }

  public static Byte byteToByte(int num) {
    return Byte.valueOf((byte) num);
  }
}
