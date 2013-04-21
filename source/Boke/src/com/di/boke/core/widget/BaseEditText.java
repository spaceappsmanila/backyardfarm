package com.di.boke.core.widget;

import com.di.boke.R;
import com.di.boke.core.utility.UiUtil;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * 
 * @author Dungeon Innovations
 *
 */
public
  class   BaseEditText
  extends EditText
{
  public BaseEditText(Context context)
  {
    super(context);
  }
  
  public BaseEditText(Context context, AttributeSet attrs)
  {
    super(context, attrs);
    setAdditionalAttributes(context, attrs);
  }
  
  public BaseEditText(Context context, AttributeSet attrs, int defStyle)
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
                          , R.styleable.base_editText
                          , R.styleable.base_editText_font);
    
  }
}
