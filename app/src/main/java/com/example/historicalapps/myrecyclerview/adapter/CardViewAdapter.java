package com.example.historicalapps.myrecyclerview.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.historicalapps.DetailActivity;
import com.example.historicalapps.MainActivity;
import com.example.historicalapps.R;
import com.example.historicalapps.model.BendaSejarah;

import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewViewHolder>{

    private ArrayList<BendaSejarah> listBenda;

    public CardViewAdapter(ArrayList<BendaSejarah> listBenda) {
        this.listBenda = listBenda;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_view,viewGroup,false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewAdapter.CardViewViewHolder holder, int position) {
        final BendaSejarah bendaSejarah = listBenda.get(position);

        Glide.with(holder.itemView.getContext())
                .load(bendaSejarah.getGambarbenda())
                .apply(new RequestOptions().override(300, 300))
                .into(holder.imgPhoto);

        holder.textNama.setText(bendaSejarah.getNamabenda());
        holder.textZaman.setText(bendaSejarah.getZaman());

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent moveWithDataIntent = new Intent(view.getContext(), DetailActivity.class);
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_GAMBAR,bendaSejarah.getGambarbenda());
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAMA,bendaSejarah.getNamabenda());
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_ZAMAN, bendaSejarah.getZaman());
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_LOKASI,bendaSejarah.getLokasi());
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_DESKRIPSI, bendaSejarah.getDeskripsi());
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_JENIS,bendaSejarah.getJenis());
                view.getContext().startActivity(moveWithDataIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBenda.size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView textNama;
        TextView textZaman;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_items);
            textNama = itemView.findViewById(R.id.textName);
            textZaman = itemView.findViewById(R.id.textZaman);
        }
    }
}
