package com.example.ctapdevl_simpleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText name, middle, surname, email, telno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.personalFName);
        middle = findViewById(R.id.personalMName);
        surname = findViewById(R.id.personalLName);
        email = findViewById(R.id.personalEadd);
        telno = findViewById(R.id.personalTelNo);

        String username = getIntent().getStringExtra("keyname");
        String middleName = getIntent().getStringExtra("keymiddle");
        String userSurname = getIntent().getStringExtra("keysurname");
        String userEmail = getIntent().getStringExtra("keyEmail");
        String userTel = getIntent().getStringExtra("keyTel");

        name.setText(username);
        middle.setText(middleName);
        surname.setText(userSurname);
        email.setText(userEmail);
        telno.setText(userTel);
    }

    public void btnPHome(View view){
        Intent i1 = new Intent(MainActivity2.this, MainActivity.class);
        MainActivity2.this.startActivity(i1);
    }
}