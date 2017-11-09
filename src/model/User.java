package model;

import java.io.Serializable;

public class User implements Serializable{
    protected int id;
    private String fullName;
    private int age;
    private String phoneNumber;
    //name, mobile number, ArrayList<Booking>
    //Kita PAKAI mobile number BUAT LOGIN PERTAMA
    //TRS CARI di User Manager buat dapeting OBJECT

    public User(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public User(int id, String fullName, int age, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public int getId(){
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }


}
