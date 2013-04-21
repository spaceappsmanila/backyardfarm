package com.di.boke.home.activity;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.di.boke.R;
import com.di.boke.core.adapter.Navigable;
import com.di.boke.core.adapter.NavigableComponentAdapter;
import com.di.boke.core.model.MenuEnum;
import com.di.boke.home.so.MenuRetrievalSo;

/**
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 *
 */
public
  class   MenuListActivity
  extends Activity
{
  private static final String TAG = MenuListActivity.class.getName();
  
  private ListView menuListView;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.home_menu_activity);
    
    Log.d(TAG, "onCreate");
    
    this.menuListView = (ListView) findViewById(R.id.home_menu_menu_list_view);
  }
  
  @Override
  public void onStart()
  {
    super.onStart();
    
    MenuRetrievalSo menuService = new MenuRetrievalSo();
    List<Navigable> navigationMenus = menuService.getRootMenu();
    
    /*
     * Create an adapter for converting the Navigation Menus into UserAccount Interface
     * elements.
     */
    NavigableComponentAdapter navigationMenuAdapter = 
      new NavigableComponentAdapter(this
                                    , R.layout.core_navigation_menu_layout
                                    , navigationMenus
                                    , new View.OnClickListener()
                                      {
                                        @Override
                                        public void onClick(View view)
                                        {
                                          int viewId = view.getId();
                                          
                                          Class<? extends Activity> nextActivity = MenuEnum.getActivity(viewId);
                                          
                                          if (nextActivity != null)
                                          {
                                            Intent intent = new Intent(MenuListActivity.this, nextActivity);
                                            startActivity(intent);
                                          }
                                        } 
                                      });
    
    
    this.menuListView.setAdapter(navigationMenuAdapter);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.home_menu_list_activity, menu);
    
    return true;
  }

}
