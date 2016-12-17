package railroad;

public class PassengerTrain extends Train {	
	
	private PassengerCarriage[] passcarriages;	
	
	public PassengerTrain(int locomotives, int carriages) {
		super(locomotives, carriages,5, "Passenger");		
	}
	
	void addCarriages(int num){
		if(countCarriages<=maxCarriages){
			passcarriages=new PassengerCarriage[countCarriages];
			for(int i=0;i<maxCarriages;i++){
				passcarriages[i]=new PassengerCarriage(i+1);
			}
		}		
	}
	
	public String toString() { 
		String out=super.toString();
		for(int i=0;i<countCarriages;i++){
			out+=" "+passcarriages[i].getId()+passcarriages[i].getType();
		}				  
		return out;
	} 
}
