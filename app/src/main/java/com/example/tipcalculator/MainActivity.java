package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radiogrp;
    private RadioGroup radiogrp2;
    private RadioGroup radiogrp3;
    private RadioButton radiobut1;
    private RadioButton radiobut2;
    private RadioButton radiobut3;
    private EditText orgbill;
    private TextView resultview;
    private Button button;
    private  TextView tip;

    private double t;
    private double b;
    private double h;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogrp=findViewById(R.id.radioGroup1);

        radiogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radiobut1=findViewById(checkedId);
                switch(radiobut1.getId()){

                    case R.id.radioButton1:{
                        if(radiobut1.isChecked()){
                            t=10;
                        }

                    }
                    break;

                    case R.id.radioButton2:{
                        if(radiobut1.isChecked()){
                            t=5;
                        }
                    }
                    break;

                    case R.id.radioButton3:{
                       if(radiobut1.isChecked()){
                           t=2.5;
                       }

                    }
                    break;

                    case R.id.radioButton4:{
                        if(radiobut1.isChecked()){
                            t=0;
                        }

                    }
                    break;
                }
            }
        });

        radiogrp2=findViewById(R.id.radiogroup2);

        radiogrp2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radiobut2=findViewById(checkedId);

                switch (radiobut2.getId()){

                    case R.id.radioButton11:{
                        if(radiobut2.isChecked()){
                            b=5;
                        }

                    }
                    break;

                    case R.id.radioButton10:{
                        if(radiobut2.isChecked()){
                            b=2.5;
                        }
                    }
                    break;

                    case R.id.radioButton7:{
                        if(radiobut2.isChecked()){
                            b=1.5;
                        }
                    }
                    break;

                    case R.id.radioButton6:{
                        if(radiobut2.isChecked()){
                            b=0;
                        }
                    }
                    break;
                }
            }
        });

        radiogrp3=findViewById(R.id.radiogroup3);

        radiogrp3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                radiobut3=findViewById(checkedId);

                switch (radiobut3.getId()){

                    case R.id.radioButton14:{
                        if(radiobut3.isChecked()){
                            h=5;
                        }
                    }
                    break;

                    case R.id.radioButton13:{
                        if(radiobut3.isChecked()){
                            h=2.5;
                        }
                    }
                    break;

                    case R.id.radioButton12:{
                        if(radiobut3.isChecked()){
                            h=0;
                        }
                    }
                    break;
                }

            }
        });

        orgbill=findViewById(R.id.editText2);
        resultview=findViewById(R.id.textView5);
        tip=findViewById(R.id.textView8);

        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Double orgi=Double.parseDouble(orgbill.getText().toString());

                if(orgbill.getText().toString().equals("")){

                   resultview.setText("Enter valid bill");
                   resultview.setTextColor(Color.RED);
                }
                else{

                    tip.setText(String.valueOf(t+b+h));
                    resultview.setText(String.valueOf(t+b+h+orgi));
                }
            }
        });





    }
}
