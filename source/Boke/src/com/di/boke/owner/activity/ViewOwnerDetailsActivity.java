package com.di.boke.owner.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.di.boke.R;
import com.di.boke.home.activity.MenuListActivity;
import com.di.boke.owner.task.ViewOwnerDetailsLoadTask;

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
  private static final String TAG = ViewOwnerDetailsActivity.class.getName();

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.owner_view_owner_details_activity);
    
    new ViewOwnerDetailsLoadTask(this).execute();
    
    /*
     * back button
     */
    findViewById(R.id.owner_view_owner_details_navigation_back_button)
      .setOnClickListener
      (
        new View.OnClickListener()
        {
          
          @Override
          public void onClick(View view)
          {
            Intent homeMenuIntent = new Intent( ViewOwnerDetailsActivity.this
                                                , MenuListActivity.class);
            homeMenuIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeMenuIntent);
          }
        }
      );
    
    /*
     * edit button
     */
    findViewById(R.id.owner_view_owner_details_navigation_edit_button)
      .setOnClickListener
      (
        new View.OnClickListener()
        {
          @Override
          public void onClick(View view)
          {
            
          }
        }
      )
      ;
  }

  @Override
  public void onBackPressed()
  {
    Intent homeMenuIntent = new Intent( ViewOwnerDetailsActivity.this
                                        , MenuListActivity.class);
    homeMenuIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(homeMenuIntent);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.owner_view_owner_details_activity, menu);
    return true;
  }

}
