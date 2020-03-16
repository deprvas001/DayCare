package com.development.daycare.networking;

import com.development.daycare.model.homeModel.HomeResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ShipmentApi {

    @GET("getAllHomePageDataAPI")
    Call<HomeResponse> getData(
            @Query("type") String  type);
}
