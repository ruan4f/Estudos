package com.ruanferreira.buscahoteis;

import com.ruanferreira.buscahoteis.POJO.Oferta;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ruanf on 20/03/2017.
 */

public interface APIInterface {

    @GET(".")
    Call<Oferta> doGetListHoteis();

}
