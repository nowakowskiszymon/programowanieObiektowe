package com.company;

public class Main {

    public static void main(String[] args) {

        Samochod samochod1 = new Samochod();
        samochod1.przyspiesz(80);
        samochod1.jedz(20);
        samochod1.wyswietlStan();

        Samochod samochod2 = new Samochod();
        samochod2.przyspiesz(90);
        samochod2.jedz(30);
        samochod2.wyswietlStan();
    }
}

class Samochod {
    int dystans;
    int predkosc;

    public void jedz(int dystans) {
        this.dystans = dystans;
    }

    public void przyspiesz(int predkosc) {
        this.predkosc = predkosc;
    }

    public void wyswietlStan() {
        System.out.println("Aktualna prędkośc to: " + predkosc +
                ", a pokonany dystans wynosi: " + dystans);
    }
}
