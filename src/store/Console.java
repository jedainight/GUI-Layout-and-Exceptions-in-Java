package store; 
 
public class Console { 
  public Console() { 
    Store s = new Store(3); 
    s.addGame(new BowlingLane("Lane1", 4, 0.5)); 
    s.addGame(new BowlingLane("Lane2", 4, 0.5)); 
    s.addGame(new PoolTable("Table1", 6, 0.7)); 
 
    s.updateGameUses(0,12); 
    s.updateGameUses(1,7); 
    s.updateGameUses(2,5.3); 
 
    s.print(); 
    System.out.println("Έσοδα: "+ s.getIncome() + " Eυρώ Κέρδος:" + s.getProfit() + " Eυρώ"); 
  } 
 
//Main method 
  public static void main(String[] args){ 
    new Console(); 
  } 
} 