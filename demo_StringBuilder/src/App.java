public class App {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        // sb ->address / referecnce , not Object
        System.out.println(sb.toString()); // String

        sb.append("world");
        System.out.println(sb.toString());
        System.out.println(sb);
        sb.append("add");
        System.out.println(sb.toString());// pass by value
        System.out.println(sb);// pass by reference

        System.out.println(sb.append(true).append(4000L).length());

        String s = "     he   llo    ";
        String[] strs = s.trim().replace('h', 'e').split(" ");
        int i = s.charAt(0);
        // s.split(s);
        // String.join(s, strs);
        // String.trim();
        // if (sb == sb.toString()) {
        // System.out.println("TRUE");
        // } else {
        // System.out.println("FALSE");
        // }
        if (sb.equals(sb.toString())) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        StringBuilder s2 = new StringBuilder("start");
        // app 1
        s2.append('a').toString().charAt(3);
        // app 2
        StringBuilder s3 = s2.append('a');
        String s4 = s3.toString();
        s4.charAt(3);

        // insert
        String s10 = "hello"; // how to insert a space between ll
        StringBuilder s11 = new StringBuilder("hello");// 已知一個String->StringBuilder
        s11.insert(3, ' ');// return StringBuilder
        System.out.println(s11);// he llo

        s11.insert(0, "world").append("WORLDS");// why dont we assign back to s11
        System.out.println(s11);

        System.out.println(s11.deleteCharAt(3).toString());// change the address , pass by reference
        System.out.println(s11);
        //
        Integer a = 10;// Wrapper class pass by value , 操作a既copy
        System.out.println(a + 10);// 20
        System.out.println(a);// 10
        //
        s11.setCharAt(4, 'J');
        System.out.println(s11);
    }
}
