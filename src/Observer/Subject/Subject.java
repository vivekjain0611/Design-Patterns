package Observer.Subject;

import Observer.Observer.Observer;

public interface Subject {
    void register(Observer o);
    void remove (Observer o);
    void notifyObservers();
}
