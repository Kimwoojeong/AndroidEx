package org.codeman77.fragmentex.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.codeman77.fragmentex.R;


public class SecondFragment extends Fragment implements View.OnClickListener {

    private TextView resultText;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View fragment = inflater.inflate(R.layout.fragment_second, container, false);

        resultText = (TextView) fragment.findViewById(R.id.resultText);

        Integer[] buttonIds = {R.id.btn0, R.id.btn1};
        Button[] buttons = new Button[2];
        for (int i = 0; i < 2; i++) {
            buttons[i] = (Button) fragment.findViewById(buttonIds[i]);
            buttons[i].setOnClickListener(this);
        }

        return fragment;
    }

    @Override
    public void onClick(View view) {
        String str = "";
        switch (view.getId()) {
            case R.id.btn0:
                str = "Button 1 Click";
                break;
            case R.id.btn1:
                str = "Button 2 Click";
                break;
        }
        resultText.setText(str);
    }

}
