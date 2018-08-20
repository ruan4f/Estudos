package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;


public class Endereco{

    private static final String FIELD_ENDERECO_COMPLEMENTO = "endereco_complemento";
    private static final String FIELD_NOME_ESTADO = "nome_estado";
    private static final String FIELD_NOME_CIDADE = "nome_cidade";
    private static final String FIELD_LONGITUDE = "longitude";
    private static final String FIELD_ENDERECO_CEP = "endereco_cep";
    private static final String FIELD_LOGRADOURO = "logradouro";
    private static final String FIELD_SIGLA_ESTADO = "sigla_estado";
    private static final String FIELD_NOME_PAIS = "nome_pais";
    private static final String FIELD_SIGLA_PAIS = "sigla_pais";
    private static final String FIELD_ENDERECO_NUMERO = "endereco_numero";
    private static final String FIELD_LATITUDE = "latitude";
    private static final String FIELD_ENDERECO_BAIRRO = "endereco_bairro";
    private static final String FIELD_ISO_PAIS = "iso_pais";


    @SerializedName(FIELD_ENDERECO_COMPLEMENTO)
    private String mEnderecoComplemento;
    @SerializedName(FIELD_NOME_ESTADO)
    private String mNomeEstado;
    @SerializedName(FIELD_NOME_CIDADE)
    private String mNomeCidade;
    @SerializedName(FIELD_LONGITUDE)
    private double mLongitude;
    @SerializedName(FIELD_ENDERECO_CEP)
    private String mEnderecoCep;
    @SerializedName(FIELD_LOGRADOURO)
    private String mLogradouro;
    @SerializedName(FIELD_SIGLA_ESTADO)
    private String mSiglaEstado;
    @SerializedName(FIELD_NOME_PAIS)
    private String mNomePai;
    @SerializedName(FIELD_SIGLA_PAIS)
    private String mSiglaPai;
    @SerializedName(FIELD_ENDERECO_NUMERO)
    private String mEnderecoNumero;
    @SerializedName(FIELD_LATITUDE)
    private double mLatitude;
    @SerializedName(FIELD_ENDERECO_BAIRRO)
    private String mEnderecoBairro;
    @SerializedName(FIELD_ISO_PAIS)
    private String mIsoPai;


    public Endereco(){

    }

    public void setEnderecoComplemento(String enderecoComplemento) {
        mEnderecoComplemento = enderecoComplemento;
    }

    public String getEnderecoComplemento() {
        return mEnderecoComplemento;
    }

    public void setNomeEstado(String nomeEstado) {
        mNomeEstado = nomeEstado;
    }

    public String getNomeEstado() {
        return mNomeEstado;
    }

    public void setNomeCidade(String nomeCidade) {
        mNomeCidade = nomeCidade;
    }

    public String getNomeCidade() {
        return mNomeCidade;
    }

    public void setLongitude(double longitude) {
        mLongitude = longitude;
    }

    public double getLongitude() {
        return mLongitude;
    }

    public void setEnderecoCep(String enderecoCep) {
        mEnderecoCep = enderecoCep;
    }

    public String getEnderecoCep() {
        return mEnderecoCep;
    }

    public void setLogradouro(String logradouro) {
        mLogradouro = logradouro;
    }

    public String getLogradouro() {
        return mLogradouro;
    }

    public void setSiglaEstado(String siglaEstado) {
        mSiglaEstado = siglaEstado;
    }

    public String getSiglaEstado() {
        return mSiglaEstado;
    }

    public void setNomePai(String nomePai) {
        mNomePai = nomePai;
    }

    public String getNomePai() {
        return mNomePai;
    }

    public void setSiglaPai(String siglaPai) {
        mSiglaPai = siglaPai;
    }

    public String getSiglaPai() {
        return mSiglaPai;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        mEnderecoNumero = enderecoNumero;
    }

    public String getEnderecoNumero() {
        return mEnderecoNumero;
    }

    public void setLatitude(double latitude) {
        mLatitude = latitude;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        mEnderecoBairro = enderecoBairro;
    }

    public String getEnderecoBairro() {
        return mEnderecoBairro;
    }

    public void setIsoPai(String isoPai) {
        mIsoPai = isoPai;
    }

    public String getIsoPai() {
        return mIsoPai;
    }

    @Override
    public String toString(){
        return "enderecoComplemento = " + mEnderecoComplemento + ", nomeEstado = " + mNomeEstado + ", nomeCidade = " + mNomeCidade + ", longitude = " + mLongitude + ", enderecoCep = " + mEnderecoCep + ", logradouro = " + mLogradouro + ", siglaEstado = " + mSiglaEstado + ", nomePai = " + mNomePai + ", siglaPai = " + mSiglaPai + ", enderecoNumero = " + mEnderecoNumero + ", latitude = " + mLatitude + ", enderecoBairro = " + mEnderecoBairro + ", isoPai = " + mIsoPai;
    }


}