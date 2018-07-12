package com.wetwo.weshare.home.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.wetwo.weshare.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageViewPersonal)
    ImageView imageViewPersonal;
    @BindView(R.id.imageViewMap)
    ImageView imageViewMap;
    @BindView(R.id.framLayoutInfo)
    FrameLayout framLayoutInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.imageViewPersonal, R.id.imageViewMap})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageViewPersonal:
                break;
            case R.id.imageViewMap:
                break;
        }
    }
}
