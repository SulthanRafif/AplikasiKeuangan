package com.example.aplikasikeuangan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CashFlow extends AppCompatActivity {
    private RecyclerView mRecycleView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cash_flow);

        ArrayList<CashDetailItem> cashFlowItem = new ArrayList<>();
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 500.000", "Dapet Sangu Dari Ayah", "25-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_outcome, "[ - ] Rp 400.000", "Sangu Diambil Ibu", "26-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 300.000", "Dapet Sangu Dari Kakak", "27-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 500.000", "Dapet Sangu Dari Ayah", "25-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_outcome, "[ - ] Rp 400.000", "Sangu Diambil Ibu", "26-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 300.000", "Dapet Sangu Dari Kakak", "27-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 500.000", "Dapet Sangu Dari Ayah", "25-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_outcome, "[ - ] Rp 400.000", "Sangu Diambil Ibu", "26-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 300.000", "Dapet Sangu Dari Kakak", "27-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 500.000", "Dapet Sangu Dari Ayah", "25-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_outcome, "[ - ] Rp 400.000", "Sangu Diambil Ibu", "26-25-2021"));
        cashFlowItem.add(new CashDetailItem(R.drawable.arrow_income, "[ + ] Rp 300.000", "Dapet Sangu Dari Kakak", "27-25-2021"));

        mRecycleView = findViewById(R.id.recycleView);
        mRecycleView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new CashDetailItemAdapter(cashFlowItem);

        mRecycleView.setLayoutManager(mLayoutManager);
        mRecycleView.setAdapter(mAdapter);

    }
}