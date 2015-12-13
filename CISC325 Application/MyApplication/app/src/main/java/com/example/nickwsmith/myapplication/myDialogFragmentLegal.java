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
public class myDialogFragmentLegal extends DialogFragment{


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("Legal");

        theDialog.setMessage("All rights reserved to CISC325 2015, Queens University!");

        theDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked OK", Toast.LENGTH_SHORT).show();

            }
        });

        theDialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Clicked CANCEL", Toast.LENGTH_SHORT).show();
            }
        });

        return theDialog.create();
    }
}
