package com.example.pc.myapplication;

public class CauThu {
    private String name;
    private String year;
    int hinh;
    int hinhmot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getHinhmot() {
        return hinhmot;
    }

    public void setHinhmot(int hinhmot) {
        this.hinhmot = hinhmot;
    }
    public CauThu()
    {
    }

    public CauThu(String name, String year, int hinh,int hinhmot) {

        this.name = name;
        this.year = year;
        this.hinh = hinh;
        this.hinhmot=hinhmot;
    }
}
