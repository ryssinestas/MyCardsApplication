package com.example.itixexpert.mycardsapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by itix.expert on 17/10/2017.
 */


public class InicioAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    class ViewHolderCardGrande extends RecyclerView.ViewHolder {

        public ViewHolderCardGrande(View itemView) {

        }
    }

    class ViewHolderDoisCards extends RecyclerView.ViewHolder {

        public ViewHolderDoisCards(View itemView) {

        }
    }

    class ViewHolderCardPequeno extends RecyclerView.ViewHolder {

        public ViewHolderCardPequeno(View itemView) {

        }
    }

    class ViewHolderGaleria extends RecyclerView.ViewHolder {
        public ViewHolderGaleria(View itemView) {

        }
    }

    @Override
    public int getItemViewType(int position) {

        if(position == 0) {
            return 3;
        }


        return 0;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                return new ViewHolderCardGrande();
            case 1:
                return new ViewHolderDoisCards();
            case 2:
                return new ViewHolderCardPequeno();
            default:
                return new ViewHolderGaleria();
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
}
