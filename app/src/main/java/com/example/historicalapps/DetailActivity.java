package com.example.historicalapps;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_GAMBAR = "extra_gambar";
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_ZAMAN = "extra_zaman";
    public static final String EXTRA_LOKASI = "extra_lokasi";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_JENIS = "extra jenis";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView namaView = findViewById(R.id.textNameDetail);
        TextView zamanView = findViewById(R.id.textZamanDetail);
        TextView lokasiView = findViewById(R.id.textLokasiDetails);
        TextView deskripsiView = findViewById(R.id.textDeskripsiDetails);
        TextView jenisView = findViewById(R.id.textJenisBendaDetail);
        ImageView imgview = findViewById(R.id.img_view);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        String zaman = getIntent().getStringExtra(EXTRA_ZAMAN);
        String lokasi = getIntent().getStringExtra(EXTRA_LOKASI);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        String jenis = getIntent().getStringExtra(EXTRA_JENIS);
        String gambar = getIntent().getStringExtra(EXTRA_GAMBAR);

        getSupportActionBar().setTitle(nama);


        Glide.with(this)
                .load(gambar)
                .apply(new RequestOptions().override(500, 500))
                .into(imgview);

        namaView.setText(nama);
        zamanView.setText(zaman);
        lokasiView.setText(lokasi);
        deskripsiView.setText(deskripsi);
        jenisView.setText(jenis);
    }
}
