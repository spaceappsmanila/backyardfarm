package com.di.boke.core.widget;

import java.util.Calendar;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.os.Bundle;
import android.util.Log;

/**
 *
 * @since 2013-04-20
 * @author John Francis P. De Leon
 * @author Dungeon Innovations
 */
public
  class   TimePickerFragment
  extends DialogFragment
{
  //for debugging purpose
  private static final String TAG = TimePickerFragment.class.getName();
  
  private final OnTimeSetListener onTimeSetListener;
  private final Boolean           is24HourFormat;
  
  /**
   * Constructor that sets the default 24-hour format to FALSE.
   * @param onTimeSetListener
   */
  public TimePickerFragment(OnTimeSetListener onTimeSetListener)
  {
    super();
    this.onTimeSetListener  = onTimeSetListener;
    this.is24HourFormat     = Boolean.TRUE;
  }
  
  /**
   * 
   * @param onTimeSetListener
   * @param is24HourFormat
   */
  public TimePickerFragment(OnTimeSetListener onTimeSetListener
                            , Boolean is24HourFormat)
  {
    super();
    this.onTimeSetListener  = onTimeSetListener;
    this.is24HourFormat     = is24HourFormat;
  }
  
  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState)
  {
    Log.d(TAG, "onCreateDialog");
    
    final Calendar calendar = Calendar.getInstance();
    int hourOfDay           = calendar.get(Calendar.HOUR_OF_DAY);
    int minute              = calendar.get(Calendar.MINUTE);
    
    return new TimePickerDialog(getActivity()
                                , onTimeSetListener
                                , hourOfDay
                                , minute
                                , is24HourFormat);
  }
}
