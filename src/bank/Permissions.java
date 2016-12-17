package bank;

public class Permissions { 
	 
    boolean canDeposit, canWithdraw, canClose; 
 
    public Permissions(boolean canDeposit, boolean canWithdraw, boolean canClose) { 
        this.canDeposit = canDeposit; 
        this.canWithdraw = canWithdraw; 
        this.canClose = canClose; 
     } 
  
     public boolean canDeposit(){ 
         return canDeposit; 
     } 
  
     public boolean canWithdraw(){ 
         return canWithdraw; 
     } 
  
     public boolean canClose(){ 
         return canClose; 
     } 
  
     public void print(){ 
         System.out.println("Can Deposit = "+canDeposit+", Can Withdraw  = "+canWithdraw+", Can Close = "+canClose); 
     } 
 } 