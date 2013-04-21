package com.di.boke.merchandise.activity;

import com.di.boke.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ViewMerchandiseDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_merchandise_details);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_view_merchandise_details, menu);
        return true;
    }
    
}
