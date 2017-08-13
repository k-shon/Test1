package com.example.test1;

import android.content.Intent;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends BasicActivity {

    TextView tv;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityCollector.addActivity(this);

        //隐藏标题栏
        ActionBar actionBar=getActionBar();
        if(actionBar!=null)
            actionBar.hide();

        tv = (TextView)findViewById(R.id.main_tv);
        bt = (Button)findViewById(R.id.main_bt1);
        tv.setText(getClass().getSimpleName());
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
