package it.itisplanck.daysleft;

import java.util.Calendar;

public class EventModel {

    private String Name;
    private int Image;
    private Calendar date;
    public static int lastId=0;

    public EventModel(String name, int image, Calendar date) {
        Name = name;
        Image=image;
        this.date=date;
    }
    public String getName() {
        return Name;
    }

    public int getImage(){
        return Image;
    }

    public Calendar getDate() {
        return date;
    }

    public void setName(String name) {
        Name = name;
    }


   /* public static ArrayList<EventModel> createNAme(int nameNumber){
        ArrayList<EventModel> name=new ArrayList<>();
        for (int i=0;i<nameNumber;i++) {
            name.add(new EventModel("nomePErsona" + String.valueOf(i)));
        }
        return name;
    }*/
}
