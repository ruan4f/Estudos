package com.ruanferreira.buscahoteis.POJO;

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class Content{

    private static final String FIELD_URL_SHARE = "url_share";
    private static final String FIELD_TEM_OPCOES = "tem_opcoes";
    private static final String FIELD_URL_IMAGEM = "url_imagem";
    private static final String FIELD_SLUG_OFERTA = "slug_oferta";
    private static final String FIELD_PERCENTUAL_DESCONTO = "percentual_desconto";
    private static final String FIELD_DATA_INICIO = "data_inicio";
    private static final String FIELD_DETALHE_PACOTE = "detalhe_pacote";
    private static final String FIELD_FACILIDADES = "facilidades";
    private static final String FIELD_OPCOES = "opcoes";
    private static final String FIELD_TITULO_OFERTA = "titulo_oferta";
    private static final String FIELD_TAGS = "tags";
    private static final String FIELD_DATA_FIM = "data_fim";
    private static final String FIELD_REGULAMENTO_PARCIAL = "regulamento_parcial";
    private static final String FIELD_TEM_AEREO = "tem_aereo";
    private static final String FIELD_ID_OFERTA = "id_oferta";
    private static final String FIELD_EMAIL_RESERVA = "email_reserva";
    private static final String FIELD_ESTABELECIMENTO = "estabelecimento";
    private static final String FIELD_ID_OFERTA_TIPO = "id_oferta_tipo";
    private static final String FIELD_VALOR_PROMOCIONAL = "valor_promocional";
    private static final String FIELD_TEXTO_PARCELAMENTO = "texto_parcelamento";
    private static final String FIELD_VALOR_ORIGINAL = "valor_original";
    private static final String FIELD_ID_PRODUTO = "id_produto";
    private static final String FIELD_ENDERECO = "endereco";


    @SerializedName(FIELD_URL_SHARE)
    private String mUrlShare;
    @SerializedName(FIELD_TEM_OPCOES)
    private boolean mTemOpco;
    @SerializedName(FIELD_URL_IMAGEM)
    private List<String> mUrlImagems;
    @SerializedName(FIELD_SLUG_OFERTA)
    private String mSlugOfertum;
    @SerializedName(FIELD_PERCENTUAL_DESCONTO)
    private int mPercentualDesconto;
    @SerializedName(FIELD_DATA_INICIO)
    private String mDataInicio;
    @SerializedName(FIELD_DETALHE_PACOTE)
    private DetalhePacote mDetalhePacote;
    @SerializedName(FIELD_FACILIDADES)
    private List<Facilidade> mFacilidades;
    @SerializedName(FIELD_OPCOES)
    private List<Opco> mOpcos;
    @SerializedName(FIELD_TITULO_OFERTA)
    private String mTituloOfertum;
    @SerializedName(FIELD_TAGS)
    private List<String> mTags;
    @SerializedName(FIELD_DATA_FIM)
    private String mDataFim;
    @SerializedName(FIELD_REGULAMENTO_PARCIAL)
    private RegulamentoParcial mRegulamentoParcial;
    @SerializedName(FIELD_TEM_AEREO)
    private boolean mTemAereo;
    @SerializedName(FIELD_ID_OFERTA)
    private int mIdOfertum;
    @SerializedName(FIELD_EMAIL_RESERVA)
    private String mEmailReserva;
    @SerializedName(FIELD_ESTABELECIMENTO)
    private Estabelecimento mEstabelecimento;
    @SerializedName(FIELD_ID_OFERTA_TIPO)
    private int mIdOfertaTipo;
    @SerializedName(FIELD_VALOR_PROMOCIONAL)
    private int mValorPromocional;
    @SerializedName(FIELD_TEXTO_PARCELAMENTO)
    private String mTextoParcelamento;
    @SerializedName(FIELD_VALOR_ORIGINAL)
    private int mValorOriginal;
    @SerializedName(FIELD_ID_PRODUTO)
    private int mIdProduto;
    @SerializedName(FIELD_ENDERECO)
    private Endereco mEndereco;


    public Content(){

    }

    public void setUrlShare(String urlShare) {
        mUrlShare = urlShare;
    }

    public String getUrlShare() {
        return mUrlShare;
    }

    public void setTemOpco(boolean temOpco) {
        mTemOpco = temOpco;
    }

    public boolean isTemOpco() {
        return mTemOpco;
    }

    public void setUrlImagems(List<String> urlImagems) {
        mUrlImagems = urlImagems;
    }

    public List<String> getUrlImagems() {
        return mUrlImagems;
    }

    public void setSlugOfertum(String slugOfertum) {
        mSlugOfertum = slugOfertum;
    }

    public String getSlugOfertum() {
        return mSlugOfertum;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        mPercentualDesconto = percentualDesconto;
    }

    public int getPercentualDesconto() {
        return mPercentualDesconto;
    }

    public void setDataInicio(String dataInicio) {
        mDataInicio = dataInicio;
    }

    public String getDataInicio() {
        return mDataInicio;
    }

    public void setDetalhePacote(DetalhePacote detalhePacote) {
        mDetalhePacote = detalhePacote;
    }

    public DetalhePacote getDetalhePacote() {
        return mDetalhePacote;
    }

    public void setFacilidades(List<Facilidade> facilidades) {
        mFacilidades = facilidades;
    }

    public List<Facilidade> getFacilidades() {
        return mFacilidades;
    }

    public void setOpcos(List<Opco> opcos) {
        mOpcos = opcos;
    }

    public List<Opco> getOpcos() {
        return mOpcos;
    }

    public void setTituloOfertum(String tituloOfertum) {
        mTituloOfertum = tituloOfertum;
    }

    public String getTituloOfertum() {
        return mTituloOfertum;
    }

    public void setTags(List<String> tags) {
        mTags = tags;
    }

    public List<String> getTags() {
        return mTags;
    }

    public void setDataFim(String dataFim) {
        mDataFim = dataFim;
    }

    public String getDataFim() {
        return mDataFim;
    }

    public void setRegulamentoParcial(RegulamentoParcial regulamentoParcial) {
        mRegulamentoParcial = regulamentoParcial;
    }

    public RegulamentoParcial getRegulamentoParcial() {
        return mRegulamentoParcial;
    }

    public void setTemAereo(boolean temAereo) {
        mTemAereo = temAereo;
    }

    public boolean isTemAereo() {
        return mTemAereo;
    }

    public void setIdOfertum(int idOfertum) {
        mIdOfertum = idOfertum;
    }

    public int getIdOfertum() {
        return mIdOfertum;
    }

    public void setEmailReserva(String emailReserva) {
        mEmailReserva = emailReserva;
    }

    public String getEmailReserva() {
        return mEmailReserva;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        mEstabelecimento = estabelecimento;
    }

    public Estabelecimento getEstabelecimento() {
        return mEstabelecimento;
    }

    public void setIdOfertaTipo(int idOfertaTipo) {
        mIdOfertaTipo = idOfertaTipo;
    }

    public int getIdOfertaTipo() {
        return mIdOfertaTipo;
    }

    public void setValorPromocional(int valorPromocional) {
        mValorPromocional = valorPromocional;
    }

    public int getValorPromocional() {
        return mValorPromocional;
    }

    public void setTextoParcelamento(String textoParcelamento) {
        mTextoParcelamento = textoParcelamento;
    }

    public String getTextoParcelamento() {
        return mTextoParcelamento;
    }

    public void setValorOriginal(int valorOriginal) {
        mValorOriginal = valorOriginal;
    }

    public int getValorOriginal() {
        return mValorOriginal;
    }

    public void setIdProduto(int idProduto) {
        mIdProduto = idProduto;
    }

    public int getIdProduto() {
        return mIdProduto;
    }

    public void setEndereco(Endereco endereco) {
        mEndereco = endereco;
    }

    public Endereco getEndereco() {
        return mEndereco;
    }

    @Override
    public String toString(){
        return "urlShare = " + mUrlShare + ", temOpco = " + mTemOpco + ", urlImagems = " + mUrlImagems + ", slugOfertum = " + mSlugOfertum + ", percentualDesconto = " + mPercentualDesconto + ", dataInicio = " + mDataInicio + ", detalhePacote = " + mDetalhePacote + ", facilidades = " + mFacilidades + ", opcos = " + mOpcos + ", tituloOfertum = " + mTituloOfertum + ", tags = " + mTags + ", dataFim = " + mDataFim + ", regulamentoParcial = " + mRegulamentoParcial + ", temAereo = " + mTemAereo + ", idOfertum = " + mIdOfertum + ", emailReserva = " + mEmailReserva + ", estabelecimento = " + mEstabelecimento + ", idOfertaTipo = " + mIdOfertaTipo + ", valorPromocional = " + mValorPromocional + ", textoParcelamento = " + mTextoParcelamento + ", valorOriginal = " + mValorOriginal + ", idProduto = " + mIdProduto + ", endereco = " + mEndereco;
    }


}