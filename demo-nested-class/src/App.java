public class App {
    public static void main(String[] args) throws CheckException {
        try {
            System.out.println("Hello, World!");
            throw new CheckException("wrong ");
        } catch (CheckException e) {
            System.out.println(e.getMessage());

        }
        throw new CheckException("wrong ");

    }
}