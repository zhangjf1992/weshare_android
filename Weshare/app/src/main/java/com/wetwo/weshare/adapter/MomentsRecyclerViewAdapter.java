package com.wetwo.weshare.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.data.model.adpter.Moment;
import com.wetwo.weshare.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by FHZ on 2018/7/13.
 */

public class MomentsRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Moment> moments;
    private Context context;

    public MomentsRecyclerViewAdapter(List<Moment> moments, Context context) {
        this.moments = moments;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == 0) {
            viewHolder = new MomentsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_latest_msg, parent, false));
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case 0:
                MomentsHolder latestMsgHolder = (MomentsHolder) holder;
//                Glide.with(context).load(latestMsgs.get(position).getHeadImageUrl()).into(latestMsgHolder.imageViewHeadImage);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return moments.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    class MomentsHolder extends RecyclerView.ViewHolder {
        public MomentsHolder(View itemView) {
            super(itemView);
        }
    }
}
