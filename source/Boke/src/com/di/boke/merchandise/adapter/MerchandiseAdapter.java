package com.di.boke.merchandise.adapter;

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
import com.di.boke.core.model.Merchandise;

/**
 * 
 * @since 2013-04-21
 * @author Dungeon Innovations
 *
 */
public 
  class   MerchandiseAdapter
  extends ArrayAdapter<Merchandise>
{
  private final List<Merchandise> merchandiseList;
  private final OnClickListener   onClickListener;
  private final Context           context;
  
  public MerchandiseAdapter(Context context
                            , int textViewResourceId
                            , List<Merchandise> merchandiseList
                            , OnClickListener onClickListener)
  {
    super(context, textViewResourceId, merchandiseList);
    
    /*
     * initialize fields
     */
    this.context          = context;
    this.merchandiseList  = merchandiseList;
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
      view = vi.inflate(R.layout.merchandise_merchandise_list_layout, null);
    }
    
    /*
     * retrieve the corresponding Merchandise and bind it to the user interface
     */
    Merchandise Merchandise = merchandiseList.get(position);
    
    if (Merchandise != null)
    {
      TextView merchandiseNameTextView
        = (TextView) view.findViewById(R.id.merchandise_merchandise_list_layout_name_text);
      ImageView iconImageView
        = (ImageView) view.findViewById(R.id.merchandise_merchandise_list_layout_icon_image);
      
      if (merchandiseNameTextView != null)
      {
        String merchandiseName = Merchandise.getGoodType().getName();
        merchandiseNameTextView.setText(merchandiseName);
      }
      
      view.setTag(Merchandise);
    }
    else
    {
      /*
       * TODO
       * render the page differently as there is no Asset
       */
    }
    
    view.setOnClickListener(onClickListener);
    
    return view;
  }
}
