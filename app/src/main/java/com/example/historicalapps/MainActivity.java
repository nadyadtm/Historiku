package com.example.historicalapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.historicalapps.model.BendaSejarah;
import com.example.historicalapps.model.ListBendaSejarah;
import com.example.historicalapps.myrecyclerview.adapter.CardViewAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvBenda;
    private ArrayList<BendaSejarah> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("List Benda Bersejarah");

        rvBenda = findViewById(R.id.rv_benda);
        rvBenda.setHasFixedSize(true);

        list.addAll(ListBendaSejarah.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvBenda.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cardViewHeroAdapter=new CardViewAdapter(list);
        rvBenda.setAdapter(cardViewHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.about_me_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about_me:
                Intent intent=new Intent(MainActivity.this,AboutUsActivity.class);
                startActivity(intent);
                break;
        }
    }

}
