package com.example.nickwsmith.myapplication;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Prajjwol on 03/12/2015.
 */
public class createScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_screen);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to exit this page?")
                    .setCancelable(false)
                    .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            createScreen.this.finish();
                        }
                    })
                    .setNegativeButton("Don't Exit", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
            AlertDialog alert = builder.create();
            alert.show();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    //    For the date picker
    public void showDatePickerDialog(View v){
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getFragmentManager(), "datePicker");
    }

    public void buttonCreateConfirmation(View view) {
        EditText get_event_name = (EditText) findViewById(R.id.event_name);
        String event_name = String.valueOf(get_event_name.getText());
        EditText get_event_location = (EditText) findViewById(R.id.event_location);
        String event_location = String.valueOf(get_event_location.getText());
        EditText get_event_numb = (EditText) findViewById(R.id.event_max_people);
        String event_numb = String.valueOf(get_event_numb.getText());
        EditText get_event_details = (EditText) findViewById(R.id.event_additional_details);
        String event_details = String.valueOf(get_event_details.getText());

        if (get_event_name.getText().toString().trim().equals("")) {
            get_event_name.setError("Event name is required!");
        }
        else if (get_event_location.getText().toString().trim().equals("")) {
            get_event_location.setError("Event location is required!");
        }
        else if (get_event_numb.getText().toString().trim().equals("")) {
            get_event_numb.setError("Max number of people for event is required!");
        }
        else{
            Intent getCreateConfirmation = new Intent(this, createConfirmation.class);

            getCreateConfirmation.putExtra("EventName",event_name);
            getCreateConfirmation.putExtra("EventLocation", event_location);
            getCreateConfirmation.putExtra("EventMax", event_numb);

            startActivity(getCreateConfirmation);
        }



    }
}