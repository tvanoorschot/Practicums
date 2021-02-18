package com.autohuur;

public class Klant {

    private String naam;
    private double kortingPercentage;

    public Klant(String naam) {
        this.naam = naam;
    }

    public Klant() {

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getKorting() {
        return kortingPercentage;
    }

    public void setKorting(double kortingPercentage) {
        this.kortingPercentage = kortingPercentage;
    }

    @Override
    public String toString() {
        if (this.naam == null) return "er is geen huurder bekend";
        return "op naam van: " + this.naam + " (korting: " + this.kortingPercentage + "%)";
    }

}
