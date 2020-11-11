package com.company.Subcriber;

public class Subcriber {
 private    String Name;
 private   String LastName;
 private   String MiddleName;
 private  String Address;
 private double InternationalConversationsTime;
 private double CityConversationsTime;
 private int id;

 public Subcriber(String Name, String LastName, String MiddleName, int id,
                  String Address, int CityConversationsTime, int internationalConversationsTime){
     this.Name=Name;
     this.LastName=LastName;
     this.MiddleName=MiddleName;
     this.Address=Address;
     this.InternationalConversationsTime=InternationalConversationsTime;
     this.CityConversationsTime=CityConversationsTime;

     this.id=id;
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

 public double getInternationalConversationsTime(){
     return this.InternationalConversationsTime;
 }

 public double getCityConversationsTime(){  return this.CityConversationsTime;}

 public int getid(){ return this.id;}


 //Setters

 public void setName(String name){ this.Name=name; }

 public void setLastName(String lastName){ this.LastName=LastName;}

 public void setMiddleName(String middleName){this.MiddleName=middleName; }

 public void setAddress(String address){  this.Address=address;}

 public void setInternationalConversationsTime(double internationalConversationsTime){
     this.InternationalConversationsTime=internationalConversationsTime;}

 public void setCityConversationsTime(double cityConversationsTime){
     this.CityConversationsTime=cityConversationsTime;}

 public void setId(int id){ this.id=id;}

 public void getInfo(){
     System.out.println("Id: "+getid()+"Name:"+getName()+"LastName:"+getLastName()+"Address:"+getAddress()
             +"CityConversLimit:"+getCityConversationsTime()+"Long-distance"+getInternationalConversationsTime());

 }
}
