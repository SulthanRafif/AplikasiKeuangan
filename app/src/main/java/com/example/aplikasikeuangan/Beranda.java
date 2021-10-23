package com.example.aplikasikeuangan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        ImageButton btnPemasukan = findViewById(R.id.labelTambahPemasukan);
        ImageButton btnPengeluaran = findViewById(R.id.labelTambahPengeluaran);
        ImageButton btnDetailCashFlow = findViewById(R.id.labelDetailCashFlow);
        ImageButton btnPengaturan = findViewById(R.id.labelPengaturan);
        ImageButton btnLogout = findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beranda.this, Login.class));
            }
        });

        btnPemasukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beranda.this, Pemasukan.class));
            }
        });

        btnPengeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beranda.this, Pengeluaran.class));
            }
        });

        btnDetailCashFlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beranda.this, CashFlow.class));
            }
        });

        btnPengaturan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Beranda.this, Pengaturan.class));
            }
        });


    }
}