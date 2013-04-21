package com.di.boke.core.utility;

import java.lang.ref.SoftReference;
import java.util.Hashtable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 
 * @author Dungeon Innovations
 *
 */
public class UiUtil
{
  public static final String TAG = "UiUtil";
  
  private static final String APP_DEFAULT_FONT = "Eurostile.TTF";

  public static void setCustomFont( View view
                                    , Context context
                                    , AttributeSet attrs
                                    , int[] attributeSet
                                    , int fontId)
  {
    TypedArray a = context.obtainStyledAttributes(attrs, attributeSet);
    String customFont = a.getString(fontId);
    setCustomFont(view, context, customFont);
    a.recycle();
  }

  private static boolean setCustomFont( View view
                                        , Context ctx
                                        , String asset)
  {
    String font = asset;
    /*
     * If the font is empty, use the default application font.
     */
    if (TextUtils.isEmpty(asset))
    {
      font = APP_DEFAULT_FONT;
    }
    
    Typeface tf = null;
    try
    {
      tf = getFont(ctx, font);
      if (view instanceof TextView)
      {
        ((TextView) view).setTypeface(tf);
      }
      else if (view instanceof EditText)
      {
        ((EditText) view).setTypeface(tf); 
      }
      else if (view instanceof Button)
      {
        ((Button) view).setTypeface(tf);
      }
    }
    catch (Exception e)
    {
      Log.e(TAG, "Could not get typeface: " + asset, e);
      return false;
    }

    return true;
  }

  private static final Hashtable<String, SoftReference<Typeface>> fontCache
    = new Hashtable<String, SoftReference<Typeface>>();

  public static Typeface getFont(Context c, String name)
  {
    synchronized (fontCache)
    {
      if (fontCache.get(name) != null)
      {
        SoftReference<Typeface> ref = fontCache.get(name);
        if (ref.get() != null)
        {
          return ref.get();
        }
      }

      Typeface typeface = Typeface.createFromAsset( c.getAssets()
                                                    , "fonts/" + name);
      fontCache.put(name, new SoftReference<Typeface>(typeface));

      return typeface;
    }
  }
}
