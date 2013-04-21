package com.di.boke.owner.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.di.boke.R;

/**
 * Activity class used for displaying the details of the farm owner.
 * 
 * @since 2013-04-22
 * @author Dungeon Innovations
 *
 */
public
  class   ViewOwnerDetailsActivity
  extends Activity
{

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.owner_view_owner_details_activity);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.owner_view_owner_details_activity, menu);
    return true;
  }

}
