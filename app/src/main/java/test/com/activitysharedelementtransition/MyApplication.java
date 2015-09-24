package test.com.activitysharedelementtransition;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by jackf on 15/9/10.
 */

public class MyApplication extends Application {
    private static final String TAG = MyApplication.class.getSimpleName();

    public static MyApplication getApp(Context context) {
        return (MyApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "App onCreate");
        Fresco.initialize(getApplicationContext());
    }
}
