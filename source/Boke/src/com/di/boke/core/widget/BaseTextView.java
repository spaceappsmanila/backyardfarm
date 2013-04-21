package com.di.boke.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.di.boke.R;
import com.di.boke.core.utility.UiUtil;

/**
 * 
 * @author Dungeon Innovations
 *
 */
public
  class   BaseTextView
  extends TextView
{

  public BaseTextView(Context context)
  {
    super(context);
  }
  
  public BaseTextView(Context context, AttributeSet attrs)
  {
    super(context, attrs);
    setAdditionalAttributes(context, attrs);
  }
  
  public BaseTextView(Context context, AttributeSet attrs, int defStyle)
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
                          , R.styleable.base_textView
                          , R.styleable.base_textView_font);
    
  }
}
