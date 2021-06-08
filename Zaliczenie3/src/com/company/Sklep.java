package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sklep {
    private String Miejscowosc;
    private String Kod_pocztowy;
    private String Ulica;
    private int Nr_domu;
    private double Tel;
    private String Email;
    List<Zamowienie> list;
    List<Pracownik> pracownikList = new ArrayList<>();

    public Sklep() {
    }

    public void Przyjmuje_zamowienia(Date a, int b, boolean c, Sklep d, Platnosc f, RodzajPrzesylki g){

    }
    public void Realizacja_zamowienia(){

    }

    @Override
    public String toString() {
        return "Sklep{" +
                "Miejscowosc='" + Miejscowosc + '\'' +
                ", Kod_pocztowy='" + Kod_pocztowy + '\'' +
                ", Ulica='" + Ulica + '\'' +
                ", Nr_domu=" + Nr_domu +
                ", Tel=" + Tel +
                ", Email='" + Email + '\'' +
                ", list=" + list +
                ", pracownikList=" + pracownikList +
                '}';
    }
}
