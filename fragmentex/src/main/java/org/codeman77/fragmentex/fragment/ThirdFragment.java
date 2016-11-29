package org.codeman77.fragmentex.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.codeman77.fragmentex.R;


public class ThirdFragment extends Fragment implements RadioGroup.OnCheckedChangeListener {

    private TextView resultText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View fragment = inflater.inflate(R.layout.fragment_third, container, false);
        resultText = (TextView) fragment.findViewById(R.id.resultText);

        RadioGroup radioGroup = (RadioGroup) fragment.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);

        return fragment;
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        String str = "";
        switch (i) {
            case R.id.btn0:
                str = "RadioButton 1 Click";
                break;
            case R.id.btn1:
                str = "RadioButton 2 Click";
                break;
            case R.id.btn2:
                str = "RadioButton 3 Click";
                break;
            case R.id.btn3:
                str = "RadioButton 4 Click";
                break;
        }
        resultText.setText(str);
    }

}
