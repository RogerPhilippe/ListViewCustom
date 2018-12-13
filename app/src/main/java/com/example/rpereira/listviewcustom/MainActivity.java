package com.example.rpereira.listviewcustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.rpereira.listviewcustom.Model.Vehicles;
import com.example.rpereira.listviewcustom.Utils.VehicleListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvVehicles;
    private VehicleListAdapter vlAdapter;
    private TextView tvIdItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVehicles = (ListView) findViewById(R.id.idlvListVehicles);

        tvIdItem = (TextView) findViewById(R.id.idtviditem);

        List<Vehicles> list = new ArrayList<>();

        Vehicles vehicle1 = new Vehicles.Builder().setId(1).setBrand("VW").setModel("FOX").build();
        Vehicles vehicle2 = new Vehicles.Builder().setId(1).setBrand("VW").setModel("SpaceFOX").build();
        Vehicles vehicle3 = new Vehicles.Builder().setId(1).setBrand("FIAT").setModel("TORO").build();
        Vehicles vehicle4 = new Vehicles.Builder().setId(1).setBrand("FIAT").setModel("Strada").build();
        Vehicles vehicle5 = new Vehicles.Builder().setId(1).setBrand("Chevrolet").setModel("Onix").build();
        Vehicles vehicle6 = new Vehicles.Builder().setId(1).setBrand("Chevrolet").setModel("Cruze").build();

        list.add(vehicle1);
        list.add(vehicle2);
        list.add(vehicle3);
        list.add(vehicle4);
        list.add(vehicle5);
        list.add(vehicle6);

        vlAdapter = new VehicleListAdapter(this, list);

        lvVehicles.setAdapter(vlAdapter);

    }
}
