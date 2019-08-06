package com.example.jumlahbilangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText bil1,bil2;
    private Button hitung;
    private TextView hasil;
    int angka1 = 0, angka2 = 0, total;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initUI(){
        bil1 = findViewById(R.id.edtBil1);
        bil2 = findViewById(R.id.edtBil2);
        hasil = findViewById(R.id.txtHasil);
        hitung = findViewById(R.id.hitung);
    }
    private void initEvent(){
        hitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                hitungjumlah();
            }
        });
    }

    public void hitungjumlah(){
        if (bil1.getText().toString().equals("") || bil2.getText().toString().equals("")){
            bil1.setError("Field Tidak Boleh Kosong");
            bil2.setError("Field Tidak Boleh Kosong");
        }else {
            angka1 = Integer.parseInt(bil1.getText().toString());
            angka2 = Integer.parseInt(bil2.getText().toString());
            total = angka1 + angka2;
        }
        hasil.setText(total+"");
    }
}
