package com.example.quyo.billscalculatorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Income extends AppCompatActivity {

     double rent = 0.0;
     double electric = 0.0;
     double water = 0.0;
     double internet = 0.0;
     double insurance = 0.0;
     double other = 0.0;
     int rentRM = 0;
     int electricRM = 0;
     int waterRM = 0;
     int internetRM = 0;
     int insuranceRM = 0;
     int otherRM = 0;
     boolean state = false;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        final EditText income = (EditText) findViewById(R.id.incomeBox);
        final Button sumbitBtn = (Button) findViewById(R.id.submitBtn);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            rent = extras.getDouble("Rent");
            electric = extras.getDouble("Electric");
            water = extras.getDouble("Water");
            internet = extras.getDouble("Internet");
            insurance = extras.getDouble("Insurance");
            other = extras.getDouble("Other");
            rentRM = extras.getInt("RentRM");
            electricRM = extras.getInt("ElectricRM");
            waterRM = extras.getInt("WaterRM");
            internetRM = extras.getInt("InternetRM");
            insuranceRM = extras.getInt("InsuranceRM");
            otherRM = extras.getInt("OtherRM");
            state = extras.getBoolean("State");
        }

        sumbitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBills(rent, electric, water, internet, insurance, other, rentRM, electricRM, waterRM, internetRM, insuranceRM, otherRM, income);
                Intent displayScreen = new Intent(Income.this, Display.class);
                displayScreen.putExtra("Rent", rent);
                displayScreen.putExtra("Electricity", electric);
                displayScreen.putExtra("Water", water);
                displayScreen.putExtra("Internet", internet);
                displayScreen.putExtra("Insurance", insurance);
                displayScreen.putExtra("RentRMPay", rentRMPay);
                displayScreen.putExtra("ElectricRMPay", electricRMPay);
                displayScreen.putExtra("WaterRMPay", waterRMPay);
                displayScreen.putExtra("InternetRMPay", insuranceRMPay);
                displayScreen.putExtra("InsuranceRMPay", internetRMPay);
                displayScreen.putExtra("OtherRMPay", otherRMPay);
                displayScreen.putExtra("Income", incomeAmount);
                displayScreen.putExtra("afterBills", afterBills);

                //Start Activity
                startActivity(displayScreen);
            }
        });
    }

    public void calculateBills(double rent, double electric, double water, double internet,
                           double insurance, double other, int rentRM, int electricRM, int waterRM,
                           int internetRM, int insuranceRM, int otherRM, EditText income){
        if(state == true){
            if(rent > 0) {
                rentRMPay = rent / rentRM;
            }
            if(electric > 0) {
                electricRMPay = electric / electricRM;
            }
            if(water > 0) {
                waterRMPay = water / waterRM;
            }
            if(internet > 0) {
                internetRMPay = internet / internetRM;
            }
            if(insurance > 0) {
                insuranceRMPay = insurance / insuranceRM;
            }
            if(other > 0) {
                otherRMPay = other / otherRM;
            }
        } else{
            rentRMPay = 0;
            electricRMPay = 0;
            waterRMPay = 0;
            internetRMPay = 0;
            insuranceRMPay = 0;
            otherRMPay = 0;
        }

        if(rent > 0){
            myRent = rentRMPay - rent;
        }
        if(electric > 0) {
            myElectric = electricRMPay - electric;
        }
        if(water > 0) {
            myWater = waterRMPay - water;
        }
        if(internet > 0) {
            myInternet = internetRMPay - internet;
        }
        if(insurance > 0) {
            myInsurance = insuranceRMPay - insurance;
        }
        if(other > 0) {
            myOther = otherRMPay - other;
        }

        incomeAmount = Double.parseDouble(income.getText().toString());
        afterBills = incomeAmount - myRent - myElectric - myWater - myInternet - myInsurance - myOther;
    }
}
