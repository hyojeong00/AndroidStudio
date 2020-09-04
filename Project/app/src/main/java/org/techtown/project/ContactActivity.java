package org.techtown.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContactActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_CONTACT=206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        Button callButton = findViewById(R.id.callButton);
        callButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-3432-4378"));
                startActivity(intent);
            }
        });

        Button smsButton = findViewById(R.id.smsButton);
        smsButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(getApplicationContext(),smsActivity.class);
                startActivityForResult(intent, REQUEST_CODE_CONTACT);
            }
        });
    }
}