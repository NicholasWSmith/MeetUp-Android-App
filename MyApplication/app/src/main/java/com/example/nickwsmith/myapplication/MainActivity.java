package com.example.nickwsmith.myapplication;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


    public void onLogInClick(View view) {
        //Creating the intent - what we want to do
        Intent getIdleScreen = new Intent(this, IdleScreen.class);

        //makes the result
        final int result = 1;

        //defines the EditText component
        EditText netID = (EditText) findViewById(R.id.net_ID_Input);

        //initalizes a string and gets the users Net Id
        String usersNetID = String.valueOf(netID.getText());

        getIdleScreen.putExtra("usersNetID", usersNetID);

        startActivity(getIdleScreen);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView usersNameMessage = (TextView) findViewById(R.id.textView2);

        String nameSendBack = data.getStringExtra("UsersName");

        usersNameMessage.append(" " + nameSendBack);
    }
}
