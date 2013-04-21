package com.di.boke.guide.task;

import java.util.List;

import android.content.Intent;
import android.os.AsyncTask;
import android.widget.TextView;

import com.di.boke.R;
import com.di.boke.core.constants.IntentKeysEnum;
import com.di.boke.core.model.Guide;
import com.di.boke.core.model.Topic;
import com.di.boke.guide.activity.ViewGuideDetailActivity;
import com.di.boke.guide.so.GuideSo;

/**
 *
 * @since Apr 21, 2013
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public
  class   ViewGuideDetailLoadGuideTask
  extends AsyncTask<Void, Void, Guide>
{
  private final static String TAG = ViewGuideDetailLoadGuideTask.class.getName();
  
  private ViewGuideDetailActivity activityContext;
  
  public ViewGuideDetailLoadGuideTask(ViewGuideDetailActivity activityContext)
  {
    this.activityContext = activityContext;
  }

  @Override
  protected Guide doInBackground(Void... params)
  {
    Intent currentIntent = this.activityContext.getIntent();
    String guideId = currentIntent.getStringExtra(IntentKeysEnum.GUIDE_SELECTED_ID.keyName());
    System.out.println("Guide ID: " + guideId);
    
    GuideSo guideSo = new GuideSo();
    Guide guide = guideSo.getGuide(guideId);
    
    return guide;
  }
  
  @Override
  protected void onPostExecute(Guide guide)
  {
    super.onPostExecute(guide);
    
    this.activityContext.setLoadedGuide(guide);
    
    loadGuideOnUi(guide);
  }
  
  private void loadGuideOnUi(Guide guide)
  {
    String guideName        = guide.getName();
    String guideDescription = guide.getDescription();
    
    TextView guideTitleTextView
      = (TextView) this.activityContext
        .findViewById(R.id.guide_view_guide_detail_title_value);
    guideTitleTextView.setText(guideName);
    
    TextView guideDescriptionTextView
      = (TextView) this.activityContext
        .findViewById(R.id.guide_view_guide_detail_description_value);
    guideDescriptionTextView.setText(guideDescription);
    
    if (guide != null)
    {
      List<Topic> topics = guide.getTopics();
      
      if (topics.size() != 0)
      {
        activityContext.loadTopic(0);
      }
    }
  }
}
