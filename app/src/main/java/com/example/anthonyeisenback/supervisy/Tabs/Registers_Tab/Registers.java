package com.example.anthonyeisenback.supervisy.Tabs.Registers_Tab;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anthonyeisenback.supervisy.R;

public class Registers extends Fragment {

    public static Registers newInstance() {

        Bundle args = new Bundle();

        Registers fragment = new Registers();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.registers_layout, container, false);
        return view;
    }
}
