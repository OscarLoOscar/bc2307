import java.util.Set;

public class DemoRecord {
    public static void main(String[] args) throws Exception {
        PersonRe p = new PersonRe("john", 30);
        PersonRe1 p1 = new PersonRe1("john", 30);
        PersonRe1 p2 = new PersonRe1("john", 30);

        System.out.println(p.getAge());
        System.out.println(p1.age());

        System.out.println(p.getName());
        System.out.println(p1.name());

        System.out.println(p1.equals(p2));
        System.out.println(p1);

        System.out.println(p1.hashCode() == p2.hashCode());
        // HashMap , Set ->equals() , hashCode
        Set<PersonRe> set = new HashSet<>();
        set.add(p1);
        System.out.println(set.add(p2));
    }
}
