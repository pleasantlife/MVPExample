package com.gandan.mvpexample;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRepository implements Repository {

    private String code = "";
    @Override
    public String load() {

        RetrofitUtil.getRetrofitService().getTodo(1).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                code = response.code()+"";
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                code = t.getMessage()+"";
            }
        });
        return code;
    }
}
