package com.company;

public class studerende {
    private int stdnr;
    private String fnavn;
    private String enavn;
    private String adresse;
    private String postnr; //TODO opret i db
    private String mobil;
    private String klasse;

    //constructor
    public studerende() {
    }

    //Getters
    public int getStdnr() {
        return stdnr;
    }

    public String getFnavn() {
        return fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getPostnr() {
        return postnr;
    }

    public String getMobil() {
        return mobil;
    }

    public String getKlasse() {
        return klasse;
    }


    //Setters
    public void setStdnr(int stdnr) {
        this.stdnr = stdnr;
    }

    public void setFnavn(String fnavn) { this.fnavn = fnavn; }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public void setMobil(String mobil) {
        this.mobil = mobil;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    @Override
    public String toString() {
        return "studerende{" +
                "stdnr=" + stdnr +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr='" + postnr + '\'' +
                ", mobil='" + mobil + '\'' +
                ", klasse='" + klasse + '\'' +
                '}';
    }
}


