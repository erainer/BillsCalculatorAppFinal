package com.example.quyo.billscalculatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;

public class Bills extends AppCompatActivity {

    private double rentSplit = 0;
    private double electricSplit = 0;
    private double waterSplit = 0;
    private double internetSplit = 0;
    private double insuranceSplit = 0;
    private double otherSplit = 0;
    boolean state = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bills);
        final Button nextBtn = (Button) findViewById(R.id.nextBtn);
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

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextScreen = new Intent(Bills.this, Display.class);
                nextScreen.putExtra("Rent", rent.getText());
                nextScreen.putExtra("Electricity", electricity.getText().toString());
                nextScreen.putExtra("Water", water.getText().toString());
                nextScreen.putExtra("Internet", internet.getText().toString());
                nextScreen.putExtra("Insurance", insurance.getText().toString());
                nextScreen.putExtra("RentRM", rentSplit);
                nextScreen.putExtra("ElectricRM", electricSplit);
                nextScreen.putExtra("WaterRM", waterSplit);
                nextScreen.putExtra("InternetRM", insuranceSplit);
                nextScreen.putExtra("InsuranceRM", internetSplit);
                nextScreen.putExtra("OtherRM", otherSplit);
                nextScreen.putExtra("State", state);

                //Start Activity
                startActivity(nextScreen);
                setContentView(R.layout.activity_bills);

            }
        });

        RM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    rentRM.setVisibility(View.VISIBLE);
                    electricityRM.setVisibility(View.VISIBLE);
                    waterRM.setVisibility(View.VISIBLE);
                    internetRM.setVisibility(View.VISIBLE);
                    insuranceRM.setVisibility(View.VISIBLE);
                    otherRM.setVisibility(View.VISIBLE);
                } else {
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
}
