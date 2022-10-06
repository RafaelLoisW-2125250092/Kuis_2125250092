package com.if3a.kuis_2125250092;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    private EditText etNama, etEmail;
    private Spinner spNegara;
    private Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = findViewById(R.id.et_username);
        etEmail = findViewById(R.id.et_email);
        spNegara = findViewById(R.id.sp_country);

        btnSignup = findViewById(R.id.btn_signup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, email, negara;

                username = etNama.getText().toString();
                email = etEmail.getText().toString();
                negara = spNegara.getSelectedItem().toString();

                if (username.trim().equals("")) {
                    etNama.setError("Nama Tidak Boleh Kosong");
                } else if (email.trim().equals("")) {
                    etEmail.setError("Nama Tidak Boleh Kosong");
                } else {
                    Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                    intent.putExtra("varNama", username);
                    intent.putExtra("varEmail", email);
                    intent.putExtra("varNegara", negara);
                    startActivity(intent);
                }
            }
        });
    }
}
