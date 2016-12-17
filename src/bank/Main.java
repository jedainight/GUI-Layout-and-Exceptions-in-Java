package bank;

public class Main {
    public static void main(String[] args) { 
    	
    	Permissions p1= new Permissions(true,true,true);
    	Permissions p2= new Permissions(false,true,true);
    	Permissions p3= new Permissions(true,false,false);
/*  ��  ����������  ���  ������  ���  ��  ����������  ���  ����������  ��  ���� 
������ ��� ������ ���� ��� �������� ���*/ 
    	BankAccount bankAccount = new BankAccount(976241,50000);
 
/*  ��  ������  �������  ���  ��  ����������  ����  �����  ���  ����������  ��� 
������������� */ 
    	bankAccount.addPerson("M234567", "IOANNOY ANDREAS", p1);
    	bankAccount.addPerson("N234567", "NIKOLAOY XRISTINA", p2);
    	bankAccount.addPerson("K234567", "PAPAPETROY MARINA", p3);
    	
        // Print the permissions for these persons 
        Permissions p = bankAccount.permissionsFor("K234567"); 
        System.out.println("Permissions for person K234567"); 
        p.print(); 
        /* �� ������ ��� ��� ����� ��������� ������� ����� ��� ���������� ��� 
        ������������� */ 
         
        bankAccount.deposit("K234567", 500);
                // Print the status and persons. 
                bankAccount.printStatus(); 
                bankAccount.printPersons();          
         
            } 
}
