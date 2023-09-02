public class App {
    public static void main(String[] args) throws  CheckException  {
        try {
            System.out.println("Hello, World!");
            throw new CheckException();
        } catch (CheckException e) {
            System.out.println("no 2");
        }finally {
            System.out.println("finally");
        }
       throw new CheckException("wrong ");

    }
}
