package credentional.buider.bestVariant;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().age(12).height(124).name("Leo").surname("Boy").weight(45).build();
        System.out.println(person);
    }
}
