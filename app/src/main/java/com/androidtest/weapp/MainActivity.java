package com.androidtest.weapp;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //应用程序界面被创建时调用的方法
        super.onCreate(savedInstanceState);
        //设置显示的UI
        setContentView(R.layout.activity_main);

        //查找界面控件
        final View button1 = findViewById(R.id.button1);
//        设置控件的监听事件，监听按钮的点击，内部类实现点击的操作
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{
                Manifest.permission.CALL_PHONE}, 1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "测试点击", Toast.LENGTH_LONG).show();
//               Intent意图步骤：
//                1.setAction 意图设置动作
//                2.setData 携带动作需要的数据
//                3.新的界面响应意图的操作

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
//               接收uri参数
                intent.setData(Uri.parse("tel://18651891352"));
//              开启新界面响应操作
                startActivity(intent);

            }
        });
    }
}
