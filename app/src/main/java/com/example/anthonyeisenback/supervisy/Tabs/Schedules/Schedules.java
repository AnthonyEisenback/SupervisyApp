package com.example.anthonyeisenback.supervisy.Tabs.Schedules;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anthonyeisenback.supervisy.R;

public class Schedules extends Fragment {

    public static Schedules newInstance() {

        Bundle args = new Bundle();

        Schedules fragment = new Schedules();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.schedules_list_layout, container, false);
        return view;
    }
}
