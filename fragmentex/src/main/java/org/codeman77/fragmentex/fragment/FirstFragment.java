package org.codeman77.fragmentex.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.codeman77.fragmentex.R;


public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        View fragment = inflater.inflate(R.layout.fragment_first, container, false);

        // onCreateView 이 곳에 View 를 정의해주어야함

        return fragment;
    }

}
