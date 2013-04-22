package com.di.boke.merchandise.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

import com.di.boke.R;
import com.di.boke.home.activity.MenuListActivity;
import com.di.boke.merchandise.task.ViewMerchandiseViewsLoadTask;

/**
 * Activity class for displaying the Merchandise Items
 * 
 * @since  2013-04-22
 * @author Dungeon Innovations
 */
public 
  class ViewMerchandiseViewsActivity 
  extends Activity
{
  private static final String TAG = ViewMerchandiseViewsActivity.class.getName();
  
  private ListView merchandiseListView;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.merchandise_view_merchandise_views_activity);
    
    Log.d(TAG, "onCreate");
    
    this.merchandiseListView
      = (ListView) findViewById(R.id.merchandise_view_merchandise_views_list_view);
    
    new ViewMerchandiseViewsLoadTask(this).execute();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.merchandise_view_merchandise_views_activity, menu);
    return true;
  }
  
  @Override
  public void onBackPressed()
  {
    super.onBackPressed();
    
    Intent menuListIntent = new Intent(this, MenuListActivity.class);
    menuListIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(menuListIntent);
  }

  public ListView getMerchandiseListView()
  {
    return merchandiseListView;
  }

  public void setMerchandiseListView(ListView merchandiseListView)
  {
    this.merchandiseListView = merchandiseListView;
  }
}
