package com.autohuur;

public class Auto {

    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPd) {
        if (prPd < 0) {
            this.prijsPerDag = Math.abs(prPd);
        } else {
            this.prijsPerDag = prPd;
        }
        this.type = tp;
    }

    public Auto() {

    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    @Override
    public String toString() {
        if (this.type == null) return "er is geen auto bekend";
        return "autotype: " + this.type + " met prijs per dag: " + this.prijsPerDag;
    }
}
