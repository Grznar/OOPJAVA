package com.example.a244oopcerny;
import java.time.LocalDateTime;

public class RecepcniKnihovny extends ZapujcenaKniha {

    private String jmenoRecepcni;
    private LocalDateTime datumNastupu;


    public RecepcniKnihovny(String nazevKnihy, int pocetDni, LocalDateTime datumPujceni, String jmenoZakaznika,
                            String jmenoRecepcni, LocalDateTime datumNastupu) {
        super(nazevKnihy, pocetDni, datumPujceni, jmenoZakaznika);
        this.jmenoRecepcni = jmenoRecepcni;
        this.datumNastupu = datumNastupu;
    }


    public String getJmenoRecepcni() {
        return jmenoRecepcni;
    }

    public void setJmenoRecepcni(String jmenoRecepcni) {
        this.jmenoRecepcni = jmenoRecepcni;
    }

    public LocalDateTime getDatumNastup(){
        return datumNastupu;
    }

    public void setDatumNastupu(LocalDateTime datumNastupu) {
        this.datumNastupu = datumNastupu;
    }

    // Metody
    @Override
    public void obnovitDny() {
        super.obnovitDny();
        this.pocetDni += 60;
    }

    public void vymenaKnihy(String novaKniha) {
        setNazevKnihy(novaKniha);
    }

    @Override
    public String toString() {
        return super.toString() + ", RecepcniKnihovny{" +
                "jmenoRecepcni='" + jmenoRecepcni + '\'' +
                ", datumNastupu=" + datumNastupu +
                '}';
    }
}
