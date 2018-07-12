package com.wetwo.weshare.home.view;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.wetwo.weshare.R;
import com.wetwo.weshare.info.view.InfoFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageViewPersonal)
    ImageView imageViewPersonal;
    @BindView(R.id.imageViewSwitch)
    ImageView imageViewSwitch;
    @BindView(R.id.framLayoutInfo)
    FrameLayout framLayoutInfo;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        fragmentManager=getFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.framLayoutInfo,new InfoFragment(),"infoFragment").commit();
    }

    @OnClick({R.id.imageViewPersonal, R.id.imageViewSwitch})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageViewPersonal:
                break;
            case R.id.imageViewSwitch:
                break;
        }
    }
}
