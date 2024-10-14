package behavior.observer.head_first;

public interface Subject {

    void subscribe(Observer observer);

    void unSubscribe(Observer observer);

    void notifyObservers();
}
