package credentional.singleton;

/**
 * Реализация без учета многопоточности
 */
public final class SimpleSingleton {
    private static SimpleSingleton instance;
    public String value;

    private SimpleSingleton(String value) {
        this.value = value;
    }

    public static SimpleSingleton getSingleton(String value){
        if (instance == null) {
            instance = new SimpleSingleton(value);
        }
        return instance;
    }
}
