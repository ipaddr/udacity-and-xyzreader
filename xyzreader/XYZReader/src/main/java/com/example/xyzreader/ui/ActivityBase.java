package com.example.xyzreader.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.xyzreader.R;

/**
 * Created by iip on 1/25/17.
 */

public abstract class ActivityBase extends AppCompatActivity {

    private Toolbar toolbar;
    private ActionBar actionBar;

    public abstract void setContentView();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView();
        // setting toolbar and action bar
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        // Show the Up button in the action bar.
        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

}
