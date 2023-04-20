package fact.it.zoo.model;

public class Person {
    private String firstName;
    private String surName;

    public Person(){}
    public Person(String fn, String sn){
        firstName = fn;
        surName = sn;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String name){
        firstName = name;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String name){
        surName = name;
    }
    public String toString(){
        String sn = surName.toUpperCase();
        String fn = firstName;
        String name = sn + " " + fn;
        return name;
    }


}

