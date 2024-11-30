package com.example.a244oopcerny;
import java.time.LocalDateTime;

public class MajitelKnihovny extends ZapujcenaKniha {

    private String jmenoReditele;
    private LocalDateTime datumNastupu;


    public MajitelKnihovny(String nazevKnihy, int pocetDni, LocalDateTime datumPujceni, String jmenoZakaznika,
                           String jmenoReditele, LocalDateTime datumNastupu) {
        super(nazevKnihy, pocetDni, datumPujceni, jmenoZakaznika);
        this.jmenoReditele = jmenoReditele;
        this.datumNastupu = datumNastupu;
    }


    public String getJmenoReditele() {
        return jmenoReditele;
    }

    public void setJmenoReditele(String jmenoReditele) {
        this.jmenoReditele = jmenoReditele;
    }

    public LocalDateTime getDatumNastupu() {
        return datumNastupu;
    }

    public void setDatumNastupu(LocalDateTime datumNastupu) {
        this.datumNastupu = datumNastupu;
    }


    @Override
    public void obnovitDny() {
        super.obnovitDny();
        this.pocetDni += 90; // Přidáme dalších 90 dní
    }

    public void zmenitRecepcni(String noveJmenoRecepcni, LocalDateTime noveDatumNastupu) {
        this.jmenoReditele = noveJmenoRecepcni;
        this.datumNastupu = noveDatumNastupu;
    }

    @Override
    public String toString() {
        return super.toString() + ", MajitelKnihovny{" +
                "jmenoReditele='" + jmenoReditele + '\'' +
                ", datumNastupu=" + datumNastupu +
                '}';
    }
}
