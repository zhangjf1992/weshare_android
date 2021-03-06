package com.wetwo.weshare.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wetwo.data.model.adpter.LatestMsg;
import com.wetwo.weshare.R;
import com.wetwo.weshare.adapter.LatestMsgRecyclerViewAdapter;
import com.wetwo.weshare.presenter.IMsgPresenter;
import com.wetwo.weshare.presenter.impl.MsgPresenter;
import com.wetwo.weshare.ui.view.IMsgFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by FHZ on 2018/7/12.
 */

public class MsgFragment extends Fragment implements IMsgFragment {

    @BindView(R.id.recyclerViewLatestMsgList)
    RecyclerView recyclerViewLatestMsgList;
    private boolean isActive = true;
    private Unbinder unbinder;
    private IMsgPresenter infoPresenter;
    private LatestMsgRecyclerViewAdapter latestMsgRecyclerViewAdapter;
    private List<LatestMsg> latestMsgs=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_msg, container, false);
        unbinder = ButterKnife.bind(this, view);
        isActive = true;
        return view;
    }

    private void init() {
        recyclerViewLatestMsgList.setLayoutManager(new LinearLayoutManager(getActivity()));
        latestMsgRecyclerViewAdapter =new LatestMsgRecyclerViewAdapter(latestMsgs, getActivity());
        recyclerViewLatestMsgList.setAdapter(latestMsgRecyclerViewAdapter);
        infoPresenter = new MsgPresenter(this);
        infoPresenter.loadData();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        init();
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public void updateAll(List<LatestMsg> latestMsgs) {
        this.latestMsgs.addAll(latestMsgs);
        latestMsgRecyclerViewAdapter.notifyDataSetChanged();
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
