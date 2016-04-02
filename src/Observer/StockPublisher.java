package Observer;

import java.util.ArrayList;
import java.util.List;



public class StockPublisher implements Publisher {

	int apple;
	int google;
	int linkedin;
	List<Subscriber> listOfSubscribers = new ArrayList<Subscriber>();
	@Override
	public void registerObserver(Subscriber s) {
		listOfSubscribers.add(s);
	}

	@Override
	public void unregisterObserver(Subscriber s) {
		int index =-1;
		for(int i=0;i<listOfSubscribers.size();i++){
			if(listOfSubscribers.get(i)==s){
				index = i;
				break;
			}
		}
		listOfSubscribers.remove(index);
		System.out.println("Removed "+index);

	}

	@Override
	public void notifySubscirber() {
		
		for(Subscriber s:listOfSubscribers){
			
			s.updateStocks(this.apple, this.google, this.linkedin);
			
		}

	}
	
	public void setPrices(int apple,int google,int linkedin){
		this.apple = apple;
		this.google= google;
		this.linkedin = linkedin;
	}

}
