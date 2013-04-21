package com.di.boke.guide.adapter;

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
import com.di.boke.core.model.Guide;

/**
 * This class is used to convert a list of <code>Asset</code> objects
 * and render it as a list of items.
 * 
 * @author Dungeon Innovations
 *
 */
public 
  class   GuidesAdapter
  extends ArrayAdapter<Guide>
{
  private final List<Guide>     guideList;
  private final OnClickListener onClickListener;
  private final Context         context;
  
  public GuidesAdapter( Context context
                                , int textViewResourceId
                                , List<Guide> guideList
                                , OnClickListener onClickListener)
  {
    super(context, textViewResourceId, guideList);
    
    /*
     * initialize fields
     */
    this.context          = context;
    this.guideList        = guideList;
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
      view = vi.inflate(R.layout.guide_guide_list_layout, null);
    }
    
    /*
     * retrieve the corresponding Asset and bind it to the user interface
     */
    Guide guide = guideList.get(position);
    
    if (guide != null)
    {
      TextView guideNameTextView
        = (TextView) view.findViewById(R.id.guide_guide_list_layout_name_text);
      ImageView iconImageView
        = (ImageView) view.findViewById(R.id.guide_guide_list_layout_icon_image);
      
      if (guideNameTextView != null)
      {
        String guideName = guide.getName();
        guideNameTextView.setText(guideName);
      }
      
      
      view.setTag(guide);
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
