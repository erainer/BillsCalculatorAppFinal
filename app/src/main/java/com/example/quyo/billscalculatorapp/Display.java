package com.example.quyo.billscalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        //Total Amounts
        final TextView display = (TextView) findViewById(R.id.displayBox);
        final TextView rentAmt = (TextView) findViewById(R.id.rentAmt);
        final TextView electricAmt = (TextView) findViewById(R.id.electricAmt);
        final TextView waterAmt = (TextView) findViewById(R.id.waterAmt);
        final TextView internetAmt = (TextView) findViewById(R.id.internetAmt);
        final TextView insuranceAmt = (TextView) findViewById(R.id.insuranceAmt);
        final TextView otherAmt = (TextView) findViewById(R.id.otherAmt);

        final TextView incomeBefore = (TextView) findViewById(R.id.incomeAmtBefore);
        final TextView incomeAfter = (TextView) findViewById(R.id.incomeAmtAfter);

        final Button startOver = (Button) findViewById(R.id.startOverBtn);


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
            myRent = extras.getInt("myRent");
            myElectric = extras.getInt("myElectricity");
            myWater = extras.getInt("myWater");
            myInternet = extras.getInt("myInternet");
            myInsurance = extras.getInt("myInsurance");
            myOther = extras.getInt("myOther");

        }

        StringBuilder displayBox = new StringBuilder(250);
        display.append("$" + myRent + "\t" + "$" + rentRMPay + "\n\n" +
                "$" + myElectric + "\t" + "$" + electricRMPay + "\n\n" +
                "$" + myWater + "\t" + "$" + waterRMPay + "\n\n" +
                "$" + myInternet + "\t" + "$" + internetRMPay + "\n\n" +
                "$" + myInsurance + "\t" + "$" + insuranceRMPay + "\n\n" +
                "$" + myOther + "\t" + "$" + otherRMPay);
        display.setText(displayBox);
        rentAmt.setText(Double.toString(rent));
        electricAmt.setText(Double.toString(electric));
        waterAmt.setText(Double.toString(water));
        internetAmt.setText(Double.toString(internet));
        insuranceAmt.setText(Double.toString(insurance));
        otherAmt.setText(Double.toString(other));

        incomeBefore.setText(Double.toString(income));
        incomeAfter.setText(Double.toString(afterBills));

        startOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }
        });
    }
}
