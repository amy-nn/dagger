package com.example.user;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.alibaba.android.arouter.facade.annotation.Route;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@Route(path = "/user/activity")
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.usr_btn)
    Button button;

    @BindString(R.string.userModule)
    public String loginErrorMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        Log.d("amy", "showText: "+loginErrorMessage);

    }

    @OnClick(R.id.usr_btn)
    public void showText(View view){
        button.setText("User模块的按钮");
        Log.d("amy", "showText: "+loginErrorMessage);
    }
}
