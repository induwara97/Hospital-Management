package com.example.hospital_management;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String userName;
    TextView txtViewUser;
    Button docBtn, drugBtn, patientBtn, staffBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle userData = getIntent().getExtras();
        if(userData == null) {
            return;
        }
        userName = "Login as " + userData.getString("userName");
        txtViewUser = (TextView) findViewById(R.id.txtUser);
        txtViewUser.setText(userName);

        docBtn = findViewById(R.id.btn_doc);
        drugBtn = findViewById(R.id.btn_drug);
        patientBtn = findViewById(R.id.btn_patient);
        staffBtn = findViewById(R.id.btn_staff);

        docBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, Doctor_Main.class);
                startActivity(intent1);
            }
        });

        drugBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, Activity_Drug_main.class);
                startActivity(intent2);
            }
        });
    }

    public void staffMenu(View view) {
        Intent intent = new Intent(this, staff_menu.class);
        startActivity(intent);
    }


}
