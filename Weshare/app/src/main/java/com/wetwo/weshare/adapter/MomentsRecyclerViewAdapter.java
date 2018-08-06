package com.wetwo.weshare.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.GridLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    final public static int MOMENT_HOLDER_ONE_PICTURE_TYPE = 0;
    final public static int MOMENT_HOLDER_MORE_PICTURE_TYPE = 1;
    final public static int MOMENT_HOLDER_VIDEO_TYPE = 2;

    public MomentsRecyclerViewAdapter(List<Moment> moments, Context context) {
        this.moments = moments;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType) {
            case MOMENT_HOLDER_ONE_PICTURE_TYPE:
            case MOMENT_HOLDER_VIDEO_TYPE:
                viewHolder = new OnePictureHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_moments_one_picture, parent, false));
                break;
            case MOMENT_HOLDER_MORE_PICTURE_TYPE:
                viewHolder = new MorePictureHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_moments_more_picture, parent, false));
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case MOMENT_HOLDER_ONE_PICTURE_TYPE:
                OnePictureHolder onePictureHolder = (OnePictureHolder) holder;
//                onePictureHolder.textViewNickName.setText(moments.get(position).getNickName());
//                onePictureHolder.textViewText.setText(moments.get(position).getText());
//                onePictureHolder.textViewTime.setText(moments.get(position).getTime());
                onePictureHolder.imageViewPause.setVisibility(View.INVISIBLE);
                break;
            case MOMENT_HOLDER_MORE_PICTURE_TYPE:
                MorePictureHolder morePictureHolder = (MorePictureHolder) holder;
                break;
            case MOMENT_HOLDER_VIDEO_TYPE:
                OnePictureHolder onePictureHolder1=(OnePictureHolder)holder;
                onePictureHolder1.imageViewPause.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return moments.size();
    }

    @Override
    public int getItemViewType(int position) {
        return moments.get(position).getType();
    }

    class OnePictureHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageViewHeadImage)
        ImageView imageViewHeadImage;
        @BindView(R.id.textViewNickName)
        TextView textViewNickName;
        @BindView(R.id.textViewText)
        TextView textViewText;
        @BindView(R.id.imageViewPicture)
        ImageView imageViewPicture;
        @BindView(R.id.imageViewPause)
        ImageView imageViewPause;
        @BindView(R.id.textViewTime)
        TextView textViewTime;

        public OnePictureHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    class MorePictureHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageViewHeadImage)
        ImageView imageViewHeadImage;
        @BindView(R.id.textViewNickName)
        TextView textViewNickName;
        @BindView(R.id.textViewText)
        TextView textViewText;
        @BindView(R.id.imageView1)
        ImageView imageView1;
        @BindView(R.id.imageView2)
        ImageView imageView2;
        @BindView(R.id.imageView3)
        ImageView imageView3;
        @BindView(R.id.imageView4)
        ImageView imageView4;
        @BindView(R.id.imageView5)
        ImageView imageView5;
        @BindView(R.id.imageView6)
        ImageView imageView6;
        @BindView(R.id.imageView7)
        ImageView imageView7;
        @BindView(R.id.imageView8)
        ImageView imageView8;
        @BindView(R.id.imageView9)
        ImageView imageView9;
        @BindView(R.id.gridLayoutPictures)
        GridLayout gridLayoutPictures;
        @BindView(R.id.textViewTime)
        TextView textViewTime;

        public MorePictureHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
