package com.company;

import java.util.Date;

public class RodzajPrzesylki {
    private String Rodzaj;
    private Date Termin;

    public RodzajPrzesylki(String rodzaj, Date termin) {
        this.Rodzaj = rodzaj;
        this.Termin = termin;
    }

    @Override
    public String toString() {
        return "RodzajPrzesylki{" +
                "Rodzaj='" + Rodzaj + '\'' +
                ", Termin=" + Termin +
                '}';
    }
}
