package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;


public class Estabelecimento{

    private static final String FIELD_ESTABELECIMENTO_TIPO = "estabelecimento_tipo";
    private static final String FIELD_ID_ESTABELECIMENTO = "id_estabelecimento";
    private static final String FIELD_ESTABELECIMENTO_PUBLICADO = "estabelecimento_publicado";
    private static final String FIELD_DESCRICAO_ESTABELECIMENTO = "descricao_estabelecimento";
    private static final String FIELD_NOME_ESTABELECIMENTO = "nome_estabelecimento";


    @SerializedName(FIELD_ESTABELECIMENTO_TIPO)
    private int mEstabelecimentoTipo;
    @SerializedName(FIELD_ID_ESTABELECIMENTO)
    private int mIdEstabelecimento;
    @SerializedName(FIELD_ESTABELECIMENTO_PUBLICADO)
    private int mEstabelecimentoPublicado;
    @SerializedName(FIELD_DESCRICAO_ESTABELECIMENTO)
    private String mDescricaoEstabelecimento;
    @SerializedName(FIELD_NOME_ESTABELECIMENTO)
    private String mNomeEstabelecimento;


    public Estabelecimento(){

    }

    public void setEstabelecimentoTipo(int estabelecimentoTipo) {
        mEstabelecimentoTipo = estabelecimentoTipo;
    }

    public int getEstabelecimentoTipo() {
        return mEstabelecimentoTipo;
    }

    public void setIdEstabelecimento(int idEstabelecimento) {
        mIdEstabelecimento = idEstabelecimento;
    }

    public int getIdEstabelecimento() {
        return mIdEstabelecimento;
    }

    public void setEstabelecimentoPublicado(int estabelecimentoPublicado) {
        mEstabelecimentoPublicado = estabelecimentoPublicado;
    }

    public int getEstabelecimentoPublicado() {
        return mEstabelecimentoPublicado;
    }

    public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
        mDescricaoEstabelecimento = descricaoEstabelecimento;
    }

    public String getDescricaoEstabelecimento() {
        return mDescricaoEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        mNomeEstabelecimento = nomeEstabelecimento;
    }

    public String getNomeEstabelecimento() {
        return mNomeEstabelecimento;
    }

    @Override
    public String toString(){
        return "estabelecimentoTipo = " + mEstabelecimentoTipo + ", idEstabelecimento = " + mIdEstabelecimento + ", estabelecimentoPublicado = " + mEstabelecimentoPublicado + ", descricaoEstabelecimento = " + mDescricaoEstabelecimento + ", nomeEstabelecimento = " + mNomeEstabelecimento;
    }


}