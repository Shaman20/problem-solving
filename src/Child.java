public class Child extends Basic {

    public Child(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Child c = new Child("Shaman", 22);
        System.out.println(c.getName());
        System.out.println(c.getAge());
    }
}
