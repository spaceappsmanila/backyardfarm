package com.di.boke.core.widget;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.util.Log;

/**
 * This DialogFragment generates a dialog that allows input 
 * of the Year, Month and Day from the user.
 * 
 * Default date is the current date of the application/system.
 * 
 * @since 2013-03-20
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 *
 */
public
  class       DatePickerFragment
  extends     DialogFragment
{
  private final OnDateSetListener onDateSetListener;
  
  // for debugging purpose
  private static final String TAG = DatePickerFragment.class.getName();
  
  public DatePickerFragment(OnDateSetListener onDateSetListener)
  {
    super();
    this.onDateSetListener = onDateSetListener;
  }
  
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState)
  {
    Log.d(TAG, "onCreateDialog");
    
    final Calendar calendar = Calendar.getInstance();
    int year                = calendar.get(Calendar.YEAR);
    int month               = calendar.get(Calendar.MONTH);
    int day                 = calendar.get(Calendar.DAY_OF_MONTH);
    
    return new DatePickerDialog(getActivity()
                                , onDateSetListener
                                , year
                                , month
                                , day);
  }
}
