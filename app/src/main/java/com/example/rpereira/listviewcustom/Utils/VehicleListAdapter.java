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
import android.widget.TextView;

import com.example.rpereira.listviewcustom.Model.Vehicles;
import com.example.rpereira.listviewcustom.R;

import java.util.ArrayList;
import java.util.List;

public class VehicleListAdapter extends ArrayAdapter<Vehicles> {

    private Context mContext;
    private List<Vehicles> vehiclesList = new ArrayList<>();

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

        return listItem;
    }
}
