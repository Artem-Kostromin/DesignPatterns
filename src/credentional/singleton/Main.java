package credentional.singleton;

/**
 * Гарантирует наличие только одного экземпляра класса и предоставляет глобальную точку доступа к нему
 */
public class Main {
    public static void main(String[] args) {
        SimpleSingleton simple1 = SimpleSingleton.getSingleton("simple1");
        SimpleSingleton simple2 = SimpleSingleton.getSingleton("simple2");
        System.out.println(simple1.value + ";" + simple2.value);


    }
}
