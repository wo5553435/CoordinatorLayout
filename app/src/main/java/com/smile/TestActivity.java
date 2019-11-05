package com.smile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.smile.drag.DragActivity;
import com.smile.practice.CollapsingToolbarActivity;
import com.smile.practice.DependentActivity;
import com.smile.practice.NestedActivity;
import com.smile.practice.R;

/**
 * Created by sbzhou2 on 2019/11/5.
 * mail: sbzhou2@iflytek.com
 */

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.btn_one).setOnClickListener(this);
        findViewById(R.id.btn_two).setOnClickListener(this);
        findViewById(R.id.btn_three).setOnClickListener(this);
        findViewById(R.id.btn_four).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=null;
        switch (v.getId()){
            case R.id.btn_one:
                intent=new Intent(TestActivity.this, CollapsingToolbarActivity.class);
                break;
            case R.id.btn_two:
                intent=new Intent(TestActivity.this, DependentActivity.class);
                break;
            case R.id.btn_three:
                intent=new Intent(TestActivity.this, NestedActivity.class);
                break;
            case R.id.btn_four:
                intent=new Intent(TestActivity.this, DragActivity.class);
                break;
        }
        startActivity(intent);
    }
}
