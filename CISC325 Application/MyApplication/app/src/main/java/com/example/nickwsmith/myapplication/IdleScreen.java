package com.example.nickwsmith.myapplication;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Nicholas Smith on 2015-11-28.
 */
public class IdleScreen extends AppCompatActivity {
    private RecyclerView rv;
    private RecyclerView.LayoutManager layoutManager;


    private ArrayList<Event> eventsArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.idle_layout_page);

        Intent activityThatCalled = getIntent();

        String netID = activityThatCalled.getExtras().getString("usersNetID");

        eventsArray = new ArrayList<>();

        rv = (RecyclerView) findViewById(R.id.event_list);
        rv.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        initializeInfo();
        initializeAdapter();

    }

    private void initializeAdapter(){

        SearchEventAdapter adapter = new SearchEventAdapter(eventsArray);
        rv.setAdapter(adapter);

    }

    private void initializeInfo(){

        eventsArray.add(new Event("Event 1", "Location 1", 50, 20151520));
        eventsArray.add(new Event("Event 2", "Location 2", 51, 20151521));
        eventsArray.add(new Event("Event 3", "Location 3", 52, 20151522));
        eventsArray.add(new Event("Event 4", "Location 4", 53, 20151523));
        eventsArray.add(new Event("Event 5", "Location 5", 54, 20151524));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings){
            DialogFragment myFragment = new MyDialogFragment();
            myFragment.show(getFragmentManager(), "theDialog");
            return true;
        } else if (id == R.id.exit_the_app){
            finish();
            return true;
        } else if (id == R.id.action_help){
            DialogFragment myFragment = new myDialogFragmentHelp();
            myFragment.show(getFragmentManager(), "theDialog");
            return true;
        }else if (id == R.id.action_legal){
            DialogFragment myFragment = new myDialogFragmentLegal();
            myFragment.show(getFragmentManager(), "theDialog");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void createEvent(View view) {
        Intent getCreateScreen = new Intent(this, createScreen.class);
        startActivity(getCreateScreen);
    }

    public void searchEvents(View view) {
        //Creating the intent - what we want to do
        Intent getSearchScreen = new Intent(this, searchScreen.class);

        //makes the result
        final int result = 1;

        startActivity(getSearchScreen);
    }
}
