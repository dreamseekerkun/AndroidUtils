package com.likun.androidutils.network;

import com.likun.androidutils.bean.DemoBean;
import com.likun.androidutils.bean.Gank;
import com.likun.androidutils.bean.PhoneResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by likun on 16/4/19.
 */
public interface TestService {

    @Headers("Cache-Control: public, max-age=60")//
    @GET("/test1")
    Call<List<DemoBean>> getBean();

    @Headers("Cache-Control: public, max-age=600")//最大缓存时间为10分钟
    @GET("/apistore/mobilenumber/mobilenumber")
    Call<PhoneResult> getResult(@Header("apikey") String apikey, @Query("phone") String phone);

    /**
     * 使用缓存机制
     */
    @Headers("Cache-Control: public, max-age=3600")
    @GET("data/Android/{size}/{page}")
    Call<Gank> getMainAndroid(
            @Path("size") int size,
            @Path("page") int page
    );
}
