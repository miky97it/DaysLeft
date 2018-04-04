package it.itisplanck.daysleft;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class settings extends AppCompatActivity {
    private ArrayList<EventModel> model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //Log.i("###","#####boh");
        model=new ArrayList<>();
        Calendar thatDay = Calendar.getInstance();
        thatDay.set(2018,11,25,0,0,0);
        model.add(new EventModel("Christmas",R.drawable.christmas,thatDay));
        //Log.i("###","#####boh");
        /*CustomAdapter customAdapter=new CustomAdapter(model);
        ListView listView= findViewById(R.id.listView);
        Log.i("###","#####boh3");
        listView.setAdapter(customAdapter);
        //customAdapter.getView()
        */
        ArrayList<String> suppList =new ArrayList<String>();
        Log.i("array"," loaded");
        for (int i=0; model.size() > i; i++){
            suppList.add(i,model.get(i).getName());
            Log.i("ciclo","testo"+model.get(i).getName());
        }
        CustomArrayAdapter<String> itemsAdapter =new CustomArrayAdapter<String>(this, suppList);
        ListView listView= findViewById(R.id.listView);
        listView.setAdapter(itemsAdapter);

    }
}
