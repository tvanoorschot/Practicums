package com.company;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String n, int leef){
        this.naam = n;
        this.leeftijd = leef;
    }

    public String toString(){
        return naam + "; leeftijd " + leeftijd + " jaar";
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
}
