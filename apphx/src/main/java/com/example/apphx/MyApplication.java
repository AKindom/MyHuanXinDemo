package com.example.apphx;

import android.app.Application;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;

/**
 * Created by Administrator on 2016/10/11.
 */
public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        initEMClient();
    }
    private void initEMClient() {
        EMOptions options = new EMOptions();
        options.setAcceptInvitationAlways(false);//默认添加好友改为需要验证
        EMClient.getInstance().init(this,options);
        EMClient.getInstance().setDebugMode(true);//在做打包混淆时，关闭debug模式，避免消耗不必要的资源
    }
}
