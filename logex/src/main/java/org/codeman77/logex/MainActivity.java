package org.codeman77.logex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Log.d"); // Debug
        Log.e(TAG, "Log.e"); // Error
        Log.i(TAG, "Log.i"); // Info
        Log.v(TAG, "Log.v"); // Verbose
        Log.w(TAG, "Log.w"); // Warn

        // 위 5가지를 제외하고 wtf라는 것도 있다.
        // wtf는 What a Terrible Failure의 약어이고, 끔찍한 실수 번역된다.
        // Api 문서를 보면 never happen ( 절대 일어나지 말아야할 상황 ) 을 기록하라고 나와있다.
        // Error Log와 동일한 기능을 한다.
        Log.wtf(TAG, "Log.wtf");

        // 예외상황 처리하기
        try {
            int a = 3/0; // ArithmeticException 발생
        } catch (ArithmeticException e) {
            // 아래 두 문장은 똑같은 동작을 수행한다.
            // Log.d(TAG, "Log.d", e);
            Log.d(TAG, Log.getStackTraceString(e));
        }
    }
}
