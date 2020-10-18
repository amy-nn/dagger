package com.example.commend.interceptor;

import android.content.Context;
import android.util.Log;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.example.commend.path.Constract;

@Interceptor(priority = 8,name = "拦截器")
public class PathInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if(postcard.getPath().equals(Constract.appActivity)){
            callback.onInterrupt(null);
            Log.d("amy", "process: 拦截了");
        }
        else{
            callback.onContinue(postcard);
            Log.d("amy", "onContinue: 正常执行");
        }
    }

    @Override
    public void init(Context context) {
        Log.d("amy", "init: 初始化了拦截器");
    }
}
