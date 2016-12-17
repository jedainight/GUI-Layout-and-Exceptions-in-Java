package railroad;


 public abstract class Train {
	protected Locomotive[] loc; 
	protected String type;
	protected int countLocomotives; 
	protected int countCarriages;
	int maxCarriages;

	public Train(int Locomotives,  int Carriages, int MAXCarriages ,String Type) {
		this.countLocomotives=Locomotives;
		this.countCarriages=Carriages;
		this.type=Type;
		this.maxCarriages=MAXCarriages;		
		loc=new Locomotive[countLocomotives];
		addCarriages(maxCarriages);	
				
	}
	
	abstract void addCarriages(int num);
	
	public  String toString()
	{		  
		return "This is a "+this.type+" train with Engine A and carriages " ;
	}
}
