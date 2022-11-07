package credentional.singleton;

/**
 * Гарантирует наличие только одного экземпляра класса и предоставляет глобальную точку доступа к нему
 */
public class Main {
    public static void main(String[] args) {
        SimpleSingleton simple1 = SimpleSingleton.getSingleton("simple1");
        SimpleSingleton simple2 = SimpleSingleton.getSingleton("simple2");
        System.out.println(simple1.value + ";" + simple2.value);


        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            MultiThreadSingleton singleton = MultiThreadSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
