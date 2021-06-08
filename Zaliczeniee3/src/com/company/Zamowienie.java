package com.company;


import java.util.Date;
import java.util.List;


public class Zamowienie {
    Platnosc platnosc;
    RodzajPrzesylki rodzaj_Przesylki;
    List<Produkt> produktList;

    public Zamowienie() {
    }

    public Zamowienie(Date a , int b , String c, boolean d ) {
    }
    public void Anuluj_zamowienie(Sklep sklep){

    }
    public void Sprawdz_zamowienie(Sklep sklep){

    }
    public void Zloz_zamowienie(Date a, int b, boolean c, Sklep sklep, Platnosc platnosc,
                                RodzajPrzesylki rodzaj_Przesylki, List<Produkt> d){

    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "platnosc=" + platnosc +
                ", rodzaj_Przesylki=" + rodzaj_Przesylki +
                ", produktList=" + produktList +
                '}';
    }
}
