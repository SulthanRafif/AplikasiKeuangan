package com.example.aplikasikeuangan;

public class CashDetailItem {
    private int gambarPanah;
    private String ketNominal;
    private String ketKeterangan;
    private String ketTanggal;

    public CashDetailItem(int gambarPanah, String ketNominal, String ketKeterangan, String  ketTanggal) {
        this.gambarPanah = gambarPanah;
        this.ketNominal = ketNominal;
        this.ketKeterangan = ketKeterangan;
        this.ketTanggal = ketTanggal;
    }

    public int getGambarPanah() {
        return gambarPanah;
    }

    public String getKetNominal() {
        return ketNominal;
    }

    public String getKetKeterangan() {
        return ketKeterangan;
    }

    public String getKetTanggal() {
        return ketTanggal;
    }
}
