package com.di.boke.core.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.di.boke.R;

/**
 *
 * @since 2013-04-21
 * @author Dungeon Innovations
 */
public 
  class   GenericListViewAdapter 
  extends ArrayAdapter<Listable>
{
  private final List<? extends Listable>  listableElements;
  private final OnClickListener onClickListener;
  private final Context         context;
  
  public GenericListViewAdapter( Context context
                                , int textViewResourceId
                                , List<? extends Listable> listableElements
                                , OnClickListener onClickListener)
  {
    super(context, textViewResourceId);
    
    
    /*
     * initialize fields
     */
    this.context          = context;
    this.listableElements = listableElements;
    this.onClickListener  = onClickListener;
  }
  
  @Override
  public View getView(int position
                      , View contentView
                      , ViewGroup parent)
  {
    View view = contentView;
    
    if (view == null)
    {
      LayoutInflater vi
        = (LayoutInflater) context
          .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      view = vi.inflate(R.layout.core_generic_list_layout, null);
    }
    
    /*
     * retrieve the corresponding Listable element and bind it to the user interface
     */
    Listable listableElement = listableElements.get(position);
    
    if (listableElement != null)
    {
      TextView headerTextView
        = (TextView) view.findViewById(R.id.core_generic_list_layout_name_text);
      
      if (headerTextView != null)
      {
        String guideName = listableElement.getHeader();
        headerTextView.setText(guideName);
      }
      
      
      view.setTag(listableElement);
    }
    else
    {
      /*
       * TODO
       * render the page differently as there is no Listable element
       */
    }
    
    view.setOnClickListener(onClickListener);
    
    return view;
  }
}

