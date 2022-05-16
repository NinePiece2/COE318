/**
 *
 * @author Romit Sagu
 */
package coe318.lab4;

public class Account {
    
    private String name;
    private int number;     // Account Number
    private double balance;
    
    public Account(String name, int number, double initalBalance){
        this.name = name;
        this.number = number;
        this.balance = initalBalance;
    }
    
    
    public String getName(){
        return name;
    }
    
    
    public double getBalance(){
        return balance;
    }
    
    
    public int getNumber(){
        return number;
    }
    
    
    public boolean deposit (double amount){
        if (amount>=0){
            this.balance = this.getBalance() + amount;
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean withdraw (double amount){
        if (amount>=0 && amount<=this.balance){
            this.balance = this.getBalance() - amount;
            return true;
        }
        else {
            return false;
        }
    }
    
    
    
    @Override
    public String toString() {//DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " + 
                String.format("$%.2f", getBalance()) + ")";
    }
}

