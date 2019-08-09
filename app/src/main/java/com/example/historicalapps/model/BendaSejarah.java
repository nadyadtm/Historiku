package com.example.historicalapps.model;

public class BendaSejarah {
    private String gambarbenda;
    private String namabenda;
    private String zaman;
    private String lokasi;
    private String deskripsi;
    private String jenis;

    public BendaSejarah(String gambarbenda, String namabenda, String zaman, String lokasi, String deskripsi, String jenis) {
        this.gambarbenda = gambarbenda;
        this.namabenda = namabenda;
        this.zaman = zaman;
        this.lokasi = lokasi;
        this.deskripsi = deskripsi;
        this.jenis=jenis;
    }

    public String getGambarbenda() {
        return gambarbenda;
    }

    public void setGambarbenda(String gambarbenda) {
        this.gambarbenda = gambarbenda;
    }

    public String getNamabenda() {
        return namabenda;
    }

    public void setNamabenda(String namabenda) {
        this.namabenda = namabenda;
    }

    public String getZaman() {
        return zaman;
    }

    public void setZaman(String zaman) {
        this.zaman = zaman;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

}
