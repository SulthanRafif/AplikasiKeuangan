package com.example.aplikasikeuangan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CashDetailItemAdapter extends RecyclerView.Adapter<CashDetailItemAdapter.ExampleViewHolder> {
    private ArrayList<CashDetailItem> mCashDetailItem;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView gambarPanah;
        public TextView ketNominal;
        public TextView ketKeterangan;
        public TextView ketTanggal;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            gambarPanah = itemView.findViewById(R.id.gambarPanah);
            ketNominal = itemView.findViewById(R.id.ketNominal);
            ketKeterangan = itemView.findViewById(R.id.ketKeterangan);
            ketTanggal = itemView.findViewById(R.id.ketTanggal);
        }
    }

    public CashDetailItemAdapter(ArrayList<CashDetailItem> CashDetailItemList) {
        mCashDetailItem = CashDetailItemList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cash_detail, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        CashDetailItem currentItem = mCashDetailItem.get(position);

        holder.gambarPanah.setImageResource(currentItem.getGambarPanah());
        holder.ketNominal.setText(currentItem.getKetNominal());
        holder.ketKeterangan.setText(currentItem.getKetKeterangan());
        holder.ketTanggal.setText(currentItem.getKetTanggal());
    }

    @Override
    public int getItemCount() {
        return mCashDetailItem.size();
    }
}
