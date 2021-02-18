package com.autohuur;

import com.autohuur.Auto;
import com.autohuur.Klant;


public class AutoHuur {

    private int aantalDagen;
    private Klant huurder = new Klant();
    private Auto gehuurdeAuto = new Auto();

    public AutoHuur () {

    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public double totaalPrijs() {
        return (this.gehuurdeAuto.getPrijsPerDag() * this.aantalDagen) / 100 * (100 - this.huurder.getKorting());
    }

    @Override
    public String toString() {
        return  this.gehuurdeAuto + "\n" +
                this.huurder + "\n" +
                "aantal dagen: " + this.aantalDagen + " en dat kost " + totaalPrijs();
    }
}
