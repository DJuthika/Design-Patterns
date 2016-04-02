package Strategy;

public class Bird extends Animals{
		
		public Bird(){
			super();
			this.flyingType = new ItFlys();
		}
		
}
