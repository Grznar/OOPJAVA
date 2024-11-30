package com.example.a244oopcerny;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime nastupTime= LocalDateTime.of(2024, 12, 25, 15, 30, 45);
        ZapujcenaKniha kniha = new ZapujcenaKniha("Romeo a Julie", 10, currentDateTime, "Petr");

        // Vytiskne info o půjčené knize
        Log.d("Kniha", "Půjčená kniha: " + kniha.toString());

        // Výpočet data vrácení
        Log.d("Kniha", "Datum vrácení knihy: " + kniha.getDatumVraceni());

        // Obnova dnů
        kniha.obnovitDny();
        Log.d("Kniha", "Po obnovení dnů: " + kniha.toString());

        // Změna jména zákazníka
        kniha.zmenaZakaznika("Petr Svoboda");
        Log.d("Kniha", "Po změně zákazníka: " + kniha.toString());

        // Vytvoření instance RecepcniKnihovny
        RecepcniKnihovny recepcni = new RecepcniKnihovny("Hamlet", 14, currentDateTime, "Eva Novotná", "Markéta Krejčová", nastupTime);

        // Vyměna knihy
        recepcni.vymenaKnihy("Velký Gatsby");
        Log.d("Recepcni", "Recepční změnila knihu: " + recepcni.toString());

        // Obnovení dnů u RecepcniKnihovny
        recepcni.obnovitDny();
        Log.d("MainActivity", "Po obnovení dnů u recepční knihovny: " + recepcni.toString());

        // Vytvoření instance MajitelKnihovny
        MajitelKnihovny majitel = new MajitelKnihovny("Stařec a moře", 20,currentDateTime,"Pavel","Pytel",nastupTime);

        // Změna recepčního
        majitel.zmenitRecepcni("Lucie Králová", currentDateTime);
        Log.d("MainActivity", "Po změně recepčního: " + majitel.toString());

        // Obnovení dnů u Majitele knihovny
        majitel.obnovitDny();
        Log.d("MainActivity", "Po obnovení dnů u majitele knihovny: " + majitel.toString());
    }
}

