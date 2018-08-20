package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;


public class RegulamentoParcial{

    private static final String FIELD_HORARIO_ENTRADA = "horario_entrada";
    private static final String FIELD_DESCRICAO_CRIANCAS = "descricao_criancas";
    private static final String FIELD_REAGENDAMENTO_CANCELAMENTO = "reagendamento_cancelamento";
    private static final String FIELD_CRIANCAS = "criancas";
    private static final String FIELD_OUTRAS_INFORMACOES = "outras_informacoes";
    private static final String FIELD_AEREO = "aereo";
    private static final String FIELD_INTERNET = "internet";
    private static final String FIELD_ACESSIBILIDADE_DESCRICAO = "acessibilidade_descricao";
    private static final String FIELD_TIPO_ACOMODACAO = "tipo_acomodacao";
    private static final String FIELD_ESTACIONAMENTO_DESCRICAO = "estacionamento_descricao";
    private static final String FIELD_VALIDADES = "validades";
    private static final String FIELD_TELEFONE_RESERVA_DDD = "telefone_reserva_ddd";
    private static final String FIELD_ACESSIBILIDADE = "acessibilidade";
    private static final String FIELD_AGENDAMENTO = "agendamento";
    private static final String FIELD_TELEFONE_RESERVA = "telefone_reserva";
    private static final String FIELD_ESTACIONAMENTO = "estacionamento";
    private static final String FIELD_HORARIO_SAIDA = "horario_saida";
    private static final String FIELD_INTERNET_DESCRICAO = "internet_descricao";
    private static final String FIELD_AEREO_DOCUMENTACAO = "aereo_documentacao";


    @SerializedName(FIELD_HORARIO_ENTRADA)
    private String mHorarioEntrada;
    @SerializedName(FIELD_DESCRICAO_CRIANCAS)
    private String mDescricaoCrianca;
    @SerializedName(FIELD_REAGENDAMENTO_CANCELAMENTO)
    private String mReagendamentoCancelamento;
    @SerializedName(FIELD_CRIANCAS)
    private int mCrianca;
    @SerializedName(FIELD_OUTRAS_INFORMACOES)
    private String mOutrasInformaco;
    @SerializedName(FIELD_AEREO)
    private String mAereo;
    @SerializedName(FIELD_INTERNET)
    private boolean mInternet;
    @SerializedName(FIELD_ACESSIBILIDADE_DESCRICAO)
    private String mAcessibilidadeDescricao;
    @SerializedName(FIELD_TIPO_ACOMODACAO)
    private String mTipoAcomodacao;
    @SerializedName(FIELD_ESTACIONAMENTO_DESCRICAO)
    private String mEstacionamentoDescricao;
    @SerializedName(FIELD_VALIDADES)
    private String mValidade;
    @SerializedName(FIELD_TELEFONE_RESERVA_DDD)
    private int mTelefoneReservaDdd;
    @SerializedName(FIELD_ACESSIBILIDADE)
    private boolean mAcessibilidade;
    @SerializedName(FIELD_AGENDAMENTO)
    private String mAgendamento;
    @SerializedName(FIELD_TELEFONE_RESERVA)
    private int mTelefoneReserva;
    @SerializedName(FIELD_ESTACIONAMENTO)
    private boolean mEstacionamento;
    @SerializedName(FIELD_HORARIO_SAIDA)
    private String mHorarioSaida;
    @SerializedName(FIELD_INTERNET_DESCRICAO)
    private String mInternetDescricao;
    @SerializedName(FIELD_AEREO_DOCUMENTACAO)
    private String mAereoDocumentacao;


    public RegulamentoParcial(){

    }

    public void setHorarioEntrada(String horarioEntrada) {
        mHorarioEntrada = horarioEntrada;
    }

    public String getHorarioEntrada() {
        return mHorarioEntrada;
    }

    public void setDescricaoCrianca(String descricaoCrianca) {
        mDescricaoCrianca = descricaoCrianca;
    }

    public String getDescricaoCrianca() {
        return mDescricaoCrianca;
    }

    public void setReagendamentoCancelamento(String reagendamentoCancelamento) {
        mReagendamentoCancelamento = reagendamentoCancelamento;
    }

    public String getReagendamentoCancelamento() {
        return mReagendamentoCancelamento;
    }

    public void setCrianca(int crianca) {
        mCrianca = crianca;
    }

    public int getCrianca() {
        return mCrianca;
    }

    public void setOutrasInformaco(String outrasInformaco) {
        mOutrasInformaco = outrasInformaco;
    }

    public String getOutrasInformaco() {
        return mOutrasInformaco;
    }

    public void setAereo(String aereo) {
        mAereo = aereo;
    }

    public String getAereo() {
        return mAereo;
    }

    public void setInternet(boolean internet) {
        mInternet = internet;
    }

    public boolean isInternet() {
        return mInternet;
    }

    public void setAcessibilidadeDescricao(String acessibilidadeDescricao) {
        mAcessibilidadeDescricao = acessibilidadeDescricao;
    }

    public String getAcessibilidadeDescricao() {
        return mAcessibilidadeDescricao;
    }

    public void setTipoAcomodacao(String tipoAcomodacao) {
        mTipoAcomodacao = tipoAcomodacao;
    }

    public String getTipoAcomodacao() {
        return mTipoAcomodacao;
    }

    public void setEstacionamentoDescricao(String estacionamentoDescricao) {
        mEstacionamentoDescricao = estacionamentoDescricao;
    }

    public String getEstacionamentoDescricao() {
        return mEstacionamentoDescricao;
    }

    public void setValidade(String validade) {
        mValidade = validade;
    }

    public String getValidade() {
        return mValidade;
    }

    public void setTelefoneReservaDdd(int telefoneReservaDdd) {
        mTelefoneReservaDdd = telefoneReservaDdd;
    }

    public int getTelefoneReservaDdd() {
        return mTelefoneReservaDdd;
    }

    public void setAcessibilidade(boolean acessibilidade) {
        mAcessibilidade = acessibilidade;
    }

    public boolean isAcessibilidade() {
        return mAcessibilidade;
    }

    public void setAgendamento(String agendamento) {
        mAgendamento = agendamento;
    }

    public String getAgendamento() {
        return mAgendamento;
    }

    public void setTelefoneReserva(int telefoneReserva) {
        mTelefoneReserva = telefoneReserva;
    }

    public int getTelefoneReserva() {
        return mTelefoneReserva;
    }

    public void setEstacionamento(boolean estacionamento) {
        mEstacionamento = estacionamento;
    }

    public boolean isEstacionamento() {
        return mEstacionamento;
    }

    public void setHorarioSaida(String horarioSaida) {
        mHorarioSaida = horarioSaida;
    }

    public String getHorarioSaida() {
        return mHorarioSaida;
    }

    public void setInternetDescricao(String internetDescricao) {
        mInternetDescricao = internetDescricao;
    }

    public String getInternetDescricao() {
        return mInternetDescricao;
    }

    public void setAereoDocumentacao(String aereoDocumentacao) {
        mAereoDocumentacao = aereoDocumentacao;
    }

    public String getAereoDocumentacao() {
        return mAereoDocumentacao;
    }

    @Override
    public String toString(){
        return "horarioEntrada = " + mHorarioEntrada + ", descricaoCrianca = " + mDescricaoCrianca + ", reagendamentoCancelamento = " + mReagendamentoCancelamento + ", crianca = " + mCrianca + ", outrasInformaco = " + mOutrasInformaco + ", aereo = " + mAereo + ", internet = " + mInternet + ", acessibilidadeDescricao = " + mAcessibilidadeDescricao + ", tipoAcomodacao = " + mTipoAcomodacao + ", estacionamentoDescricao = " + mEstacionamentoDescricao + ", validade = " + mValidade + ", telefoneReservaDdd = " + mTelefoneReservaDdd + ", acessibilidade = " + mAcessibilidade + ", agendamento = " + mAgendamento + ", telefoneReserva = " + mTelefoneReserva + ", estacionamento = " + mEstacionamento + ", horarioSaida = " + mHorarioSaida + ", internetDescricao = " + mInternetDescricao + ", aereoDocumentacao = " + mAereoDocumentacao;
    }


}