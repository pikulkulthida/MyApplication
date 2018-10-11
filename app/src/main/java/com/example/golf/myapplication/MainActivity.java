package com.example.gudysuyfiuydsiyf.ass5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.golf.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView showName = findViewById(R.id.tv_showname);
        final TextView showSurname = findViewById(R.id.tv_showsurname);
        final EditText inputName = findViewById(R.id.et_inputname);
        final EditText inputSurname = findViewById(R.id.et_inputsurname);
        Button btnSetdata = findViewById(R.id.btn_setdata);

        btnSetdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showName.setText(inputName.getText());
                showSurname.setText(inputSurname.getText());
            }
        });
    }
}