package com.example.nickwsmith.myapplication;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

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
    }
}
