package bank;

public class BankAccount { 
    long accountNumber; 
    long balance; 
    Person[] persons; 
    final int MAX = 10; 
    int currentEmptyPos = 0; 
    String lastAction = ""; 
 
    public BankAccount(long accountNumber, long initialAmount) { 
        this.accountNumber = accountNumber; 
        this.balance = initialAmount; 
        persons = new Person[MAX]; 
    } 
 
    public void addPerson(String id, String name, Permissions per){ 
    	/* Να συμπληρωθεί το σώμα της μεθόδου */ 
    	
    	if (currentEmptyPos<MAX)
    	{
    		persons[currentEmptyPos]= new Person( id,  name,  per);
    		currentEmptyPos++;

    	}
    	else 
    		System.out.println("Δεν μπορείτε να προσθέσετε περισσότερα άτομα. ο πίνακας γέμισε!");
    	/* αν δεν υπηρχε ο μετρητής currentEmptyPos
    	  θα μπορουσαμε να προσθέσουμε το Person στην 
    	  πρωτη κενη θεση που θα βρισκαμε στον πινακα
    	  με το παρακατω for
    	 
	    	for(int i=0; i<persons.length;i++)
	    	{
	    		if (persons[i]==null)
	    			persons[i]=  new Person( id,  name,  per);
	    			
	    	}
    	*/
    		
    		
  
    } 
 
    public void deposit(String id, long amount){ 
        Person p = findPerson(id); 
        if (p == null) 
            System.out.println("The  person  with  id:  "+id  +",  is  not associated with the account!"); 
 
        if (p.getPermissions().canDeposit){ 
            balance = balance + amount; 
            lastAction = "DEPOSIT"; 
        } 
        else{ 
            System.out.println("The  person  with  id:  "+id  +",  does  not have the permissions to deposit!"); 
        } 
    } 
 
  /* Να συμπληρωθούν τα ορίσματα και το σώμα της μεθόδου */ 
 
    public void withdraw(String id, long amount){
    	Person p = findPerson(id); 
    	if (p == null) 
            System.out.println("The  person  with  id:  "+id  +",  is  not associated with the account!");
        if (p.getPermissions().canWithdraw){ 
            balance = balance - amount; 
            lastAction = "WITHDRAW"; 
        } 
        else 
            System.out.println("The  person  with  id:  "+id  +",  does  not have the permissions to Withdraw!"); 
    	
    }
    
    public void close(String id){ 
        Person p = findPerson(id); 
        if (p == null) 
            System.out.println("The  person  with  id:  "+id  +",  is  not associated with the account!"); 
 
        if (p.getPermissions().canClose){ 
            lastAction = "CLOSE"; 
            balance = 0; 
        } 
        else{ 
            System.out.println("The  person  with  id:  "+id  +",  does  not have the permissions to close the account!"); 
        } 
    } 
 
    public Permissions permissionsFor(String id){ 
        Person p = findPerson(id); 
        if (p != null) 
            return p.per; 
 
        System.out.println("No person with id: "+id+" exists!!"); 
        return null; 
    } 
 
    public Person findPerson(String id){ 
        for (int i=0; i < persons.length; i++) 
            if (persons[i].getID().equals(id)) 
                return persons[i]; 
        return null; 
    } 
 
    public void printStatus(){ 
        System.out.println("Balance: "+balance); 
        System.out.println("Last Action: "+lastAction); 
    } 
 
    public void printPersons(){ 
        System.out.println("Persons"); 
        for (int i=0; i < persons.length; i++){ 
            if (persons[i] != null) 
                System.out.println("ID:  "+persons[i].id  +",  NAME: "+persons[i].name); 
        } 
    } 
}