package it.itisplanck.daysleft;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

public class ModelAdapterList extends ListAdapter{
    private List<EventModel> eventList;
    private Context conText;

    protected ModelAdapterList(@NonNull DiffUtil.ItemCallback diffCallback) {
        super(diffCallback);
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View nameView = inflater.inflate(R.layout.list_layout_raw, parent, false);

        ViewHolder viewHolder= new ViewHolder(nameView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EventModel event= eventList.get(position);

        //Switch switcH=holder.switcH;
        //switcH.setText(event.getName());
    }


    public class ViewHolder extends RecyclerView.ViewHolder { //qui copia dalla memoria i componenti da modificare e gli mette nella classe

        public Switch switcH;

        public ViewHolder(View itemView) {

            super(itemView);
            //findViewById();
            switcH=itemView.findViewById(R.id.switch1);
        }
    }
    private int getRaminingDays(Calendar thatDay){
        Calendar today = Calendar.getInstance();
        long diff = thatDay.getTimeInMillis()-today.getTimeInMillis(); //result in millis
        return (int)(diff / (24 * 60 * 60 * 1000));
    }
}
