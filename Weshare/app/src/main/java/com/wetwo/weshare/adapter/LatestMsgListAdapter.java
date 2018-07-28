package com.wetwo.weshare.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.weshare.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by FHZ on 2018/7/13.
 */

public class LatestMsgListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<LatestMsg> latestMsgs;
    private Context context;

    public LatestMsgListAdapter(List<LatestMsg> latestMsgs, Context context) {
        this.latestMsgs = latestMsgs;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        if (viewType == 0) {
            viewHolder = new LatestMsgHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_latest_msg, parent, false));
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case 0:
                LatestMsgHolder latestMsgHolder = (LatestMsgHolder) holder;
//                Glide.with(context).load(latestMsgs.get(position).getHeadImageUrl()).into(latestMsgHolder.imageViewHeadImage);
                latestMsgHolder.textViewNickName.setText(latestMsgs.get(position).getNickName());
                latestMsgHolder.textViewLatestMsg.setText(latestMsgs.get(position).getMsg());
                latestMsgHolder.textViewTime.setText(latestMsgs.get(position).getTime());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return latestMsgs.size();
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    class LatestMsgHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.imageViewHeadImage)
        ImageView imageViewHeadImage;
        @BindView(R.id.textViewNickName)
        TextView textViewNickName;
        @BindView(R.id.textViewLatestMsg)
        TextView textViewLatestMsg;
        @BindView(R.id.textViewTime)
        TextView textViewTime;

        LatestMsgHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
