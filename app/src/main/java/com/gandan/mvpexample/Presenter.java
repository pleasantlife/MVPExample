package com.gandan.mvpexample;

public class Presenter implements MainContract.MainPresenter {

    private MainContract.View view;
    private MainRepository mainRepository;

    public Presenter(MainContract.View view, MainRepository mainRepository){
        this.view = view;
        this.mainRepository = mainRepository;
    }

    @Override
    public void buttonClick() {
        view.showText(mainRepository.load());
    }

    @Override
    public void onDestroy() {

    }
}
