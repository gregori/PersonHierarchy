public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("José", "R. Bolinha, 123");
        System.out.println(p);
        p.setAddress("R. Quadrado, 312");
        System.out.println(p);
    }
}
