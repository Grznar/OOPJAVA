package com.example.a244oopcerny;
import java.time.LocalDateTime;

public class ZapujcenaKniha {

    private String nazevKnihy;
    protected int pocetDni;
    private LocalDateTime datumPujceni;
    private String jmenoZakaznika;

    public ZapujcenaKniha(String nazevKnihy, int pocetDni, LocalDateTime datumPujceni, String jmenoZakaznika) {
        this.nazevKnihy = nazevKnihy;
        this.pocetDni = pocetDni;
        this.datumPujceni = datumPujceni;
        this.jmenoZakaznika = jmenoZakaznika;
    }


    public String getNazevKnihy() {
        return nazevKnihy;
    }

    public void setNazevKnihy(String nazevKnihy) {
        this.nazevKnihy = nazevKnihy;
    }

    public int getPocetDni() {
        return pocetDni;
    }

    public void setPocetDni(int pocetDni) {
        if (pocetDni > 0) {
            this.pocetDni = pocetDni;
        } else {
            System.out.println("Počet dnů musí být kladný.");
        }
    }

    public LocalDateTime getDatumPujceni() {
        return datumPujceni;
    }

    public void setDatumPujceni(LocalDateTime datumPujceni) {
        this.datumPujceni = datumPujceni;
    }

    public String getJmenoZakaznika() {
        return jmenoZakaznika;
    }

    public void setJmenoZakaznika(String jmenoZakaznika) {
        this.jmenoZakaznika = jmenoZakaznika;
    }


    public LocalDateTime getDatumVraceni() {
        return datumPujceni.plusDays(pocetDni);
    }

    public void obnovitDny() {
        this.pocetDni += 30;
    }

    public void zmenaZakaznika(String jmeno) {
        this.jmenoZakaznika = jmeno;
    }

    @Override
    public String toString() {
        return "ZapujcenaKniha{" +
                "nazevKnihy='" + nazevKnihy + '\'' +
                ", pocetDni=" + pocetDni +
                ", datumPujceni=" + datumPujceni +
                ", jmenoZakaznika='" + jmenoZakaznika + '\'' +
                '}';
    }
}
