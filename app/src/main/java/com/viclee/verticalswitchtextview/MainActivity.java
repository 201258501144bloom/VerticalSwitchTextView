package com.viclee.verticalswitchtextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("测试", "Android", "资源管理", "破解密钥", "微信", "科比"));
        VerticalSwitchTextView verticalSwitchTextView1 = (VerticalSwitchTextView) findViewById(R.id.vertical_switch_textview1);
        VerticalSwitchTextView verticalSwitchTextView2 = (VerticalSwitchTextView) findViewById(R.id.vertical_switch_textview2);
        verticalSwitchTextView1.setCbInterface(new VerticalSwitchTextView.VerticalSwitchTextViewCbInterface() {
            @Override
            public void showNext(int index) {

            }

            @Override
            public void onItemClick(int index) {

            }
        });
        verticalSwitchTextView2.setCbInterface(new VerticalSwitchTextView.VerticalSwitchTextViewCbInterface() {
            @Override
            public void showNext(int index) {

            }

            @Override
            public void onItemClick(int index) {

            }
        });
        verticalSwitchTextView1.setTextContent(list);
        verticalSwitchTextView2.setTextContent(list);
    }
}
