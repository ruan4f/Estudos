package com.ruanferreira.buscahoteis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.ruanferreira.buscahoteis.POJO.*;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewOfertas;
    OfertasAdapter ofertasAdapter;
    List<Content> listaOfertas = new ArrayList<>();
    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewOfertas = (RecyclerView) findViewById(R.id.hotelListRecyclerView);
        recyclerViewOfertas.setLayoutManager(new LinearLayoutManager(this));
        apiInterface = APIOfertas.getClient().create(APIInterface.class);

        Call<Oferta> call = apiInterface.doGetListHoteis();
        call.enqueue(new Callback<Oferta>() {
            @Override
            public void onResponse(Call<Oferta> call, Response<Oferta> response) {
                Log.d("TAG",response.code()+"");

                Oferta resource = response.body();
                listaOfertas = resource.getContents();

                ofertasAdapter = new OfertasAdapter(listaOfertas, R.layout.list_item_oferta);
                recyclerViewOfertas.setAdapter(ofertasAdapter);
            }

            @Override
            public void onFailure(Call<Oferta> call, Throwable t) {
                call.cancel();
            }
        });
    }
}
