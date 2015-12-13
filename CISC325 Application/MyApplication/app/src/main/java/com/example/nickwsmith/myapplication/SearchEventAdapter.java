


package com.example.nickwsmith.myapplication;

/**
 * Created by Nicholas Smith on 2015-12-06.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nickwsmith.myapplication.Event;

import java.text.DecimalFormat;
import java.util.List;


public class SearchEventAdapter extends RecyclerView.Adapter<SearchEventAdapter.EventViewHolder> {

    private final List<Event> events;
    DecimalFormat df = new DecimalFormat("00");

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        TextView name, location, date, numPeople;
        View eventView;


        public EventViewHolder(View itemView) {
            super(itemView);

            name = (TextView) itemView.findViewById(R.id.card_event_name);
            location = (TextView) itemView.findViewById(R.id.card_event_location);
            date = (TextView) itemView.findViewById(R.id.alexsmells);
            numPeople = (TextView) itemView.findViewById(R.id.alexchewsloudly);
            eventView = itemView;
        }
    }

    SearchEventAdapter(List<Event> events){
        this.events = events;
    }


    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        final View v  = layoutInflater.inflate(R.layout.event_card, viewGroup, false);

        return new EventViewHolder(v);
    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {

        String date = Integer.toString(events.get(i).getDate());
        String numPeople = Integer.toString(events.get(i).getNumPeople());


        eventViewHolder.name.setText(events.get(i).getName());
        eventViewHolder.location.setText(events.get(i).getLocation());
        eventViewHolder.date.setText(date);
        eventViewHolder.numPeople.setText(numPeople);



        eventViewHolder.eventView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
    }

    @Override
    public int getItemCount(){
        return events.size();
    }





}

