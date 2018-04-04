package it.itisplanck.daysleft;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter<S> extends ArrayAdapter<String> {
    public CustomArrayAdapter(Context context, ArrayList<String> stringa) {
        super(context, 0, stringa);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        String stringa= getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout_raw, parent, false);
        }
        // Lookup view for data population
        Switch switcH = (Switch) convertView.findViewById(R.id.switch1);
        // Populate the data into the template view using the data object
        switcH.setText(stringa);
        // Return the completed view to render on screen
        return convertView;
    }

}
