package com.company.Person;

public class Person {
    private    String Name;
    private   String LastName;
    private   String MiddleName;
    private  String Address;
    private  int CreditCard;
    private int IdealNumber;

    public Person(String Name,String LastName,String MiddleName,
                  String Address,int CreditCard,  int IdealNumber){
        this.Name=Name;
        this.LastName=LastName;
        this.MiddleName=MiddleName;
        this.Address=Address;
        this.CreditCard=CreditCard;
        this.IdealNumber=IdealNumber;
    }

    //getters
    public String getName(){
        return this.Name;
    }
    public String getLastName(){
        return this.LastName;
    }
    public String getMiddleName(){
        return this.MiddleName;
    }
    public String getAddress(){
        return this.Address;
    }
    public double getCreditCard(){
        return this.CreditCard;
    }
    public int getIdealNumber(){
        return this.IdealNumber;
    }

    //Setters
    public void setName(String name){
        this.Name=name;
    }
    public void setLastName(String lastName){
        this.LastName=LastName;
    }
    public void setMiddleName(String middleName){
        this.MiddleName=middleName;
    }
    public void setAddress(String address){
        this.Address=address;
    }
    public void setCreditCard(int creditCard){
        this.CreditCard=creditCard;
    }
    public void setIdealNumber(int idealNumber){
        this.IdealNumber=idealNumber;
    }

}