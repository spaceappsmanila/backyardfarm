package com.di.boke.guide.widget;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 *
 * @since 2013-04-20
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public 
  class   TipDialogFragment
  extends DialogFragment
{
  private static final String HELPFUL_TIP = "This is helpful.";
  private static final String FINE_TIP    = "Fine.";
  
  private final String tip;
  private final String title;
  
  public TipDialogFragment(String title, String tip)
  {
    super();
    this.title  = title;
    this.tip    = tip;
    
  }
  
  @Override
  public Dialog onCreateDialog(Bundle savedInstance)
  {
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    builder.setMessage(tip);
    builder.setTitle(title);
    builder.setPositiveButton(HELPFUL_TIP, new DialogInterface.OnClickListener()
    {
      @Override
      public void onClick(DialogInterface dialog, int which)
      {
        /*
         * TODO
         * Process that this tip was helpful.
         */
      }
    });
    builder.setNegativeButton(FINE_TIP, new DialogInterface.OnClickListener()
    {
      
      @Override
      public void onClick(DialogInterface dialog, int which)
      {
        /*
         * TODO
         * Process that this tip was just fine.
         */
      }
    });
    
    return builder.create();
  }
}
