package com.di.boke.pasture.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.di.boke.R;

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
