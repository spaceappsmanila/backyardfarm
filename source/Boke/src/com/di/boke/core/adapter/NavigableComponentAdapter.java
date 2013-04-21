package com.di.boke.core.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.di.boke.R;

/**
 * This class is used to convert a list of <code>Navigable</code> object
 * and render it as a menu list items.
 * 
 * @since 2013-04-20
 * @author Dungeon Innovations
 *
 */
public
  class   NavigableComponentAdapter 
  extends ArrayAdapter<Navigable>
{
  private final List<Navigable> navigableInterfaces;
  private final OnClickListener onClickListener;
  private final Context         context;

  public NavigableComponentAdapter( Context context
                                    , int textViewResourceId
                                    , List<Navigable> navigableInterfaces
                                    , OnClickListener onClickListener)
  {
    super(context, textViewResourceId, navigableInterfaces);
    
    /*
     * add reference to the navigation menus 
     */
    this.context              = context;
    this.navigableInterfaces  = navigableInterfaces;
    this.onClickListener      = onClickListener;
  }
  
  @Override
  public View getView(int position
                      , View contentView
                      , ViewGroup parent)
  {
    View view = contentView;
    
    /*
     * create the view object in case the value is null
     */
    if (view == null)
    {
      LayoutInflater vi 
        = (LayoutInflater) context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      
      view = vi.inflate(R.layout.core_navigation_menu_layout, null);
    }
    
    /*
     * retrieve the Navigable item and bind it to the user interfaces
     */
    Navigable navigableItem = navigableInterfaces.get(position);
    
    if (navigableItem != null)
    {
      TextView navMenuTextView  
        = (TextView) view.findViewById(R.id.core_navigation_menu_layout_name_text);
      ImageView iconImageView   
        = (ImageView) view.findViewById(R.id.core_navigation_menu_layout_icon_image);
      
      if (navMenuTextView != null)
      {
        String header = navigableItem.getNavHeader();
        navMenuTextView.setText(header);
      }
      
      if (iconImageView != null && navigableItem.getNavIconId() != null)
      {
        Integer imageResourceId = navigableItem.getNavIconId();
        iconImageView.setImageResource(imageResourceId);
      }
      
      int systemId = navigableItem.getNavId().intValue();
      view.setId(systemId);
    }
    else
    {
      /*
       *  TODO
       *  render the page differently
       */
    }
    
    /*
     * bind the listener to the submitted onclick listener
     */
    view.setOnClickListener(onClickListener);
    
    return view;
  }
  
}
