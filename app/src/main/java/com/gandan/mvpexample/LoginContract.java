package com.gandan.mvpexample;

public interface LoginContract {

    interface View {

    }

    interface Presenter {

    }

    interface Model {

        void createUser(String firstName, String lastName);

        UserModel getUser();
    }
}
