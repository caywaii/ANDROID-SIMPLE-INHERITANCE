package com.example.ctapdevl_simpleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private EditText name, middle, surname, email, telno;
    private EditText street, city, zipcode, province, barangay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.homeFName);
        middle= findViewById(R.id.homeMName);
        surname = findViewById(R.id.homeLName);
        email = findViewById(R.id.homeEadd);
        telno = findViewById(R.id.homeTelNo);

        //ADDRESS
        street = findViewById(R.id.homeStreet);
        barangay = findViewById(R.id.homeBrgy);
        city = findViewById(R.id.homeCity);
        zipcode = findViewById(R.id.homeZcode);
        province = findViewById(R.id.homrProv);
    }

    public void btnHomePpage(View view){
        String username = name.getText().toString();
        String middlename = middle.getText().toString();
        String surnamename = surname.getText().toString();
        String emailAdd = email.getText().toString();
        String number = telno.getText().toString();

        Intent i1 = new Intent(MainActivity.this, MainActivity2.class);
        i1.putExtra("keyname", username);
        i1.putExtra("keymiddle", middlename);
        i1.putExtra("keysurname", surnamename);
        i1.putExtra("keyEmail", emailAdd);
        i1.putExtra("keyTel", number);
        MainActivity.this.startActivity(i1);
    }

    public void btnHomeApage(View view){
        String streetz = street.getText().toString();
        String barangayz = barangay.getText().toString();
        String cityz = city.getText().toString();
        String zipCode = zipcode.getText().toString();
        String prov = province.getText().toString();

        Intent i1 = new Intent(MainActivity.this, MainActivity3.class);
        i1.putExtra("keyStreet", streetz);
        i1.putExtra("keyBarangay", barangayz);
        i1.putExtra("keyCity", cityz);
        i1.putExtra("keyZip", zipCode);
        i1.putExtra("keyProv", prov);
        MainActivity.this.startActivity(i1);



    }

    public void btnHomeUpage(View view){
        Intent i1 = new Intent(MainActivity.this, MainActivity4.class);
        MainActivity.this.startActivity(i1);
    }
}