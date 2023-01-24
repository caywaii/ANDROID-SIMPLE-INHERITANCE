package com.example.ctapdevl_simpleinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.net.Uri;
import android.widget.EditText;


public class MainActivity4 extends AppCompatActivity {
    private EditText typeURL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        typeURL = findViewById(R.id.urlUrl);
    }

    public void btnUHome(View view){
        Intent i1 = new Intent(MainActivity4.this, MainActivity.class);
        MainActivity4.this.startActivity(i1);
    }

    public void btnNavigate(View view){
        String url = "http://" + typeURL.getText().toString();
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}