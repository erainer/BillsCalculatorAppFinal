package com.example.quyo.billscalculatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;

public class Bills extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills);
        final EditText rent = (EditText) findViewById(R.id.rentBox);
        final EditText electricity = (EditText) findViewById(R.id.electricityBox);
        final EditText water = (EditText) findViewById(R.id.waterBox);
        final EditText internet = (EditText) findViewById(R.id.internetBox);
        final EditText insurance = (EditText) findViewById(R.id.insuranceBox);
        final EditText other = (EditText) findViewById(R.id.otherBox);
        final EditText rentRM = (EditText) findViewById(R.id.rentRM);
        final EditText electricityRM = (EditText) findViewById(R.id.electricityRM);
        final EditText waterRM = (EditText) findViewById(R.id.waterRM);
        final EditText internetRM = (EditText) findViewById(R.id.internetRM);
        final EditText insuranceRM = (EditText) findViewById(R.id.insuranceRM);
        final EditText otherRM = (EditText) findViewById(R.id.otherRM);
        final CheckBox RM = (CheckBox) findViewById(R.id.checkBox);
        Button nextBtn = (Button) findViewById(R.id.button2);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });



//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                setContentView(R.layout.activity_income);
//                Intent nextScreen = new Intent(Bills.this, Display.class);
//                nextScreen.putExtra("Rent", rent.getText().toString());
//                nextScreen.putExtra("Electricity", electricity.getText().toString());
//                nextScreen.putExtra("Water", water.getText().toString());
//                nextScreen.putExtra("Internet", internet.getText().toString());
//                nextScreen.putExtra("insurance", insurance.getText().toString());
//                nextScreen.putExtra("Other", other.getText().toString());
//
//
//                //Start Activity
//                startActivity(nextScreen);
//
//
//            }
  //      });



        RM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(RM.isChecked()){
                    rentRM.setVisibility(View.VISIBLE);
                    electricityRM.setVisibility(View.VISIBLE);
                    waterRM.setVisibility(View.VISIBLE);
                    internetRM.setVisibility(View.VISIBLE);
                    insuranceRM.setVisibility(View.VISIBLE);
                    otherRM.setVisibility(View.VISIBLE);
                }else{
                    rentRM.setVisibility(View.GONE);
                    electricityRM.setVisibility(View.GONE);
                    waterRM.setVisibility(View.GONE);
                    internetRM.setVisibility(View.GONE);
                    insuranceRM.setVisibility(View.GONE);
                    otherRM.setVisibility(View.GONE);
                }
            }
        });

    }

    public void splitBills(){
        final EditText rentRM = (EditText) findViewById(R.id.rentRM);
        final EditText electricityRM = (EditText) findViewById(R.id.electricityRM);
        final EditText waterRM = (EditText) findViewById(R.id.waterRM);
        final EditText internetRM = (EditText) findViewById(R.id.internetRM);
        final EditText insuranceRM = (EditText) findViewById(R.id.insuranceRM);
        final EditText otherRM = (EditText) findViewById(R.id.otherRM);

        String temp = "";
        int numRM = 0;
        if(rentRM.getText().toString().isEmpty()){
            numRM = 0;
        }else{
            temp = rentRM.getText().toString();
            numRM = Integer.parseInt(temp);
        }

        if(electricityRM.getText().toString().isEmpty()){
            numRM = 0;
        }else{
            temp = electricityRM.getText().toString();
            numRM = Integer.parseInt(temp);
        }

        if(waterRM.getText().toString().isEmpty()){
            numRM = 0;
        }else{
            temp = waterRM.getText().toString();
            numRM = Integer.parseInt(temp);
        }
        if(internetRM.getText().toString().isEmpty()){
            numRM = 0;
        }else{
            temp = internetRM.getText().toString();
            numRM = Integer.parseInt(temp);
        }
        if(insuranceRM.getText().toString().isEmpty()){
            numRM = 0;
        }else{
            temp = insuranceRM.getText().toString();
            numRM = Integer.parseInt(temp);
        }

        if(otherRM.getText().toString().isEmpty()){
            numRM = 0;
        }else{
            temp = otherRM.getText().toString();
            numRM = Integer.parseInt(temp);
        }


    }
}
