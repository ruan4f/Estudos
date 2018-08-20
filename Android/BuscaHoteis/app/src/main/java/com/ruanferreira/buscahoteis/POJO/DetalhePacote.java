package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;


public class DetalhePacote{

    private static final String FIELD_NUM_PESSOAS = "num_pessoas";
    private static final String FIELD_TEXTO_ALTERNATIVO = "texto_alternativo";
    private static final String FIELD_NUM_DIARIAS = "num_diarias";
    private static final String FIELD_REGRAS = "regras";
    private static final String FIELD_PACOTES_RESTANTES = "pacotes_restantes";


    @SerializedName(FIELD_NUM_PESSOAS)
    private int mNumPessoa;
    @SerializedName(FIELD_TEXTO_ALTERNATIVO)
    private String mTextoAlternativo;
    @SerializedName(FIELD_NUM_DIARIAS)
    private int mNumDiaria;
    @SerializedName(FIELD_REGRAS)
    private String mRegra;
    @SerializedName(FIELD_PACOTES_RESTANTES)
    private int mPacotesRestante;


    public DetalhePacote(){

    }

    public void setNumPessoa(int numPessoa) {
        mNumPessoa = numPessoa;
    }

    public int getNumPessoa() {
        return mNumPessoa;
    }

    public void setTextoAlternativo(String textoAlternativo) {
        mTextoAlternativo = textoAlternativo;
    }

    public String getTextoAlternativo() {
        return mTextoAlternativo;
    }

    public void setNumDiaria(int numDiaria) {
        mNumDiaria = numDiaria;
    }

    public int getNumDiaria() {
        return mNumDiaria;
    }

    public void setRegra(String regra) {
        mRegra = regra;
    }

    public String getRegra() {
        return mRegra;
    }

    public void setPacotesRestante(int pacotesRestante) {
        mPacotesRestante = pacotesRestante;
    }

    public int getPacotesRestante() {
        return mPacotesRestante;
    }

    @Override
    public String toString(){
        return "numPessoa = " + mNumPessoa + ", textoAlternativo = " + mTextoAlternativo + ", numDiaria = " + mNumDiaria + ", regra = " + mRegra + ", pacotesRestante = " + mPacotesRestante;
    }


}