package com.example.nickwsmith.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Nicholas Smith on 2015-11-28.
 */
public class ConfirmEventFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("Confirm Event");

        theDialog.setMessage("Are you sure you want to go to this event?");

        theDialog.setPositiveButton("Yes!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Enjoy", Toast.LENGTH_SHORT).show();

            }
        });

        theDialog.setNegativeButton("No!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked No!", Toast.LENGTH_SHORT).show();
            }
        });

        return theDialog.create();
    }
}
