package geometry;

public class Main {

	public static void main(String[] args) {
		
		int maxShapes=8;
		double totalArea=0;
		Shape[] shapes = new Shape[maxShapes];
		shapes[0] = new Circle(3);
		shapes[1] = new Circle(5);
		shapes[2] = new Square(4);
		shapes[3] = new Square(6);
		shapes[4] = new Rectangle(3,5);
		shapes[5] = new Rectangle(6,8);
		shapes[6] = new Triangle(2,3,4);
		shapes[7] = new Triangle(4,5,6);
		
		System.out.println("Δημιουργήθηκαν 2 στιγμιότυπα για τα παρακάτω σχήματα: \n" );
		
		for(int i=0; i<shapes.length;i+=2)
			System.out.println("Name: "+ shapes[i].getName()+", Color: "+shapes[i].getColor());
		
		for(int i=0; i<shapes.length;i++)
			totalArea+=shapes[i].calcArea();		
		System.out.println("\nΣυνολικό εμβαδόν των σχημάτων του πίνακα: "+totalArea +" τ.μ" );		
			
	}
	/* Απαντήσεις - Σχόλια
	 * 
	 * Η σχεδίαση και η σύνδεση των κλάσεων με την κλάση Shape σε μια ιεραρχία κλάσεων
	 * έγινε το addon του eclipse "ObjectAid UML" και τα αρχεία Diagram.ucls ή Diagram.png
	 * αναπαριστούν την ιεραρχία
	 * 
	 * Ο πολυμορφισμός (polymorphism) είναι μια έννοια που αφορά στις ιεραρχίες κλάσεων
	 * και  δίνει τη δυνατότητα το ίδιο όνομα μεθόδου να προκαλεί την εκτέλεση διαφορετικού 
	 * κώδικα ανάλογα με τον τύπο του αντικειμένου στο οποίο καλείται.
	 * 
	 * Καλώντας τη μέθοδο Shape.calcArea()  ανάλογα με τον τύπο του αντικειμένου στο οποίο
	   δείχνει η αναφορά Shape θα κλήθεί η κατάλληλη μέθοδος υπολογισμού εμβαδού οπότε θα
	 * έχουμε τα σωστά αποτελέσματα.
	 * 
	 * το ίδιο ισχύει και για τις μεθόδους Shape.getName και Shape.getColor
	 * 
	 */

}
