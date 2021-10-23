package com.example.aplikasikeuangan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class Pengeluaran extends AppCompatActivity {

    private CashViewModel cashViewModel;

    private EditText etDate;
    private EditText editTextNominal;
    private EditText editTextKeterangan;

    int nominal_pengeluaran = 0;

    private String date;

    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengeluaran);

        editTextNominal = findViewById(R.id.nominal_pengeluaran);
        editTextKeterangan = findViewById(R.id.keterangan_pengeluaran);

        Button btnKembali = findViewById(R.id.btnKembaliPengeluaran);

        Button btnSimpan = findViewById(R.id.btnSimpanPengeluaran);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keterangan_pengeluaran = editTextKeterangan.getText().toString();
                String tanggal_pengeluaran = date;

                if (keterangan_pengeluaran.isEmpty() || tanggal_pengeluaran.isEmpty()) {
                    Log.d("DATA KOSONG", "DATA TIDAK DIMASUKKAN");
                } else {
                    nominal_pengeluaran = Integer.parseInt(editTextNominal.getText().toString());

                    CashItem cashItem = new CashItem(nominal_pengeluaran, keterangan_pengeluaran, tanggal_pengeluaran, 1);

                    Log.d("NOMINAL PENGELUARAN_1", Integer.toString(nominal_pengeluaran) );
                    Log.d("KETERANGAN PENGELUARAN1", keterangan_pengeluaran );
                    Log.d("TANGGAL PENGELUARAN_1", tanggal_pengeluaran );

                    Log.d("CASH ITEM_KET", cashItem.getKeterangan());
                    Log.d("CASH ITEM_NOM", Integer.toString(cashItem.getNominal()));
                    Log.d("CASH ITEM_TGL", cashItem.getTanggal());


                    Intent intent = new Intent(getBaseContext(), CashFlow.class);
                    intent.putExtra("NOMINAL", nominal_pengeluaran);
                    intent.putExtra("KETERANGAN", keterangan_pengeluaran);
                    intent.putExtra("TANGGAL", tanggal_pengeluaran);
                    intent.putExtra("STATUS", 0);
                    startActivity(intent);

                }
            }
        });

        etDate = findViewById(R.id.et_date_pengeluaran);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        btnKembali.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pengeluaran.this, Beranda.class));
            }
        });

        etDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        Pengeluaran.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int day) {
                        month = month + 1;
                        date = day+"/"+month+"/"+year;
                        etDate.setText(date);
                    }
                }, year,month,day);
                datePickerDialog.show();
            }
        });
    }
}