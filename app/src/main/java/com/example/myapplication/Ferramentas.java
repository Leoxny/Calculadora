

package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;

public class ferramentas {

    public static void mostrarAlerta(Context context,String titulo,String menssagem) {
        try {
            AlertDialog.Builder dialod= new AlertDialog.Builder(context);
            dialod.setTitle(titulo)
                    .setMessage(menssagem)
                    .setPositiveButton("Ok",null)
                    .show();
        }

    }
}

