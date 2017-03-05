package com.hbjcsoft.myapplication;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kohry on 2017-03-05.
 */

public interface GithubService {

    @GET("/hello")
    Call<ResponseBody> getUserLogin(
            @Query("access_token") String access_token,
            @Query("fid") String fid
    );

}
