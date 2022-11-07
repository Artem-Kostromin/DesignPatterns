package credentional.factory;


/**
 * Определяет интерфейс для содания объекта, но позволяет подклассам решать какой класс инстанцировть.
 * Функция: Делегирование создания объекта
 */
class Program {
    public static void main(String[] args) {
        String specialty = "java";
        Developer developer = getFactory(specialty).hireDeveloper();
        developer.start();
    }

    private static DeveloperFactory getFactory(String specialty) {
        if (specialty.equals("java")) return new JavaDeveloperFactory();
        if (specialty.equals("C++")) return new CppDeveloperFactory();
        throw new IllegalArgumentException(specialty + "is unknown specialty!");
    }
}
