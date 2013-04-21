package com.di.boke.guide.listener;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.di.boke.core.constants.IntentKeysEnum;
import com.di.boke.core.model.Guide;
import com.di.boke.guide.activity.ViewGuideDetailActivity;
import com.di.boke.guide.activity.ViewGuideViewsActivity;

/**
 *
 * @since 2013-04-21
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public
  class       ViewGuideViewsGuideOnClick
  implements  OnClickListener
{
  private final static String TAG = ViewGuideViewsGuideOnClick.class.getName();
  
  private ViewGuideViewsActivity activityContext;
  
  public ViewGuideViewsGuideOnClick(ViewGuideViewsActivity activityContext)
  {
    this.activityContext = activityContext;
  }

  @Override
  public void onClick(View view)
  {
    Log.d(TAG, "onClick");
    
    Guide selectedGuide = (Guide) view.getTag();
    String selectedGuideId = selectedGuide.getId();
    
    Intent viewAssetDetailsIntent = new Intent( activityContext
                                                , ViewGuideDetailActivity.class);
    viewAssetDetailsIntent.putExtra(IntentKeysEnum.GUIDE_SELECTED_ID.keyName()
                                    , selectedGuideId);
    this.activityContext.startActivity(viewAssetDetailsIntent);
  }

}
