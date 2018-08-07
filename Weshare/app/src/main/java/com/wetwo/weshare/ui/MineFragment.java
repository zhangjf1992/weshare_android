package com.wetwo.weshare.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.wetwo.weshare.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by FHZ on 2018/8/7.
 */

public class MineFragment extends Fragment {
    @BindView(R.id.imageViewHeadImage)
    ImageView imageViewHeadImage;
    @BindView(R.id.textViewNickName)
    TextView textViewNickName;
    @BindView(R.id.textViewPosition)
    TextView textViewPosition;
    @BindView(R.id.relativeLayoutMine)
    RelativeLayout relativeLayoutMine;
    @BindView(R.id.textViewMyBroadcast)
    TextView textViewMyBroadcast;
    @BindView(R.id.textViewMyCircle)
    TextView textViewMyCircle;
    @BindView(R.id.setting)
    TextView setting;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mine, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.textViewPosition,R.id.relativeLayoutMine, R.id.textViewMyBroadcast, R.id.textViewMyCircle, R.id.setting})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textViewPosition:
                break;
            case R.id.relativeLayoutMine:
                break;
            case R.id.textViewMyBroadcast:
                break;
            case R.id.textViewMyCircle:
                break;
            case R.id.setting:
                break;
        }
    }
}
