package com.example.quyo.billscalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    double rent = 0.0;
    double electric = 0.0;
    double water = 0.0;
    double internet = 0.0;
    double insurance = 0.0;
    double other = 0.0;
    double rentRMPay = 0.0;
    double electricRMPay = 0.0;
    double waterRMPay = 0.0;
    double internetRMPay = 0.0;
    double insuranceRMPay = 0.0;
    double otherRMPay = 0.0;
    double myRent = 0.0;
    double myElectric = 0.0;
    double myWater = 0.0;
    double myInternet = 0.0;
    double myInsurance = 0.0;
    double myOther = 0.0;
    double incomeAmount = 0.0;
    double afterBills = 0.0;
    double income = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        final TextView display = (TextView) findViewById(R.id.displayBox);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            rent = extras.getDouble("Rent");
            electric = extras.getDouble("Electric");
            water = extras.getDouble("Water");
            internet = extras.getDouble("Internet");
            insurance = extras.getDouble("Insurance");
            other = extras.getDouble("Other");
            rentRMPay = extras.getInt("RentRMPay");
            electricRMPay = extras.getInt("ElectricRMPay");
            waterRMPay = extras.getInt("WaterRM");
            internetRMPay = extras.getInt("InternetRMPay");
            insuranceRMPay = extras.getInt("InsuranceRMPay");
            otherRMPay = extras.getInt("OtherRMPay");
            income = extras.getInt("Income");
            afterBills = extras.getInt("afterBills");
        }

        StringBuilder displayBox = new StringBuilder(250);
        //display.append();
        display.setText(displayBox);
    }
}
