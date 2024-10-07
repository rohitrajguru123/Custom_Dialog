package com.example.custom_dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button way1,login;
    EditText edusername,edpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
      iniViews();
      initListners();
    }

    private void iniViews() {
         way1 = findViewById(R.id.way1);

    }
    private void initListners() {

        way1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.customdialog);

                edusername = dialog.findViewById(R.id.edusername);
                edpass = dialog.findViewById(R.id.edpass);
                login = dialog.findViewById(R.id.login);

                login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "Login", Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.show();
            }
        });
    }

}