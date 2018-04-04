package it.itisplanck.daysleft;

import android.content.Context;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

public class ModelAdapterCardView extends RecyclerView.Adapter<ModelAdapterCardView.ViewHolder> {
    private List<EventModel> eventList;
    private Context conText;

    public ModelAdapterCardView(List<EventModel> name, Context conText) {
        eventList = name;
        this.conText = conText;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context=parent.getContext();
        LayoutInflater inflater=LayoutInflater.from(context);
        View nameView = inflater.inflate(R.layout.cardview_layout_raw, parent, false);

        ViewHolder viewHolder= new ViewHolder(nameView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {    //qui modifica i componenti
        EventModel event= eventList.get(position);

        TextView textView=holder.testoRiga;
        textView.setText(event.getName());

        ImageView imageView=holder.imageView2;
        imageView.setImageResource(event.getImage());

        textView =holder.testoRigaData;
        String days_left =conText.getString(R.string.days_left);

        textView.setText(getRaminingDays(event.getDate())+days_left); //if eng else
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder { //qui copia dalla memoria i componenti da modificare e gli mette nella classe

        private TextView testoRiga;
        private TextView testoRigaData;
        private ImageView imageView2;
        public ViewHolder(View itemView) {

            super(itemView);
            //findViewById();
            testoRiga=itemView.findViewById(R.id.testoriga);
            testoRigaData=itemView.findViewById(R.id.testorigaData);
            imageView2=itemView.findViewById(R.id.imageView2);
        }
    }
    private int getRaminingDays(Calendar thatDay){
        Calendar today = Calendar.getInstance();
        long diff = thatDay.getTimeInMillis()-today.getTimeInMillis(); //result in millis
        return (int)(diff / (24 * 60 * 60 * 1000));
    }
}
