package com.development.daycare.networking;

import com.development.daycare.model.homeModel.HomeResponse;
import com.development.daycare.model.signupModel.SignUpResponse;
import com.development.daycare.model.signupModel.UserSignupRequest;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ShipmentApi {

    @GET("getAllHomePageDataAPI")
    Call<HomeResponse> getData(
            @Query("type") String  type);


    @POST("userSingup")
    Call<SignUpResponse> userSignUp(
            @HeaderMap Map<String,String> headers,
            @Body UserSignupRequest request);
}
