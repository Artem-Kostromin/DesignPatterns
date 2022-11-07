package behavior.observer;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor(new EventManager("open", "save"));
        editor.events.subscribe("open", new EmailNotificationListener("Kostromin@mail.ru"));

        try {
            editor.openFile("file.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
