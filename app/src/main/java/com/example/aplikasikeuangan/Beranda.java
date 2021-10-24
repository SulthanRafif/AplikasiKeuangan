package com.example.aplikasikeuangan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Beranda extends AppCompatActivity {

    private CashViewModel cashViewModel;

    private String total_pemasukan;
    private String total_pengeluaran;

    private int totalPemasukan;
    private int totalPengeluaran;

    TextView textTotalPemasukan;
    TextView textTotalPengeluaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        cashViewModel = (CashViewModel) new ViewModelProvider(this).get(CashViewModel.class);

        totalPemasukan = cashViewModel.getJumlahPemasukan();
        totalPengeluaran = cashViewModel.getJumlahPengeluaran();

        textTotalPemasukan = (TextView) findViewById(R.id.labelJumlahPemasukan);
        textTotalPengeluaran = (TextView) findViewById(R.id.labelJumlahPengeluaran);

        total_pemasukan = "Pemasukan: " + totalPemasukan;
        total_pengeluaran = "Pengeluaran: " + totalPengeluaran;

        textTotalPemasukan.setText(total_pemasukan);
        textTotalPengeluaran.setText(total_pengeluaran);

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