package com.example.nickwsmith.myapplication;

import java.util.ArrayList;

/**
 * Created by Nicholas Smith on 2015-12-06.
 */
public class Event {

    private String name;
    private String location;
    private int numPeople;
    private int date;


    public Event(String name, String location, int numPeople, int date){
        this.name = name;
        this.location = location;
        this.numPeople = numPeople;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String[] getInfo(){
        String eventInfo[] = new String[3];
        eventInfo[0] = name;
        eventInfo[1] = location;
        String stringNumPeople = Integer.toString(numPeople);
        eventInfo[2] = stringNumPeople;
        String stringDate = Integer.toString(date);
        eventInfo[3] = stringDate;

        return null;
    }

    public static ArrayList<Event> getEvents(){
        ArrayList<Event> events = new ArrayList<Event>();
        return events;
    }
}
