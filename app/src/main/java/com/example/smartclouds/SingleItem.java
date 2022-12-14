package com.example.smartclouds;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_item);

//        get values passed from hte list view

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String subtitle = intent.getStringExtra("subtitle");

        Bundle bundle = getIntent().getExtras();
        int image = bundle.getInt("image");

        TextView Title, Subtitle;
        Title = findViewById(R.id.title);
        Title.setText(title);


        Subtitle = findViewById(R.id.subtitle);
        Subtitle.setText(subtitle);



        ImageView Image = findViewById(R.id.image);
        Image.setImageResource(image);

//        Button to open call dial to call for a booking
        Button callButton = findViewById(R.id.phone_call);
        callButton.setMaxWidth(100);
        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0777001122"));

                if (ContextCompat.checkSelfPermission(SingleItem.this,
                        Manifest.permission.CALL_PHONE)
                        != PackageManager.PERMISSION_GRANTED) {

                    ActivityCompat.requestPermissions(SingleItem.this,
                            new String[]{Manifest.permission.CALL_PHONE},
                            1);

                } else {
                    //You already have permission
                    try {
                        startActivity(callIntent);
                    } catch(SecurityException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}