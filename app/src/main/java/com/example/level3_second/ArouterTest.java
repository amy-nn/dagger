package com.example.level3_second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.commend.path.Constract;

@Route(path = Constract.appActivity)
public class ArouterTest extends AppCompatActivity {

    @Autowired
    public String kv = "default";

    @Autowired(name = "user")
    public User userinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arouter_test);

        //接收值必须加此句
        ARouter.getInstance().inject(this);
        Log.d("amy", "kv: "+kv);

        if(userinfo != null)
            Log.d("amy", "user: "+userinfo.toString());
    }
}
