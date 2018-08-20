package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;


public class Facilidade{

    private static final String FIELD_FACILIDADE = "facilidade";
    private static final String FIELD_ID_CATEGORIA = "id_categoria";
    private static final String FIELD_CATEGORIA = "categoria";


    @SerializedName(FIELD_FACILIDADE)
    private String mFacilidade;
    @SerializedName(FIELD_ID_CATEGORIA)
    private int mIdCategorium;
    @SerializedName(FIELD_CATEGORIA)
    private String mCategorium;


    public Facilidade(){

    }

    public void setFacilidade(String facilidade) {
        mFacilidade = facilidade;
    }

    public String getFacilidade() {
        return mFacilidade;
    }

    public void setIdCategorium(int idCategorium) {
        mIdCategorium = idCategorium;
    }

    public int getIdCategorium() {
        return mIdCategorium;
    }

    public void setCategorium(String categorium) {
        mCategorium = categorium;
    }

    public String getCategorium() {
        return mCategorium;
    }

    @Override
    public String toString(){
        return "facilidade = " + mFacilidade + ", idCategorium = " + mIdCategorium + ", categorium = " + mCategorium;
    }


}