package org.codeman77.animationex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button scaleBtn, translateBtn, rotateBtn, alphaBtn, setBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        scaleBtn = (Button) findViewById(R.id.scaleBtn);
        translateBtn = (Button) findViewById(R.id.translateBtn);
        rotateBtn = (Button) findViewById(R.id.rotateBtn);
        alphaBtn = (Button) findViewById(R.id.alphaBtn);
        setBtn = (Button) findViewById(R.id.setBtn);

        scaleBtn.setOnClickListener(this);
        translateBtn.setOnClickListener(this);
        rotateBtn.setOnClickListener(this);
        alphaBtn.setOnClickListener(this);
        setBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Animation animation = null;
        switch (view.getId()) {
            case R.id.scaleBtn:
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.expand_animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.reduce_animation);
                        textView.startAnimation(animation);
                        animation.setAnimationListener(null);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                break;
            case R.id.translateBtn:
                // TextView 가 위 아래로 움직이는 이벤트
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.buttom_move_animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.top_move_animation);
                        textView.startAnimation(animation);
                        animation.setAnimationListener(null);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                break;
            case R.id.rotateBtn:
                // TextView 가 회전하는 이벤트
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_animation);
                break;
            case R.id.alphaBtn:
                // TextView 가 투명해지는 이벤트
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out_animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in_animation);
                        textView.startAnimation(animation);
                        animation.setAnimationListener(null);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                break;
            case R.id.setBtn:
                // 혼합된 이벤트
                animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_animation);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.set_animation2);
                        textView.startAnimation(animation);
                        animation.setAnimationListener(null);
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                break;
        }
        textView.startAnimation(animation); // 애니메이션을 시작
        textView.invalidate(); // 화면을 갱신
    }

}
