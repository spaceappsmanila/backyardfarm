package com.di.boke.pasture.activity;

import com.di.boke.R;
import com.di.boke.R.layout;
import com.di.boke.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class AddPastureActivity extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.pasture_add_pasture_activity);
  }

  @Override
  public void onBackPressed()
  {
    super.onBackPressed();
    
    Intent viewPasturesIntent = new Intent(this, ViewPastureViewsActivity.class);
    viewPasturesIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(viewPasturesIntent);
    
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.pasture_add_pasture_activity, menu);
    return true;
  }

}
