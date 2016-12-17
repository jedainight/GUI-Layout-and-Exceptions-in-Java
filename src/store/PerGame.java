package store; 
public abstract class PerGame extends Game 
{ 
  PerGame(String n, double i, double r){super(n,i,r);} 
  public String toString(){ 
      return super.toString()+"/παιχνίδι"; 
    } 
} 
 