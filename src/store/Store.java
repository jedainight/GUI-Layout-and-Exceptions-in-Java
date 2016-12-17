package store; 
 
public class Store { 
  Game[] games; 
  double[] uses; 
  int count=0; 
 
  public Store(int gameNo) { 
    games = new Game[gameNo]; 
    uses = new double[gameNo]; 
  } 
  public void addGame(Game x){ 
    games[count++] = x; 
  } 
  public void updateGameUses(int gamePos, double val){ 
    uses[gamePos] = val; 
  } 
   
public Game getGame(int gamePos){ 
    return games[gamePos]; 
  } 
  public double getGameUses(int i){ 
    return uses[i]; 
  } 
  public double getIncome() { 
    double res = 0.0; 
    for (int i = 0; i < games.length; i++) 
      res += games[i].getIncome() * uses[i]; 
    return res; 
  } 
 
  public double getProfit() { 
    double res = 0.0; 
    for (int i = 0; i < games.length; i++) 
      res += games[i].getIncome() * uses[i] * 
          games[i].getRate(); 
    return res; 
  } 
 
public void print(){ 
    System.out.println("Κατάστημα Παιχνιδιών"); 
    for (int i = 0; i < games.length; i++) 
    	 System.out.println("Παιχνίδι "+(i+1)+":  "+games[i].toString() +" Χρήση: " + uses[i]); 
    			   
	} 
    			 
}