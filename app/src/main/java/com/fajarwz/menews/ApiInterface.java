package com.fajarwz.menews;

import com.fajarwz.menews.Model.Headlines;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by: fajarwz on 23/02/20.
 */

public interface ApiInterface {
    @GET("top-headlines")
    Call<Headlines> getHeadlines(
        @Query("country") String country,
        @Query("apiKey") String apiKey
    );
}
