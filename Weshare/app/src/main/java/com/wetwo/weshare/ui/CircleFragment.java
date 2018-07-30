package com.wetwo.weshare.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wetwo.data.model.adpter.Moment;
import com.wetwo.weshare.R;
import com.wetwo.weshare.adapter.LatestMsgRecyclerViewAdapter;
import com.wetwo.weshare.adapter.MomentsRecyclerViewAdapter;
import com.wetwo.weshare.presenter.ICirclePresenter;
import com.wetwo.weshare.presenter.impl.CirclePresenter;
import com.wetwo.weshare.ui.view.ICircleFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by FHZ on 2018/7/12.
 */

public class CircleFragment extends Fragment implements ICircleFragment{

    @BindView(R.id.recyclerViewLatestMsgList)
    RecyclerView recyclerViewLatestMsgList;
    private boolean isActive = true;
    private Unbinder unbinder;
    private ICirclePresenter circlePresenter;
    MomentsRecyclerViewAdapter momentsRecyclerViewAdapter;
    List<Moment> moments=new ArrayList<>();

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
        momentsRecyclerViewAdapter=new MomentsRecyclerViewAdapter(moments, getActivity());
        recyclerViewLatestMsgList.setAdapter(momentsRecyclerViewAdapter);
        circlePresenter = new CirclePresenter(this);
        circlePresenter.loadData();
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
    public void updateAll(List<Moment> moments) {
        this.moments.addAll(moments);
        momentsRecyclerViewAdapter.notifyDataSetChanged();
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
