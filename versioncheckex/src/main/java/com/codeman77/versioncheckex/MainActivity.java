package com.codeman77.versioncheckex;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "SDK_VERSION_CHECK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 현재 단말의 SDK 버전
        Log.i(LOG_TAG, "현재 단말의 SDK : " + Build.VERSION.SDK_INT);
        Log.i(LOG_TAG, " ");

        // SDK 버전 정보
        Log.i(LOG_TAG, "Android 4.1 Jelly bean  : " + Build.VERSION_CODES.JELLY_BEAN);
        Log.i(LOG_TAG, "Android 4.4 Kitkat      : " + Build.VERSION_CODES.KITKAT);
        Log.i(LOG_TAG, "Android 5.0 Lollipop    : " + Build.VERSION_CODES.LOLLIPOP);
        Log.i(LOG_TAG, "Android 6.0 Marshmallow : " + Build.VERSION_CODES.M);
        Log.i(LOG_TAG, "Android 7.0 Nougat      : " + Build.VERSION_CODES.N);
        Log.i(LOG_TAG, "Android 7.1 Nougat++    : " + Build.VERSION_CODES.N_MR1);
        Log.i(LOG_TAG, " ");

        // 사용법
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            // Android Marshmallow 이상에서만 실행되는 코드
            Log.i(LOG_TAG, "현재 단말의 SDK 버전은 마시멜로이상 입니다.");
        }
        else{
            // Android Marshmallow 미만에서만 실행되는 코드
            Log.i(LOG_TAG, "현재 단말의 SDK 버전은 마시멜로미만입니다.");
        }
    }
}
