package com.wetwo.weshare.ui;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wetwo.weshare.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.frameLayout)
    FrameLayout frameLayout;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    @BindView(R.id.linearLayoutBottom)
    LinearLayout linearLayoutBottom;
    @BindView(R.id.textViewLatestMsg)
    TextView textViewLatestMsg;
    @BindView(R.id.textViewCircle)
    TextView textViewCircle;
    @BindView(R.id.textViewPersonal)
    TextView textViewPersonal;
    @BindView(R.id.imageViewAdd)
    ImageView imageViewAdd;
    private String[] fragmentTags = {MsgFragment.class.getSimpleName(), CircleFragment.class.getSimpleName(),MineFragment.class.getSimpleName()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frameLayout,new MineFragment(),fragmentTags[2])
                .add(R.id.frameLayout, new CircleFragment(), fragmentTags[1])
                .add(R.id.frameLayout, new MsgFragment(), fragmentTags[0]).commit();
        setBottomSelected(textViewLatestMsg);
    }


    @OnClick({R.id.textViewLatestMsg, R.id.textViewCircle, R.id.textViewPersonal, R.id.imageViewAdd})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.imageViewAdd:
                break;
            case R.id.textViewLatestMsg:
                selectFragment(fragmentTags[0]);
                setBottomSelected(textViewLatestMsg);
                break;
            case R.id.textViewCircle:
                selectFragment(fragmentTags[1]);
                setBottomSelected(textViewCircle);
                break;
            case R.id.textViewPersonal:
                selectFragment(fragmentTags[2]);
                setBottomSelected(textViewPersonal);
                break;
        }
    }

    private void selectFragment(String fragmentTag) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        for (String tag : fragmentTags) {
            if (fragmentTag.equals(tag)) {
                fragmentTransaction.show(fragmentManager.findFragmentByTag(tag));
            } else {
                fragmentTransaction.hide(fragmentManager.findFragmentByTag(tag));
            }
        }
        fragmentTransaction.commit();
    }

    private void setBottomSelected(View v) {
        for (int i = 0; i < linearLayoutBottom.getChildCount(); i++) {
            View _v = linearLayoutBottom.getChildAt(i);
            if (v.getId() == _v.getId()) {
                v.setSelected(true);
            } else {
                _v.setSelected(false);
            }
        }
    }
}
