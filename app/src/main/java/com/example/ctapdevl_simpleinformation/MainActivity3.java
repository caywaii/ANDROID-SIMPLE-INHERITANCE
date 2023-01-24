package com.example.ctapdevl_simpleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {
    private EditText street, city, zipcode, province, barangay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        street = findViewById(R.id.addStreet);
        barangay = findViewById(R.id.addBrgy);
        city = findViewById(R.id.addCity);
        zipcode = findViewById(R.id.addZcode);
        province = findViewById(R.id.addProv);

        String streetz = getIntent().getStringExtra("keyStreet");
        String barangayz = getIntent().getStringExtra("keyBarangay");
        String cityz = getIntent().getStringExtra("keyCity");
        String zipCode = getIntent().getStringExtra("keyZip");
        String prov = getIntent().getStringExtra("keyProv");

        street.setText(streetz);
        barangay.setText(barangayz);
        city.setText(cityz);
        zipcode.setText(zipCode);
        province.setText(prov);
    }
    public void btnAHome(View view){
        Intent i1 = new Intent(MainActivity3.this, MainActivity.class);
        MainActivity3.this.startActivity(i1);
    }
}