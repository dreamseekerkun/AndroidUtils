package com.likun.androidutils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.likun.androidutils.bean.PhoneResult;
import com.likun.androidutils.network.ServiceFactory;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_description);
        retrofitTest();
    }

    private void retrofitTest() {
//        Call<List<DemoBean>> call = ServiceFactory.getMainIns().getBean();
        Call<PhoneResult> call = ServiceFactory.getMainIns().getResult("8e13586b86e4b7f3758ba3bd6c9c9135", "15210011578");
        call.enqueue(new Callback<PhoneResult>() {
            @Override
            public void onResponse(Call<PhoneResult> call, Response<PhoneResult> response) {
                if (response.isSuccessful()) {
                    PhoneResult result = response.body();
                    if (result != null) {
//                        for (DemoBean demoBean : result) {
                            textView.setText(result.getRetData().getPhone());
//                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<PhoneResult> call, Throwable t) {
                System.out.println("onFailure " + t.toString());

            }
        });
//        ServiceFactory.getMainIns().getMainAndroid(1, 20).enqueue(new Callback<Gank>() {
//            @Override
//            public void onResponse(Call<Gank> call, Response<Gank> response) {
//                Log.d("cs", "请求成功" + response.body().toString());
//                textView.setText(response.body().getResults().get(0).getDesc());
//            }
//
//            @Override
//            public void onFailure(Call<Gank> call, Throwable t) {
//                Log.d("cs", "登录失败,通知UI");
//            }
//        });
    }
}
