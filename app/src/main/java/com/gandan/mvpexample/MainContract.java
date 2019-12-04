package com.gandan.mvpexample;

public interface MainContract {

    interface View {

        void showText(String str);

    }

    interface MainPresenter {

        void buttonClick();

        void onDestroy();
    }
}
