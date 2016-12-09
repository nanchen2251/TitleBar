package com.nanchen.titlebardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.nanchen.titlebar.TitleView;

public class MainActivity extends AppCompatActivity {

    private TitleView mTitleBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitleBar = (TitleView) findViewById(R.id.titleBar);
        //设置左侧按钮点击关闭Activity
        mTitleBar.setLeftButtonAsFinish(this);
        //设置标题栏中间文字
        mTitleBar.setTitle("测试");
        //设置左侧图片
//        mTitleBar.setLeftButtonImage(R.mipmap.ic_launcher);
        //设置左侧点击事件
//        mTitleBar.setLeftButtonOnClickListener(new OnClickListener());
        //设置中间是一个view
//        mTitleBar.setCenterButtonAsCustomView(view);
        //设置是否显示下方下划线
//        mTitleBar.showBottomLine(true);

        // 设置右侧文字
        mTitleBar.setRightButtonText("\ue620");
        //设置右侧图片
//        mTitleBar.setRightButtonImage(R.mipmap.ic_launcher);
        //设置文本大小
        mTitleBar.setRightButtonTextSize(25);
        mTitleBar.setFixRightButtonPadingTop();
        //设置右侧点击监听
        mTitleBar.setRightButtonOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this.getApplicationContext(),"你点击了右侧按钮",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
