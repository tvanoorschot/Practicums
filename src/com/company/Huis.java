package com.company;

import com.company.Persoon;

public class Huis {

    private Persoon huisbaas;
    private String adres;
    private int bouwjaar;

    public Huis(String adr, int jaar) {
        this.adres = adr;
        this.bouwjaar = jaar;
    }

    public String toString(){
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }
}
