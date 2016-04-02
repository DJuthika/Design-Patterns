package Observer;

public class ObserverMain {
	public static void main(String[] args){
		
		StockPublisher p1 = new StockPublisher();
		StockSubscriber s1 = new StockSubscriber();
		p1.registerObserver(s1);
		p1.setPrices(142, 321, 124);
		p1.notifySubscirber();
		s1.printStockPrices();
		
		
	}
}
