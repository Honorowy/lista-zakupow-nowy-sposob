package com.example.listazakupwnowysposb;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ZakupyAdapter zakupyAdapter;
    private ArrayList<Produkt> listaZakupowArrayList = new ArrayList<>();

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
        recyclerView = findViewById(R.id.recyclerView);
        listaZakupowArrayList.add(new Produkt("mąka"));
        listaZakupowArrayList.add(new Produkt("drożdże"));
        listaZakupowArrayList.add(new Produkt("cynamon"));
        listaZakupowArrayList.add(new Produkt("mleko"));
        listaZakupowArrayList.add(new Produkt("cukier"));
        listaZakupowArrayList.add(new Produkt("mąka"));
        listaZakupowArrayList.add(new Produkt("drożdże"));
        listaZakupowArrayList.add(new Produkt("cynamon"));
        listaZakupowArrayList.add(new Produkt("mleko"));
        listaZakupowArrayList.add(new Produkt("cukier"));

        zakupyAdapter = new ZakupyAdapter(MainActivity.this, listaZakupowArrayList);
        recyclerView.setAdapter(zakupyAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

    }
}