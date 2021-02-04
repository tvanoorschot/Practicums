package com.company;

public class Zwembad {

    public double breedte;
    public double lengte;
    public double diepte;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public Zwembad() {

    }

    public double inhoud() {
        return this.breedte * this.lengte * this.diepte;
    }

    public String toString() {
        return "Dit zwembad is " + this.breedte + " meter breed, " + this.lengte +
                " meter lang, en " + this.diepte + " meter diep";
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }
}
