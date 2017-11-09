package model;

import java.io.Serializable;

public abstract class Person implements Serializable{
    protected int id;
    private String fullName;
    private int age;
    //name, mobile number, ArrayList<Booking>
    //Kita PAKAI mobile number BUAT LOGIN PERTAMA
    //TRS CARI di User Manager buat dapeting OBJECT
    public Person(int id, String fullName, int age) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
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

}
