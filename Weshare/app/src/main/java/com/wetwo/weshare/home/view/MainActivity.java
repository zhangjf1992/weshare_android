package com.wetwo.weshare.home.view;

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
import com.wetwo.weshare.message.view.MsgFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imageViewSwitch)
    ImageView imageViewSwitch;
    @BindView(R.id.framLayoutInfo)
    FrameLayout framLayoutInfo;
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
        fragmentTransaction.add(R.id.framLayoutInfo, new MsgFragment(), "msgFragment").commit();
        setBottomSelected(textViewLatestMsg);
    }


    @OnClick({R.id.textViewLatestMsg, R.id.textViewCircle, R.id.textViewPersonal})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textViewLatestMsg:
                setBottomSelected(textViewLatestMsg);
                break;
            case R.id.textViewCircle:
                setBottomSelected(textViewCircle);
                break;
            case R.id.textViewPersonal:
                setBottomSelected(textViewPersonal);
                break;
        }
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
