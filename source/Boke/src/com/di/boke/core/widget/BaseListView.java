package com.di.boke.core.widget;

import com.di.boke.R;
import com.di.boke.core.utility.UiUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 *
 * @since Apr 21, 2013
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public
  class   BaseListView
  extends ListView
{
  public BaseListView(Context context)
  {
    super(context);
  }
  
  public BaseListView(Context context, AttributeSet attrs)
  {
    super(context, attrs);
    setAdditionalAttributes(context, attrs);
  }
  
  public BaseListView(Context context, AttributeSet attrs, int defStyle)
  {
    super(context, attrs);
    setAdditionalAttributes(context, attrs);
  }
  
  private void setAdditionalAttributes(Context context, AttributeSet attrs)
  {
    
    /*
     * Set the custom font
     */
    
    UiUtil.setCustomFont( this
                          , context
                          , attrs
                          , R.styleable.base_listView
                          , R.styleable.base_listView_font);
    
  }
}
