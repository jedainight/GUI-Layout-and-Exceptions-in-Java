package railroad;

public class Main {

	public static void main(String[] args) {
		PassengerTrain train=new PassengerTrain(1,5);
		System.out.println(train.toString()); 
		FreightTrain freight=new FreightTrain(2,15);
		System.out.println(freight.toString()); 
		
	}

}
