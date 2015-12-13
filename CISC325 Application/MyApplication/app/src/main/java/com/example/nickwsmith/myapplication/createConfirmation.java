package com.example.nickwsmith.myapplication;

import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Prajjwol on 04/12/2015.
 */
public class createConfirmation extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_confirmation);

        Intent data = getIntent();

        TextView event_name_message = (TextView) findViewById(R.id.confirmation_event_name);

        String nameSentBack = data.getExtras().getString("EventName");
        String locationSentBack = data.getExtras().getString("EventLocation");
        String peopleSentBack = data.getExtras().getString("EventMax");
        event_name_message.setText("The Event : " + nameSentBack +

                " will be happening at " + locationSentBack + " for " + peopleSentBack + " people!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public void goMainPage(View view){
        Intent getCreateScreen = new Intent(this, IdleScreen.class);

        getCreateScreen.putExtra("RandomInfo", "hello");
        startActivity(getCreateScreen);
    }

}
