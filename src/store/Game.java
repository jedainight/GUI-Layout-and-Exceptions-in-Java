package store; 
public abstract class Game 
{ 
  private String name; 
  private double income; 
  private double rate; 
 
  Game(String n, double i, double r){name=n; income=i; 
rate=r;} 
 
  protected void setName(String n){name=n;} 
  protected void setIncome(double i){income=i;} 
  protected void setRate(double r){rate=r;} 
 
  protected String getName(){return name;} 
  protected double getIncome(){return income;} 
  protected double getRate(){return rate;} 
  public String toString(){ 
      return "Όνομα:"+name+" Κέρδος:"+income+" Ευρώ"; 
    } 
}  