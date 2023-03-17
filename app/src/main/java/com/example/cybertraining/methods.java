package com.example.cybertraining;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class methods extends AppCompatActivity {
    ArrayAdapter<String> adapter;
    String[] names = {"Please Select a Method",
            "Shift ciphers",
            "One-time pads",
            "Hash functions",
            "Block ciphers",
            "stream ciphers",
            "Cryptographic primitives",
            "Functions",
            "Cryptographic salts",
            "Encryption algorithms",
            "Mathematical principles",
            "Symmetric key encryption",
            "Public key encryption",
            "Key exchanges ",
            "Digital certificates ",
            "HTTPS protocol",
            "Virtual Private Networks ",
            "Generic Routing Encapsulation (GRE) tunnels",
            "Encryption of data on Wi-Fi networks"};

    String[] definitions = {"Please select a Method",
            "tumadre",
            "ciao",
            "njnjnk",
            "fnwn",
            "nfweinviown",
            "nwdvwnvoiwnvok",
            "nfkwdnvknvklwdvk",
            "ncdknckwndvklw",
            "nkcn",
            "ne",
            "ndwlkncvwenv",
            "fkenv",
            "nkvnernvk",
            "nweknkwe",
            "nwknsvkwnev",
            "mdwkl",
            "m",
            "ndklsvnkwl"};

    Spinner sp;
    TextView definition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);

        sp = (Spinner) findViewById(R.id.spinner);
        definition = (TextView) findViewById(R.id.definitions);

        adapter = new ArrayAdapter<String>(getApplicationContext(),
        android.R.layout.simple_list_item_1,names);

        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        definition.setText(definitions [i]);
                        break;
                    case 1:
                        definition.setText( definitions [i]);
                        break;
                    case 2:
                        definition.setText( definitions [i]);
                        break;
                    case 3:
                        definition.setText( definitions [i]);
                        break;
                    case 4:
                        definition.setText( definitions [i]);
                        break;
                    case 5:
                        definition.setText( definitions [i]);
                        break;
                    case 6:
                        definition.setText( definitions [i]);
                        break;
                    case 7:
                        definition.setText( definitions [i]);
                        break;
                    case 8:
                        definition.setText( definitions [i]);
                        break;
                    case 9:
                        definition.setText( definitions [i]);
                        break;
                    case 10:
                        definition.setText( definitions [i]);
                        break;
                    case 11:
                        definition.setText( definitions [i]);
                        break;
                    case 12:
                        definition.setText( definitions [i]);
                        break;
                    case 13:
                        definition.setText( definitions [i]);
                        break;
                    case 14:
                        definition.setText( definitions [i]);
                        break;
                    case 15:
                        definition.setText( definitions [i]);
                        break;
                    case 16:
                        definition.setText( definitions [i]);
                        break;
                    case 17:
                        definition.setText( definitions [i]);
                        break;
                    case 18:
                        definition.setText( definitions [i]);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        //set up buttons
        Button button1 = (Button) findViewById(R.id.back);

//create event handler
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
}
