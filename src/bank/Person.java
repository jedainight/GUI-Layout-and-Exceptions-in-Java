package bank;

public class Person { 
    String id; 
    String name; 
    Permissions per; 
 
    public Person(String id, String name, Permissions per) { 
        this.id = id; 
        this.name = name; 
        this.per = per; 
    } 
 
    public String getID(){ 
        return id; 
    } 
 
    public String getName(){ 
        return name; 
    } 
 
    public Permissions getPermissions(){ 
        return per; 
    } 
} 
 