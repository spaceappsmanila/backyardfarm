package com.di.boke.guide.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

import com.di.boke.R;
import com.di.boke.guide.task.ViewGuideViewsLoadGuidesTask;
import com.di.boke.home.activity.MenuListActivity;

/**
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 *
 */
public
  class   ViewGuideViewsActivity
  extends Activity
{
  private static final String TAG = ViewGuideViewsActivity.class.getName();

  private ListView guidesListView;
  
  private ViewGuideViewsLoadGuidesTask loadGuidesTask;
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.guide_view_guide_views_activity);
    
    Log.d(TAG, "onCreate");
    
    this.guidesListView = (ListView) findViewById(R.id.guide_view_guide_views_list_view);
    
    this.loadGuidesTask = new ViewGuideViewsLoadGuidesTask(this);
    this.loadGuidesTask.execute();
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.guide_view_guides_activity, menu);
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

  public ListView getGuidesListView()
  {
    return guidesListView;
  }

  public void setGuidesListView(ListView guidesListView)
  {
    this.guidesListView = guidesListView;
  }
}
