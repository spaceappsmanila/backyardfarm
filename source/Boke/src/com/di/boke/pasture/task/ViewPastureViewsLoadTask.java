package com.di.boke.pasture.task;

import java.util.List;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ListView;

import com.di.boke.R;
import com.di.boke.core.adapter.GenericListViewAdapter;
import com.di.boke.core.model.Pasture;
import com.di.boke.pasture.activity.ViewPastureViewsActivity;

/**
 *
 * @since 2013-04-21
 * @author Dungeon Innovations
 */
public
  class   ViewPastureViewsLoadTask
  extends AsyncTask<Void, Void, List<Pasture>>
{
  private static final String TAG
    = ViewPastureViewsLoadTask.class.getName();
  
  private ViewPastureViewsActivity activityContext;

  public ViewPastureViewsLoadTask(ViewPastureViewsActivity activityContext)
  {
    this.activityContext = activityContext;
  }
  
  @Override
  protected List<Pasture> doInBackground(Void... params)
  {
    Log.d(TAG, "doInBackground");
    
    // TODO Auto-generated method stub
    return null;
  }
  
  @Override
  protected void onPostExecute(List<Pasture> pastureList)
  {
    super.onPostExecute(pastureList);
    
    loadPasturesOnUi(pastureList);
  }
  
  private void loadPasturesOnUi(List<Pasture> pastureList)
  {
    GenericListViewAdapter listViewAdapter
      = new GenericListViewAdapter( this.activityContext
                                    , R.layout.core_generic_list_layout
                                    , pastureList
                                    , null);
    
    ListView pastureListView = this.activityContext.getPastureListView();
    pastureListView.setAdapter(listViewAdapter);
  }
}
