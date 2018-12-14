package com.example.rpereira.listviewcustom;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.rpereira.listviewcustom.Model.Vehicles;
import com.example.rpereira.listviewcustom.Utils.VehicleListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvVehicles;
    private VehicleListAdapter vlAdapter;
    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvVehicles = (ListView) findViewById(R.id.idlvListVehicles);

        btnPlay = (Button) findViewById(R.id.idBtnPlay);

        List<Vehicles> list = new ArrayList<>();

        Vehicles vehicle1 = new Vehicles.Builder().setId(1).setBrand("VW").setModel("FOX").setChecked(false).build();
        Vehicles vehicle2 = new Vehicles.Builder().setId(2).setBrand("VW").setModel("SpaceFOX").setChecked(false).build();
        Vehicles vehicle3 = new Vehicles.Builder().setId(3).setBrand("FIAT").setModel("TORO").setChecked(false).build();
        Vehicles vehicle4 = new Vehicles.Builder().setId(4).setBrand("FIAT").setModel("Strada").setChecked(false).build();
        Vehicles vehicle5 = new Vehicles.Builder().setId(5).setBrand("Chevrolet").setModel("Onix").setChecked(false).build();
        Vehicles vehicle6 = new Vehicles.Builder().setId(6).setBrand("Chevrolet").setModel("Cruze").setChecked(false).build();

        list.add(vehicle1);
        list.add(vehicle2);
        list.add(vehicle3);
        list.add(vehicle4);
        list.add(vehicle5);
        list.add(vehicle6);

        vlAdapter = new VehicleListAdapter(this, list);

        lvVehicles.setAdapter(vlAdapter);

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vlAdapter.getSelecionados();

            }
        });

    }
}
