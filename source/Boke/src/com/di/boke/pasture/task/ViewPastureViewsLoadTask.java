package com.di.boke.pasture.task;

import java.util.List;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.di.boke.R;
import com.di.boke.core.model.Pasture;
import com.di.boke.pasture.activity.ViewPastureViewsActivity;
import com.di.boke.pasture.adapter.PasturesAdapter;
import com.di.boke.pasture.so.PastureSo;

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
    
    PastureSo pastureSo = new PastureSo();
    List<Pasture> pastures = pastureSo.getAllPastures();
    
    return pastures;
  }
  
  @Override
  protected void onPostExecute(List<Pasture> pastureList)
  {
    super.onPostExecute(pastureList);
    
    loadPasturesOnUi(pastureList);
  }
  
  private void loadPasturesOnUi(List<Pasture> pastureList)
  {
    PasturesAdapter listViewAdapter
      = new PasturesAdapter(
          this.activityContext
          , R.layout.core_generic_list_layout
          , pastureList
          , new View.OnClickListener()
            {
              
              @Override
              public void onClick(View view)
              {
                LinearLayout pastureDetails
                  = (LinearLayout) view.findViewById(
                      R.id.pasture_pasture_list_layout_detail_section);
                pastureDetails.setVisibility(View.GONE);
              }
            }
          , new View.OnLongClickListener()
            {
              
              @Override
              public boolean onLongClick(View view)
              {
                LinearLayout pastureDetails
                  = (LinearLayout) view.findViewById(
                      R.id.pasture_pasture_list_layout_detail_section);
                pastureDetails.setVisibility(View.VISIBLE);
                return false;
              }
            });
    
    ListView pastureListView = this.activityContext.getPastureListView();
    pastureListView.setAdapter(listViewAdapter);
  }
}
