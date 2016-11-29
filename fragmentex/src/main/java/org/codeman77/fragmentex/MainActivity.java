package org.codeman77.fragmentex;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import org.codeman77.fragmentex.fragment.FirstFragment;
import org.codeman77.fragmentex.fragment.SecondFragment;
import org.codeman77.fragmentex.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer[] buttonIds = {R.id.btn0, R.id.btn1, R.id.btn2};
        Button[] buttons = new Button[3];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = (Button) findViewById(buttonIds[i]);
            buttons[i].setOnClickListener(this);
        }

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment, new FirstFragment()).commit();
    }


    @Override
    public void onClick(View view) {
        changeFragment(view.getId());
    }

    // Fragment Change Function
    public void changeFragment(int id) {
        Fragment fragment;
        switch (id) {
            default:
            case R.id.btn0:
                fragment = new FirstFragment();
                break;
            case R.id.btn1:
                fragment = new SecondFragment();
                break;
            case R.id.btn2:
                fragment = new ThirdFragment();
                break;
        }
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit();
    }

}
