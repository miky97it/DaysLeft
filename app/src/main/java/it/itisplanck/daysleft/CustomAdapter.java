package it.itisplanck.daysleft;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Switch;

import java.util.List;

public class CustomAdapter extends BaseAdapter{
    private List<EventModel> eventList;

    CustomAdapter(List<EventModel> eventLis){
        this.eventList=eventLis;
    }
    @Override
    public int getCount() {
        Log.i("___","getCoount");
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View nameView = inflater.inflate(R.layout.list_layout_raw, parent, false);

        Switch switcH = view.findViewById(R.id.switch1);
        Log.d("------number"+i,"name"+eventList.get(i).getName());
        switcH.setText(eventList.get(i).getName());
        return null;
    }
}
