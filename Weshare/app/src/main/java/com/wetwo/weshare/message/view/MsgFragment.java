package com.wetwo.weshare.message.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wetwo.data.model.Information;
import com.wetwo.weshare.R;
import com.wetwo.weshare.message.presenter.IMsgPresenter;
import com.wetwo.weshare.message.presenter.MsgPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by FHZ on 2018/7/12.
 */

public class MsgFragment extends Fragment implements IMsgFragment {

    @BindView(R.id.listViewInfo)
    ListView listViewInfo;
    private boolean isActive = true;
    private Unbinder unbinder;
    private IMsgPresenter infoPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_msg, container, false);
        unbinder = ButterKnife.bind(this, view);
        init();
        isActive = true;
        return view;
    }

    private void init() {
        infoPresenter=new MsgPresenter(this);
        infoPresenter.loadData();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public void onDataLoaded(List<Information> informationList) {

    }

    @Override
    public void update() {

    }

    @Override
    public void onPause() {
        super.onPause();
        isActive = false;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
