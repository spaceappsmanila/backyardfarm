package com.di.boke.guide.task;

import java.util.List;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.di.boke.R;
import com.di.boke.core.model.Guide;
import com.di.boke.guide.activity.ViewGuideViewsActivity;
import com.di.boke.guide.adapter.GuidesAdapter;
import com.di.boke.guide.listener.ViewGuideViewsGuideOnClick;
import com.di.boke.guide.so.GuideSo;

/**
 *
 * @since 2013-04-21
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public
  class   ViewGuideViewsLoadGuidesTask
  extends AsyncTask<Void, Void, List<Guide>>
{
  private final static String TAG = ViewGuideViewsLoadGuidesTask.class.getName();
  
  private ViewGuideViewsActivity activityContext;
  
  public ViewGuideViewsLoadGuidesTask(ViewGuideViewsActivity activityContext)
  {
    this.activityContext = activityContext;
  }

  @Override
  protected List<Guide> doInBackground(Void... params)
  {
    GuideSo guideSo = new GuideSo();
    List<Guide> guides = guideSo.getAllGuides();
    
    return guides;
  }
  
  protected void onPostExecute(List<Guide> guides)
  {
    super.onPostExecute(guides);
    
    Log.d(TAG, "onPostExecute");
    
    loadGuidesOnUi(guides);
  }
  
  private void loadGuidesOnUi(List<Guide> guides)
  {
    OnClickListener guideSelectedListener
      = new ViewGuideViewsGuideOnClick(this.activityContext);
    
    GuidesAdapter guidesAdapter
      = new GuidesAdapter(this.activityContext
                          , R.layout.guide_guide_list_layout
                          , guides
                          , guideSelectedListener);
    
    ListView guidesListView = this.activityContext.getGuidesListView();
    guidesListView.setAdapter(guidesAdapter);
  }
}
