package com.di.boke.pasture.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.di.boke.R;
import com.di.boke.core.model.Pasture;

/**
 * 
 * @since 2013-04-21
 * @author Dungeon Innovations
 *
 */
public 
  class   PasturesAdapter
  extends ArrayAdapter<Pasture>
{
  private final List<Pasture>       pastureList;
  private final OnClickListener     onClickListener;
  private final OnLongClickListener onLongClickListener;
  private final Context             context;
  
  public PasturesAdapter( Context context
                                , int textViewResourceId
                                , List<Pasture> pastureList
                                , OnClickListener onClickListener
                                , OnLongClickListener onLongClickListener)
  {
    super(context, textViewResourceId, pastureList);
    
    /*
     * initialize fields
     */
    this.context              = context;
    this.pastureList          = pastureList;
    this.onClickListener      = onClickListener;
    this.onLongClickListener  = onLongClickListener;
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
      view = vi.inflate(R.layout.pasture_pasture_list_layout, null);
    }
    
    /*
     * retrieve the corresponding Asset and bind it to the user interface
     */
    Pasture pasture = pastureList.get(position);
    
    if (pasture != null)
    {
      TextView pastureNameTextView
        = (TextView) view.findViewById(R.id.pasture_pasture_list_layout_name_value);
      TextView pastureAreaTextView
        = (TextView) view.findViewById(R.id.pasture_pasture_list_layout_land_area_value);
      ImageView iconImageView
        = (ImageView) view.findViewById(R.id.pasture_pasture_list_layout_icon_image);
      
      iconImageView.setImageResource(R.drawable.pasture_sample);
      
      if (pastureNameTextView != null)
      {
        String pastureName = pasture.getName();
        pastureNameTextView.setText(pastureName);
      }
      
      if (pastureAreaTextView != null)
      {
        Double landArea = pasture.getLandArea();
        pastureAreaTextView.setText(landArea.toString());
      }
      
      
      view.setTag(pasture);
    }
    else
    {
      /*
       * TODO
       * render the page differently as there is no Asset
       */
    }
    
    view.setOnClickListener(onClickListener);
    view.setOnLongClickListener(onLongClickListener);
    
    return view;
  }
}
