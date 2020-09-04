package org.techtown.practice08;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ProductActivity extends AppCompatActivity {
    TextView titleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        titleText=findViewById(R.id.titleText);

        // process received intent
        Intent receiveIntent = getIntent();
        String titleMsg=receiveIntent.getStringExtra("titleMsg");

        Toast.makeText(this,"titleMsg : "+titleMsg, Toast.LENGTH_LONG).show();;

        if(titleText !=null)
        {
            titleText.setText(titleMsg);
        }

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("message","result message is OK!");

                setResult(Activity.RESULT_OK,resultIntent);
                finish();
            }
        });
    }
}