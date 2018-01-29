package com.example.didact.u2_ej15_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declarar los elementos o vistas con los que voy a trabajar.
    ListView lvCiudades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Identificar vistas
        lvCiudades=(ListView)findViewById(R.id.lvListaCiudades);

        //Datos a mostrar en el ListView.
        String[] ciudades = {"Cádiz","Málaga","Huelva","Almería","Jaen","Córdoba","Madrid",
                "Valencia","Barcelona","San Sebastian","Bilbao"};

        //Crear el adapatador
        ArrayAdapter<String> adaptador=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,ciudades);

        //Añadir el adaptador al listView
        lvCiudades.setAdapter(adaptador);

        //Añadir el evento mensaje breve.
        lvCiudades.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"Has pulsado un item",Toast.LENGTH_LONG).show();
                String ciudad_seleccionada = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Has pulsado:"+ciudad_seleccionada,Toast.LENGTH_LONG).show();
            }
        });

        //Añadir el evento click largo

        lvCiudades.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"Has realizado un click largo",Toast.LENGTH_LONG).show();
                
                return true;

            }
        });




    } //FIN onCreate



} //FIN MainActivity
