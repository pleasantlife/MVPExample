package com.gandan.mvpexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.MainPresenter presenter;
    private MainRepository mainRepository;

    private TextView textView;
    private Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        login_button = findViewById(R.id.login_button);
        mainRepository = new MainRepository();
        presenter = new Presenter(this, mainRepository);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.buttonClick();
            }
        });
    }

    @Override
    public void showText(String str) {
        textView.setText(str);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }
}
