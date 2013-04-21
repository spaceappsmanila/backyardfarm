package com.di.boke.guide.activity;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.di.boke.R;
import com.di.boke.core.constants.IntentKeysEnum;
import com.di.boke.core.model.Fact;
import com.di.boke.core.model.Guide;
import com.di.boke.core.model.Topic;
import com.di.boke.guide.task.ViewGuideDetailLoadGuideTask;

public
  class   ViewGuideDetailActivity
  extends Activity
{
  private static final String TAG = ViewGuideDetailActivity.class.getName();
  
  private Guide   loadedGuide;
  private Integer currentTopicIndex;
  
  // user interface
  private Button previousButton;
  private Button nextButton;
  
  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.guide_view_guide_detail_activity);
    
    Log.d(TAG, "onCreate");

    Intent currentIntent = getIntent();
    long guideId = currentIntent.getLongExtra(
        IntentKeysEnum.GUIDE_SELECTED_ID.keyName(), 0L);
    System.out.println("Guide ID: " + guideId);

    new ViewGuideDetailLoadGuideTask(this).execute();
    
    /*
     * Button for viewing the previous topic
     */
    this.previousButton
      = (Button) findViewById(
          R.id.guide_view_guide_details_topic_navigation_previous_button);
    this.previousButton.setOnClickListener(new OnClickListener()
    {
      @Override
      public void onClick(View view)
      {
        List<Topic> topics
          = loadedGuide != null ? loadedGuide.getTopics() : null;
        if (topics != null)
        {
          loadPreviousTopic();
        }
      }
    });
    
    /*
     * Button for viewing the next topic
     */
    this.nextButton
      = (Button) findViewById(
          R.id.guide_view_guide_details_topic_navigation_next_button);
    this.nextButton.setOnClickListener(new OnClickListener()
    {
      
      @Override
      public void onClick(View v)
      {
        List<Topic> topics
          = loadedGuide != null ? loadedGuide.getTopics() : null;
        if (topics != null)
        {
          loadNextTopic();
        }
      }
    });
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu)
  {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.guide_view_guide_detail_activity, menu);
    return true;
  }
  
  @Override
  public void onBackPressed()
  {
    super.onBackPressed();
    
    Intent viewGuideListIntent = new Intent(this, ViewGuideViewsActivity.class);
    viewGuideListIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    startActivity(viewGuideListIntent);
  }

  public void loadTopic(Integer topicPosition)
  {
    List<Topic> topics = this.loadedGuide.getTopics();
    
    if (topics == null 
        || topicPosition < 0 
        || topicPosition + 1 > topics.size())
    {
      // no topic to display.
      return ;
    }
    this.currentTopicIndex = topicPosition;
    Topic topic = topics.get(topicPosition);

    /*
     * Section for the current topic
     */
    LinearLayout guideTopicLayout = (LinearLayout) getLayoutInflater().inflate(
        R.layout.guide_view_guide_detail_topic_layout, null);

    TextView topicHeaderText = (TextView) guideTopicLayout
        .findViewById(R.id.guide_view_guide_details_topic_header_value);
    topicHeaderText.setText(topic.getHeader());

    LinearLayout factsLayout
      = (LinearLayout) guideTopicLayout
        .findViewById(R.id.guide_view_guide_details_topic_fact_list);
    factsLayout.removeAllViews();
    
    List<Fact> facts = topic.getFacts();
    if (facts != null && facts.isEmpty() == false)
    {
      for (Fact fact : facts)
      {
        String message    = fact.getMessageBody();
        String reference  = fact.getReferenceUrl();
        String imageUrl   = fact.getImageUrl();
        
        LinearLayout factLayout
        = (LinearLayout) getLayoutInflater()
          .inflate(R.layout.guide_view_guide_detail_fact_layout, null);
        
        if (TextUtils.isEmpty(message) == false)
        {
          TextView messageTextView
            = (TextView) factLayout
              .findViewById(R.id.guide_view_guide_detail_fact_message_value);
          messageTextView.setText(message);
          
          // makes the text view visible
          messageTextView.setVisibility(View.VISIBLE);
        }
        
        if (TextUtils.isEmpty(reference) == false)
        {
          TextView referenceUrlTextView
            = (TextView) factLayout
              .findViewById(R.id.guide_view_guide_detail_fact_refernce_url_value);
          referenceUrlTextView.setText(reference);
          
          // makes the text view visible
          referenceUrlTextView.setVisibility(View.VISIBLE);
        }
        
        if (TextUtils.isEmpty(imageUrl) == false)
        {
          TextView imageUrlTextView
            = (TextView) factLayout
              .findViewById(R.id.guide_view_guide_detail_fact_image_url_value);
          imageUrlTextView.setText(imageUrl);
          
          // makes the text view visible
          imageUrlTextView.setVisibility(View.VISIBLE);
        }
        
        factsLayout.addView(factLayout);
      }
    }

    
    LinearLayout topicSection = (LinearLayout) findViewById(R.id.guide_view_guide_detail_topic);
    topicSection.removeAllViews();
    topicSection.addView(guideTopicLayout);
  }

  public void loadPreviousTopic()
  {
    List<Topic> topics = this.loadedGuide.getTopics();
    
    int topicCount = topics != null ? topics.size() : 0;

    if (topicCount != 0 && this.currentTopicIndex.intValue() > 0)
    {
      Integer previousTopicPosition = Integer.valueOf(this.currentTopicIndex
          .intValue() - 1);
      loadTopic(previousTopicPosition);
    }
  }

  public void loadNextTopic()
  {
    List<Topic> topics = this.loadedGuide.getTopics();

    int topicCount = topics != null ? topics.size() : 0;

    if (topicCount != 0 && this.currentTopicIndex.intValue() <= topicCount)
    {
      Integer nextTopicPosition = Integer.valueOf(this.currentTopicIndex
          .intValue() + 1);

      loadTopic(nextTopicPosition);
    }
  }

  public Guide getLoadedGuide()
  {
    return loadedGuide;
  }

  public void setLoadedGuide(Guide loadedGuide)
  {
    this.loadedGuide = loadedGuide;
  }
}
