package com.di.boke.core.adapter;

import java.util.Iterator;
import java.util.List;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import com.di.boke.R;

/**
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 *
 */
public
  class       ListableSpinnerAdapter
  implements  SpinnerAdapter
{
  private final List<? extends Listable>  listableInterfaces;
  private final Context                   context;
  
  public ListableSpinnerAdapter(Context context
                                , List<? extends Listable> listableInterfaces)
  {
    this.context            = context;
    this.listableInterfaces = listableInterfaces;
  }

  @Override
  public int getCount()
  {
    return listableInterfaces.size();
  }

  @Override
  public Object getItem(int position)
  {
    return listableInterfaces.get(position);
  }

  @Override
  public long getItemId(int position)
  {
    Listable listableItem = listableInterfaces.get(position);
    long itemId = 0L;
    if (listableItem.getId() != null)
    {
      itemId = listableItem.getId().longValue();
    }
    return itemId;
  }

  @Override
  public int getItemViewType(int position)
  {
    return R.layout.core_spinner_layout;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent)
  {
    View view = convertView;
    
    if (view == null)
    {
      LayoutInflater inflater 
        = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      
      view = inflater.inflate(R.layout.core_spinner_layout, null);
    }
    
    
    Listable listable = (Listable) getItem(position);
    
    if (listable != null)
    {
      TextView descriptionTextView 
        = (TextView) view.findViewById(R.id.core_spinner_description_text_view);
      
      String description = listable.getHeader();
      descriptionTextView.setText(description);
      
      view.setTag(listable);
    }
    
    return view;
  }

  @Override
  public int getViewTypeCount()
  {
    /*
     * view always return the same type.
     */
    return 1;
  }

  @Override
  public boolean hasStableIds()
  {
    /*
     * ID values is not always the same
     */
    return false;
  }

  @Override
  public boolean isEmpty()
  {
    return this.listableInterfaces.isEmpty();
  }

  @Override
  public void registerDataSetObserver(DataSetObserver observer)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void unregisterDataSetObserver(DataSetObserver observer)
  {
    // TODO Auto-generated method stub
    
  }

  @Override
  public View getDropDownView(int position
                              , View convertView
                              , ViewGroup parent)
  {
    View view = convertView;
    
    if (view == null)
    {
      LayoutInflater inflater 
        = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      
      view = inflater.inflate(R.layout.core_spinner_layout, null);
    }
    
    
    Listable listable = (Listable) getItem(position);
    
    if (listable != null)
    {
      TextView descriptionTextView 
        = (TextView) view.findViewById(R.id.core_spinner_description_text_view);
      
      String description = listable.getHeader();
      descriptionTextView.setText(description);
      
      view.setTag(listable);
    }
    
    return view;
  }
  
  public Listable getListableObject(Long id)
  {
    Listable listableObject = null;
    
    if (this.listableInterfaces != null && id != null)
    {
      Iterator<? extends Listable> listableIter = listableInterfaces.iterator();
      
      while (listableIter.hasNext())
      {
        Listable listable = listableIter.next();
        Long listableId = listable.getId();
        
        if (id.equals(listableId))
        {
          listableObject = listable;
          break;
        }
      }
    }
    
    return listableObject;
  }
  
  public int getListableObjectPosition(Long id)
  {
    Listable listableObject = getListableObject(id);
    int position = this.listableInterfaces.indexOf(listableObject);
    
    return position;
  }
}
