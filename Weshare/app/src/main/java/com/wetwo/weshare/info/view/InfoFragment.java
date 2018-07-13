package com.wetwo.weshare.info.view;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.wetwo.data.model.Information;
import com.wetwo.weshare.R;
import com.wetwo.weshare.adapter.InfoListAdapter;
import com.wetwo.weshare.info.presenter.IInfoPresenter;
import com.wetwo.weshare.info.presenter.InfoPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by FHZ on 2018/7/12.
 */

public class InfoFragment extends Fragment implements IInfoFragment {

    @BindView(R.id.listViewInfo)
    ListView listViewInfo;
    private boolean isActive = true;
    private Unbinder unbinder;
    private IInfoPresenter infoPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        unbinder = ButterKnife.bind(this, view);
        init();
        isActive = true;
        return view;
    }

    private void init() {
        infoPresenter=new InfoPresenter(this);
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
