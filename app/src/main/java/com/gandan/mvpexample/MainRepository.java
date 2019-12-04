package com.gandan.mvpexample;

import android.util.Log;

import java.util.Arrays;
import java.util.List;

public class MainRepository implements Repository {


    @Override
    public String load() {
        List<String> list = Arrays.asList("티몬", "쿠팡", "마켓컬리", "아마존", "옥션", "지마켓", "이마트");
        int random = ((int) (Math.random() * 10) + 1);
        if(random > 6){
            random = 6;
        }
        Log.e("random", random+"");
        return list.get(random);
    }
}
