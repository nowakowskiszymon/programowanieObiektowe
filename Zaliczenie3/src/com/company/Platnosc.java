package com.company;

public class Platnosc {
    private double Kwota;
    private String Forma_platnosci;

    public void Platnosc(double Kwota, String Forma_platnosci){
        this.Forma_platnosci = Forma_platnosci;
        this.Kwota = Kwota;
    }


    @Override
    public String toString() {
        return "Platnosc{" +
                "Kwota wynosi " + Kwota +
                ", Forma_platnosci to " + Forma_platnosci + '\'' +
                '}';
    }
}
