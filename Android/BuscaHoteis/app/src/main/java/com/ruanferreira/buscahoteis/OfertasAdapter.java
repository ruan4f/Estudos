package com.ruanferreira.buscahoteis;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ruanferreira.buscahoteis.POJO.Content;

import java.util.List;

/**
 * Created by ruanf on 12/03/2017.
 */

public class OfertasAdapter extends RecyclerView.Adapter<OfertasAdapter.HotelViewHolder>{

    private List<Content> ofertas;
    private int rowLayout;

    public OfertasAdapter(List<Content> ofertas, int rowLayout) {
        this.ofertas = ofertas;
        this.rowLayout = rowLayout;
    }

    @Override
    public HotelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(HotelViewHolder holder, final int position) {
        holder.name.setText(ofertas.get(position).getTituloOfertum());
        holder.details.setText(ofertas.get(position).getTituloOfertum());
    }

    @Override
    public int getItemCount() {
        return ofertas.size();
    }

    public static class HotelViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView details;

        public HotelViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.txtTituloOferta);
            details = (TextView) v.findViewById(R.id.txtValorPromocional);
        }
    }

}
