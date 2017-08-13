package com.example.test1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Second extends BasicActivity {

    TextView tv;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv = (TextView)findViewById(R.id.second_tv);
        bt = (Button)findViewById(R.id.second_bt1);
        tv.setText(getClass().getSimpleName());
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Second.this,Third.class);
                startActivity(intent);
            }
        });
    }
}
