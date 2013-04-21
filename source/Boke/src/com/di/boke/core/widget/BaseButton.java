package com.di.boke.core.widget;

import com.di.boke.R;
import com.di.boke.core.utility.UiUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 *
 */
public
  class   BaseButton
  extends Button
{
  public BaseButton(Context context)
  {
    super(context);
  }
  
  public BaseButton(Context context, AttributeSet attrs)
  {
    super(context, attrs);
    setAdditionalAttributes(context, attrs);
  }
  
  public BaseButton(Context context, AttributeSet attrs, int defStyle)
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
                          , R.styleable.base_button
                          , R.styleable.base_button_font);
    
  }
}
