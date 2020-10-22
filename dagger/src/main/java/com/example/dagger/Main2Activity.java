package com.example.dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.user.R;

import javax.inject.Inject;

/**
 * 简单注入一个字符串
 *
 */
public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Inject
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.dagger_txt);
        String textStr = (String) textView.getText();
//        Log.d("amy", "onCreate: 注入前："+user.toString());

        //注入后
        DaggerTestComponent.builder().build().inject(this);
        Log.d("amy", "onCreate: 注入后："+user.toString());
    }
}
