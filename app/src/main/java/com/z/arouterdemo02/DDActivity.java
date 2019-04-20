package com.z.arouterdemo02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = "/app/DD")
public class DDActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dd);
        ARouter.getInstance().inject(this);
    }

    public void goMine(View view) {
        ARouter.getInstance().build("/mine/main").navigation();
    }
}
