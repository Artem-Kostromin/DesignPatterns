package behavior.observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation:
             operations) {
            listeners.put(operation, new ArrayList<EventListener>());
        }
    }

    public void subscribe(String operation, EventListener eventListener){
        listeners.get(operation).add(eventListener);
    }

    public void unsubscribe(String operation, EventListener eventListener) {
        listeners.get(operation).remove(eventListener);
    }

    public void notify(String operation, File file){
        for (EventListener eventListener :
                listeners.get(operation)) {
            eventListener.update(operation, file);
        }
    }
}
