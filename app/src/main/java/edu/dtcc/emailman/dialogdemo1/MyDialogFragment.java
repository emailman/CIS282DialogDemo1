package edu.dtcc.emailman.dialogdemo1;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

/*
 * Created by emailman on 2/10/16
 * for CSC 282
 */
public class MyDialogFragment extends DialogFragment
{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        return new AlertDialog.Builder(getActivity())
                .setTitle("A Very Simple Dialog")
                .setPositiveButton("OK", null)
                .setNegativeButton("NG", null)
                .create();
    }
}
