package com.example.nickwsmith.myapplication;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Nicholas Smith on 2015-11-29.
 */
public class searchScreen extends AppCompatActivity {


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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_screen_layout);

    }


    private void showSimplePopUp4() {

        AlertDialog.Builder helpBuilder = new AlertDialog.Builder(this);
        helpBuilder.setTitle("Confirm going to this event?");
        helpBuilder.setMessage("Mussical Practice - Dec 14th    Spots Avail - 5/10");
        helpBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "Going to the event! Have fun :)", Toast.LENGTH_SHORT).show();
                    }
                });

        // Remember, create doesn't show the dialog
        AlertDialog helpDialog = helpBuilder.create();
        helpDialog.show();
    }



}
