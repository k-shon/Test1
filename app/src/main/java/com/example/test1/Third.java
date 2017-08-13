package com.example.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Third extends BasicActivity {

    TextView tv;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tv = (TextView)findViewById(R.id.third_tv);
        bt = (Button)findViewById(R.id.third_bt1);
        tv.setText(getClass().getSimpleName());
    }
}
