package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView lblTabuada;
    Button bntTabuada;
    EditText txtTabuada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblTabuada = findViewById(R.id.lblTabuada_main);
        txtTabuada = findViewById(R.id.txtTabuada_main);
        bntTabuada = findViewById(R.id.btnCalcular_main);

        bntTabuada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int tabuada = 6;

                try {
                    tabuada = Integer.parseInt(txtTabuada.getText().toString());
                }catch (Exception ex) {
                    Log.e("CALCULADORA", ex.getMessage());
                    String impressao = "";
                }
                if(tabuada != 0) {
                    String impressao = "";

                    for (int i = 0; i < 10; i++) {

                        int res = i * tabuada;
                        impressao += tabuada + "x" + i + "=" + res + "\n";

                    }
                    lblTabuada.setText(impressao);

            }

        }
    });

}

    }
}

