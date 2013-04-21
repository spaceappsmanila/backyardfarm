package com.di.boke.pasture.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.di.boke.R;
import com.di.boke.home.activity.MenuListActivity;
import com.di.boke.pasture.task.ViewPastureViewsLoadTask;

public
  class   ViewPastureViewsActivity
  extends Activity
{
  private static final String TAG = ViewPastureViewsActivity.class.getName();
  
  private ListView pastureListView;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.pasture_view_pasture_views_activity);
    
    Log.d(TAG, "onCreate");
    
    this.pastureListView
      = (ListView) findViewById(R.id.pasture_view_pasture_views_list_view);
    
    new ViewPastureViewsLoadTask(this).execute();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.pasture_view_pasture_views_activity, menu);
    return true;
  }
  
  
  
  @Override
  public boolean onOptionsItemSelected(MenuItem item)
  {
    switch (item.getItemId())
    {
      default:
      {
        return super.onOptionsItemSelected(item);
      }
      case R.id.pasture_view_pasture_views_add_pasture:
      {
        Intent addPasture = new Intent(this, AddPastureActivity.class);
        startActivity(addPasture);
        
        return true;
      }
    }
  }

  @Override
  public void onBackPressed()
  {
    super.onBackPressed();
    
    Intent menuListIntent = new Intent(this, MenuListActivity.class);
    menuListIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(menuListIntent);
  }

  public ListView getPastureListView()
  {
    return pastureListView;
  }

  public void setPastureListView(ListView pastureListView)
  {
    this.pastureListView = pastureListView;
  }
}
