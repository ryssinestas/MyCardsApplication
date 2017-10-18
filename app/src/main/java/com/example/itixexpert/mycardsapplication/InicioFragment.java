package com.example.itixexpert.mycardsapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by itix.expert on 17/10/2017.
 */

public class InicioFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState) {
        return inflater.inflate(R.layout.inicio, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Activity activity = getActivity();

        mRecyclerView = (RecyclerView) activity.findViewById(R.id.cards);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(activity);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new InicioAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
