package railroad;

public class FreightTrain extends Train {
	private FreightCarriage[] freightcarriages;	
	
	public FreightTrain(int locomotives, int carriages) {
		super(locomotives, carriages,15 , "Freight");		
	}
	
	void addCarriages(int num){
		if(countCarriages<=maxCarriages){
			freightcarriages=new FreightCarriage[countCarriages];
			for(int i=0;i<maxCarriages;i++){
				freightcarriages[i]=new FreightCarriage(i+1);
			}
		}		
	}
	
	public String toString() { 
		String out=super.toString();
		for(int i=0;i<countCarriages;i++){
			out+=" "+freightcarriages[i].getId()+freightcarriages[i].getType();
		}				  
		return out;
	} 
}
