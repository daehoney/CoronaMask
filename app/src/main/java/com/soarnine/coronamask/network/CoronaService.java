package com.soarnine.coronamask.network;

import com.soarnine.coronamask.model.GeoStore;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CoronaService {

    @GET("storesByGeo/json")
    Call<GeoStore> getStoreByGeo();
}
