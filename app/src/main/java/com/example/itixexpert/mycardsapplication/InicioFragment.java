package com.example.itixexpert.mycardsapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * Created by itix.expert on 17/10/2017.
 */

public class InicioFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private InicioAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRecyclerView = getActivity().findViewById(R.id.cards);
        FrameLayout fragmentContainer = (FrameLayout) getActivity().findViewById(R.id.fragment_container);
        mRecyclerView.setLayoutParams(new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                                    FrameLayout.LayoutParams.MATCH_PARENT));
        fragmentContainer.addView(mRecyclerView);

        mRecyclerView.setHasFixedSize(false);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        int[] myDataset = new int[] {3, 0, 1, 0, 0, 0, 1, 1, 2};

        mAdapter = new InicioAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }
}
