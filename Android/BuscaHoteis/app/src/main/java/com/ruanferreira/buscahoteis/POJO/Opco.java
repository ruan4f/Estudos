package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;


public class Opco{

    private static final String FIELD_VALOR_PROMOCIONAL = "valor_promocional";
    private static final String FIELD_ID_OPCAO = "id_opcao";
    private static final String FIELD_TITULO = "titulo";
    private static final String FIELD_OPCAO_PESSOAS = "opcao_pessoas";
    private static final String FIELD_OPCAO_DIARIAS = "opcao_diarias";
    private static final String FIELD_TAXA_VENDA = "taxa_venda";
    private static final String FIELD_POLITICA_CANCELAMENTO = "politica_cancelamento";
    private static final String FIELD_PRINCIPAL = "principal";
    private static final String FIELD_SKU = "sku";
    private static final String FIELD_DESCRICAO = "descricao";


    @SerializedName(FIELD_VALOR_PROMOCIONAL)
    private double mValorPromocional;
    @SerializedName(FIELD_ID_OPCAO)
    private int mIdOpcao;
    @SerializedName(FIELD_TITULO)
    private String mTitulo;
    @SerializedName(FIELD_OPCAO_PESSOAS)
    private int mOpcaoPessoa;
    @SerializedName(FIELD_OPCAO_DIARIAS)
    private int mOpcaoDiaria;
    @SerializedName(FIELD_TAXA_VENDA)
    private double mTaxaVenda;
    @SerializedName(FIELD_POLITICA_CANCELAMENTO)
    private String mPoliticaCancelamento;
    @SerializedName(FIELD_PRINCIPAL)
    private int mPrincipal;
    @SerializedName(FIELD_SKU)
    private String mSku;
    @SerializedName(FIELD_DESCRICAO)
    private String mDescricao;


    public Opco(){

    }

    public void setValorPromocional(double valorPromocional) {
        mValorPromocional = valorPromocional;
    }

    public double getValorPromocional() {
        return mValorPromocional;
    }

    public void setIdOpcao(int idOpcao) {
        mIdOpcao = idOpcao;
    }

    public int getIdOpcao() {
        return mIdOpcao;
    }

    public void setTitulo(String titulo) {
        mTitulo = titulo;
    }

    public String getTitulo() {
        return mTitulo;
    }

    public void setOpcaoPessoa(int opcaoPessoa) {
        mOpcaoPessoa = opcaoPessoa;
    }

    public int getOpcaoPessoa() {
        return mOpcaoPessoa;
    }

    public void setOpcaoDiaria(int opcaoDiaria) {
        mOpcaoDiaria = opcaoDiaria;
    }

    public int getOpcaoDiaria() {
        return mOpcaoDiaria;
    }

    public void setTaxaVenda(double taxaVenda) {
        mTaxaVenda = taxaVenda;
    }

    public double getTaxaVenda() {
        return mTaxaVenda;
    }

    public void setPoliticaCancelamento(String politicaCancelamento) {
        mPoliticaCancelamento = politicaCancelamento;
    }

    public String getPoliticaCancelamento() {
        return mPoliticaCancelamento;
    }

    public void setPrincipal(int principal) {
        mPrincipal = principal;
    }

    public int getPrincipal() {
        return mPrincipal;
    }

    public void setSku(String sku) {
        mSku = sku;
    }

    public String getSku() {
        return mSku;
    }

    public void setDescricao(String descricao) {
        mDescricao = descricao;
    }

    public String getDescricao() {
        return mDescricao;
    }

    @Override
    public String toString(){
        return "valorPromocional = " + mValorPromocional + ", idOpcao = " + mIdOpcao + ", titulo = " + mTitulo + ", opcaoPessoa = " + mOpcaoPessoa + ", opcaoDiaria = " + mOpcaoDiaria + ", taxaVenda = " + mTaxaVenda + ", politicaCancelamento = " + mPoliticaCancelamento + ", principal = " + mPrincipal + ", sku = " + mSku + ", descricao = " + mDescricao;
    }


}