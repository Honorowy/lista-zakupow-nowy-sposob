package com.example.listazakupwnowysposb;

public class Produkt {
    private String nazwa;
    private boolean czyZakupione;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
        czyZakupione = false;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isCzyZakupione() {
        return czyZakupione;
    }

    public void setCzyZakupione(boolean czyZakupione) {
        this.czyZakupione = czyZakupione;
    }
}
