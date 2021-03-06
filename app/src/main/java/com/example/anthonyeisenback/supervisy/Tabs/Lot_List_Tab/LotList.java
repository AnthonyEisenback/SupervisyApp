package com.example.anthonyeisenback.supervisy.Tabs.Lot_List_Tab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anthonyeisenback.supervisy.R;

import java.util.List;

public class LotList extends Fragment{

    private RecyclerView recyclerView;
    private LotListRecyclerViewAdapter recyclerViewAdapter;
    private List<Employee> lotPeople;

    public static LotList newInstance() {

        Bundle args = new Bundle();

        LotList fragment = new LotList();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.lot_list_layout, container, false);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();


    }
}
