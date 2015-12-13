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
public class MyDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        AlertDialog.Builder theDialog = new AlertDialog.Builder(getActivity());

        theDialog.setTitle("12nws : Events");
        String alert1 = "These are the events you are have created: ";
        String alert2 = "Music Practice - Dec, 14th        Spots Avail = 10/10";

        String alert3 = "These are the events you are attending: ";
        String alert4 = "";
        theDialog.setMessage(alert1 + "\n" + alert2 + "\n" + "\n" + alert3);

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
