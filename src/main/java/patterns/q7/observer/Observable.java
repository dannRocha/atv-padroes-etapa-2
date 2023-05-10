package patterns.q7.observer;

public interface Observable<T> {
    void subscribe(T listener);
    void unsubscribe(T listener);
    void notifyEvery ();
}
