package com.example.rpereira.listviewcustom.Utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rpereira.listviewcustom.Model.Vehicles;
import com.example.rpereira.listviewcustom.R;

import java.util.ArrayList;
import java.util.List;

public class VehicleListAdapter extends ArrayAdapter<Vehicles> {

    private Context mContext;
    private List<Vehicles> vehiclesList = new ArrayList<>();
    private final List<Vehicles> idSelecionados = new ArrayList<>();

    @SuppressLint("SupportAnnotationUsage")
    public VehicleListAdapter(@NonNull Context context, @LayoutRes List<Vehicles> list) {
        super(context, 0 , list);
        mContext = context;
        vehiclesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Vehicles currentVehicle = vehiclesList.get(position);

        TextView brand = (TextView) listItem.findViewById(R.id.idtvSecundaryText);
        brand.setText(currentVehicle.getBrand());

        TextView model = (TextView) listItem.findViewById(R.id.idtvMainText);
        model.setText(currentVehicle.getModel());

        CheckBox ckBox = (CheckBox) listItem.findViewById(R.id.idcbSelectIem);
        ckBox.setChecked(currentVehicle.isChecked());
        ckBox.setTag(currentVehicle);

        ckBox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                CheckBox checkBox = (CheckBox) v;

                Vehicles vcls = (Vehicles) v.getTag();
                vcls.setmChecked(((CheckBox) v).isChecked());

//                Vehicles vehicles = new Vehicles.Builder().setId(vcls.getId()).setBrand(vcls.getBrand())
//                        .setModel(vcls.getModel()).setChecked(((CheckBox) v).isChecked()).build();

                // Verifica se item está selecionado
                if (checkBox.isChecked()) {
                    Toast.makeText(mContext, "Marcado: "+vcls.getModel(), Toast.LENGTH_SHORT).show();
                    // Veriofica se lista possui item selecionado
                    if(!idSelecionados.contains(vcls)) {
                        // Adiciona
                        idSelecionados.add(vcls);
                    }
                } else {
                    Toast.makeText(mContext, "Desmarcado: "+vcls.getModel(), Toast.LENGTH_SHORT).show();
                    // Veriofica se lista possui item selecionado
                    if(idSelecionados.contains(vcls)) {
                        // Remove
                        idSelecionados.remove(vcls);
                    }
                }

            }
        });

        return listItem;
    }

    public List<Vehicles> getSelecionados() {
        return idSelecionados;
    }

}
