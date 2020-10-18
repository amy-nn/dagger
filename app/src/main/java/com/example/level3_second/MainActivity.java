package com.example.level3_second;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavigationCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.commend.path.Constract;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btn_arouter1:
                //组件内跳转
                ARouter.getInstance().build(Constract.appActivity).navigation();
                break;
            case R.id.btn_arouter2:
                //组件之间跳转
                ARouter.getInstance().build(Constract.userActivity).navigation();
                break;
            case R.id.btn_arouter3:
                //带参数跳转-基本数据传值
                ARouter.getInstance().build(Constract.appActivity)
                        .withString("kv","value")
                        .navigation();
                break;
            case R.id.btn_arouter4:
                //传递对象
                ARouter.getInstance().build(Constract.appActivity)
                        .withObject("user",new User(1,"zs"))
                        .navigation();
                break;
            case R.id.btn_arouter5:
                //拦截器
//                ARouter.getInstance().build(Constract.appActivity).navigation(this,
//                        new NavigationCallback() {
//                            @Override
//                            public void onFound(Postcard postcard) {
//
//                            }
//
//                            @Override
//                            public void onLost(Postcard postcard) {
//
//                            }
//
//                            @Override
//                            public void onArrival(Postcard postcard) {
//
//                            }
//
//                            @Override
//                            public void onInterrupt(Postcard postcard) {
//                                Log.d("amy", "onInterrupt: 拦截了");
//                            }
//                        });

                ARouter.getInstance().build(Constract.appActivity).greenChannel().navigation();
                break;
            case R.id.btn_arouter6:
                FragmentOne fragmentOne = (FragmentOne) ARouter.getInstance().build(Constract.fragmentOne).navigation();
                FragmentManager manager = getSupportFragmentManager();
                manager.beginTransaction().add(R.id.flip,fragmentOne).commit();
                break;
        }
    }
}
