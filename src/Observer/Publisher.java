package Observer;

public interface Publisher {
	void registerObserver(Subscriber s);
	void unregisterObserver(Subscriber s);
	void notifySubscirber();
}
