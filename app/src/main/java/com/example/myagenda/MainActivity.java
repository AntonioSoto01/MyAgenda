package com.example.myagenda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Titular> datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        datos = new ArrayList<Titular>();


        for(int i = 0; i<42; i++){
            datos.add(new Titular("Nombre:" + i, "Apellido:" + i, "Telefono:" + i));
            Log.i("TITULAR","Nombre:" + i + " --> Apellido:" + i + " --> Telefono:" + i);
        }

        Adaptador_titulares adaptador_titulares= new Adaptador_titulares(datos);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        recyclerView.setAdapter(adaptador_titulares);


    }
    public void onClick(View v){
        Log.i("MiApp", "pulsado el elemento" + recyclerView.getChildAdapterPosition(v));

    }
}