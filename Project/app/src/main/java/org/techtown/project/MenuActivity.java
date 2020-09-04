package org.techtown.project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_LINE1 = 201;
    public static final int REQUEST_CODE_LINE2= 202;
    public static final int REQUEST_CODE_LINE3 = 203;
    public static final int REQUEST_CODE_LINE4 = 204;
    public static final int REQUEST_CODE_LINE5 = 205;
    public static final int REQUEST_CODE_CONTACT = 206;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent receivedIntent = getIntent();
        String username = receivedIntent.getStringExtra("username");
        String password = receivedIntent.getStringExtra("password");

        Toast.makeText(this, "username : " + username + "님 환영합니다 !", Toast.LENGTH_LONG).show();

        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("message", "로그인 화면으로 돌아갑니다.");

                //setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button contactButton = findViewById(R.id.contactButton);
        contactButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), ContactActivity.class);
                startActivityForResult(intent,REQUEST_CODE_CONTACT);
            }
        });

        Button menu01Button = (Button) findViewById(R.id.menu01Button);
        menu01Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Line1Activity.class);
                intent.putExtra("titleMsg", "LINE1");

                startActivityForResult(intent, REQUEST_CODE_LINE1);
            }
        });

        Button menu02Button = (Button) findViewById(R.id.menu02Button);
        menu02Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Line2Activity.class);
                intent.putExtra("titleMsg", "LINE2");

                startActivityForResult(intent, REQUEST_CODE_LINE2);
            }
        });

        Button menu03Button = (Button) findViewById(R.id.menu03Button);
        menu03Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Line3Activity.class);
                intent.putExtra("titleMsg", "상품관리 화면");

                startActivityForResult(intent, REQUEST_CODE_LINE3);
            }
        });
        Button menu04Button = (Button) findViewById(R.id.menu04Button);
        menu03Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Line4Activity.class);
                intent.putExtra("titleMsg", "LINE4");

                startActivityForResult(intent, REQUEST_CODE_LINE4);
            }
        });
        Button menu05Button = (Button) findViewById(R.id.menu05Button);
        menu03Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Line5Activity.class);
                intent.putExtra("titleMsg", "LINE5");

                startActivityForResult(intent, REQUEST_CODE_LINE5);
            }
        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (intent != null) {
            if (requestCode == REQUEST_CODE_LINE1) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "LINE1에 접속되었습니다", Toast.LENGTH_LONG);
                    toast.show();
                }
            } else if (requestCode == REQUEST_CODE_LINE2) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "LINE2에 접속되었습니다", Toast.LENGTH_LONG);
                    toast.show();
                }
            } else if (requestCode == REQUEST_CODE_LINE3) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "LINE3에 접속되었습니다", Toast.LENGTH_LONG);
                    toast.show();
                }
            }else if (requestCode == REQUEST_CODE_LINE4) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "LINE4에 접속되었습니다", Toast.LENGTH_LONG);
                    toast.show();
                }
            }else if (requestCode == REQUEST_CODE_LINE5) {
                String message = intent.getStringExtra("message");

                if (message != null) {
                    Toast toast = Toast.makeText(getBaseContext(), "LINE5에 접속되었습니다", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        }

    }

}
