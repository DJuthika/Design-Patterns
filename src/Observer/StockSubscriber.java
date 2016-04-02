package Observer;

public class StockSubscriber implements Subscriber {

	int apple;
	int google;
	int linkedin;
	@Override
	public void updateStocks(int apple, int google, int linkedin) {
		// TODO Auto-generated method stub
		this.apple = apple;
		this.google = google;
		this.linkedin = linkedin;
		
	}
	public void printStockPrices(){
		System.out.println("Apple price is "+apple);
		System.out.println("Google price is "+google);
		System.out.println("Linkedin price is "+linkedin);
	}

}
