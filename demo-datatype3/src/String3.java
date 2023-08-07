public class String3 {
<<<<<<< HEAD
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        System.out.println(str.equals(str2));// str,str2 both is object reference in heap
        System.out.println(str == str2);// why the adress are same?

        // String Literal Pool

        String str3 = "abcde";
        System.out.println(str == str3);
        str += "!";
        // str2 += "!";
        // String is immutable
        System.out.println(str.equals(str2));// check equals is check contact
        System.err.println(str == str2);
        // Object Reference in Stack
        // Objects in Heap
        // 用" "而唔係用new去生產String，會入Literal Pool,
        Integer a = 10;// 10
        System.out.println(a + 10);// 20
        a = a + 10; // a=30
        //
        Integer i1 = 127;
        Integer i2 = 128;
        Integer i3 = 127;
        Integer i4 = 128;
        System.out.println(i1 == 127);
        System.out.println(i2 == 128);
        System.out.println(i1 == i3);
        System.out.println(i2 == i4);
        //
        Character c1 = 'a';
        Character c2 = 'a';
        Character c3 = 'Ϩ';
        Character c4 = 'Ϩ';
        System.out.println(c1 == c2);// true
        System.out.println(c3 == c4);
        // false
        /*
         * Boolean: The Boolean class caches two objects: TRUE and FALSE. This means
         * that if you create two Boolean objects with the values true and false, they
         * will actually refer to the same objects in memory.
         * 
         * Character: The Character class caches all characters between 0 and 127. This
         * means that if you create two Character objects with the values 'a' and 'A',
         * they will actually refer to the same objects in memory.
         * 
         * Byte: The Byte class caches all bytes between -128 and 127. This means that
         * if you create two Byte objects with the values -128 and 127, they will
         * actually refer to the same objects in memory.
         * 
         * Short: The Short class caches all shorts between -32768 and 32767. This means
         * that if you create two Short objects with the values -32768 and 32767, they
         * will actually refer to the same objects in memory.
         *
         *  Integer: The Integer class caches all integers between -128 and 127. This
         * means that if you create two Integer objects with the values -128 and 127,
         * they will actually refer to the same objects in memory.
         */ }
=======

  // String Literal Pool (Heap) + String is immutable
  public static void main(String[] args) {
    String str = "abc";
    String str2 = "abc";
    System.out.println(str.equals(str2)); // true, "abc" is same as "abc"
    System.out.println(str == str2); // true, same value (Literal Pool)

    // String Literal Pool -> "abc"
    String str3 = "abcd";
    System.out.println(str.equals(str3)); // false
    System.out.println(str == str3); // false, their addresses are not same
    
    str = "abc100"; // because "abc100" is not equal to "abc" -> immutable -> new String object
    System.out.println(str == str2); // false

    String temp = str; 
    str = new String("abc100"); // new object
    System.out.println(temp == str); // same values, but false

  }
>>>>>>> refs/remotes/origin/main
}
