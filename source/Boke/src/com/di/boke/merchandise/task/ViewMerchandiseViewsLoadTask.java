package com.di.boke.merchandise.task;

import java.util.List;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import com.di.boke.R;
import com.di.boke.core.model.Merchandise;
import com.di.boke.core.sampledata.MerchandiseDataFactory;
import com.di.boke.merchandise.activity.ViewMerchandiseDetailsActivity;
import com.di.boke.merchandise.activity.ViewMerchandiseViewsActivity;
import com.di.boke.merchandise.adapter.MerchandiseAdapter;

/**
 *
 * @since 2013-04-21
 * @author Dungeon Innovations
 */
public
  class   ViewMerchandiseViewsLoadTask
  extends AsyncTask<Void, Void, List<Merchandise>>
{
  private static final String TAG
    = ViewMerchandiseViewsLoadTask.class.getName();
  
  private ViewMerchandiseViewsActivity activityContext;

  public ViewMerchandiseViewsLoadTask(ViewMerchandiseViewsActivity activityContext)
  {
    this.activityContext = activityContext;
  }
  
  @Override
  protected List<Merchandise> doInBackground(Void... params)
  {
    Log.d(TAG, "doInBackground");
    
//    PastureSo pastureSo = new PastureSo();
    List<Merchandise> merchandise = MerchandiseDataFactory.getMerchandise();
    
    return merchandise;
  }
  
  @Override
  protected void onPostExecute(List<Merchandise> merchandiseList)
  {
    super.onPostExecute(merchandiseList);
    
    loadMerchandiseOnUi(merchandiseList);
  }
  
  private void loadMerchandiseOnUi(List<Merchandise> merchandiseList)
  {
    MerchandiseAdapter merchandiseAdapter 
      = new MerchandiseAdapter(this.activityContext
                                , R.layout.merchandise_merchandise_list_layout
                                , merchandiseList
                                , new View.OnClickListener()
                                {
                                  
                                  @Override
                                  public void onClick(View v)
                                  {
                                    Intent merchandiseDetailIntent = new Intent(activityContext, ViewMerchandiseDetailsActivity.class);
                                    merchandiseDetailIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    activityContext.startActivity(merchandiseDetailIntent);
                                  }
                                }
                                );
    
    this.activityContext.getMerchandiseListView().setAdapter(merchandiseAdapter);
  }
}
