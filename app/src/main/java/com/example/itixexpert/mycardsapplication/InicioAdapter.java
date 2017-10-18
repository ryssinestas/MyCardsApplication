package com.example.itixexpert.mycardsapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by itix.expert on 17/10/2017.
 */


public class InicioAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private int[] mDataset;

    class ViewHolderCardGrande extends RecyclerView.ViewHolder {

        public TextView mTextView;

        public ViewHolderCardGrande(TextView view) {
            super(view);
            mTextView = view;
        }
    }

    class ViewHolderDoisCards extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public ViewHolderDoisCards(TextView view) {
            super(view);
            mTextView = view;
        }
    }

    class ViewHolderCardPequeno extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public ViewHolderCardPequeno(TextView view) {
            super(view);
            mTextView = view;
        }
    }

    class ViewHolderGaleria extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public ViewHolderGaleria(TextView view) {
            super(view);
            mTextView = view;
        }
    }

    public InicioAdapter(int[] dataset) {
        mDataset = dataset;
    }

    @Override
    public int getItemViewType(int position) {

        if(position == 0) {
            return 3;
        }

        return mDataset[position];
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView tv = new TextView(parent.getContext());

        switch (viewType) {
            case 0:

                tv.setText("Card Grande");

                return new ViewHolderCardGrande(tv);
            case 1:

                tv.setText("Dois Cads");

                return new ViewHolderDoisCards(tv);
            case 2:

                tv.setText("Card Pequeno");

                return new ViewHolderCardPequeno(tv);
            default:

                tv.setText("Galeria");

                return new ViewHolderGaleria(tv);
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        switch (holder.getItemViewType()) {
            case 0:
                ViewHolderCardGrande viewHolderCardGrande = (ViewHolderCardGrande) holder;
                break;

            case 1:
                ViewHolderDoisCards viewHolderDoisCards = (ViewHolderDoisCards) holder;
                break;

            case 2:
                ViewHolderCardPequeno viewHolderCardPequeno = (ViewHolderCardPequeno) holder;
                break;

            case 3:
                ViewHolderGaleria viewHolderGaleria = (ViewHolderGaleria) holder;
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
