package com.example.sesion3_4gallardodti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public TextView tvSalidaPrecio;

    public ListView lvProductos;

    private String [] productos = {"colchones", "tambores", "refrigeradores", "estufas", "lavadoras"};
    private String [] precios = {"$2,000", "$1,000", "$5,000", "$7,000", "$10,000"};



    @Override
    protected void onCreate(Bundle savedInstanceState) { //inicia metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //integración de xml a java
        tvSalidaPrecio = findViewById(R.id.tvSalidaPrecio);
        lvProductos = (ListView)findViewById(R.id.lvProductos);

        //integracion de listas de precios y arreglo de productos
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, productos);
        lvProductos.setAdapter(adapter);//integra los datos del producto en la lista

        //programacion del evento click que determina el precio de un producto
        lvProductos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                tvSalidaPrecio.setText("Precio venta: " +precios[position]);
            }
        });


        }

    }
