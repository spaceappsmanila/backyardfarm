package com.di.boke.owner.task;

import java.util.List;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.di.boke.R;
import com.di.boke.core.model.Contact;
import com.di.boke.core.model.ContactType;
import com.di.boke.core.model.Owner;
import com.di.boke.core.sampledata.OwnerDataFactory;
import com.di.boke.owner.activity.ViewOwnerDetailsActivity;

/**
 *
 * @since 2013-04-22
 * @author Dungeon Innovations
 */
public
  class   ViewOwnerDetailsLoadTask
  extends AsyncTask<Void, Void, Owner>
{
  private static final String TAG = ViewOwnerDetailsLoadTask.class.getName();
  
  private final ViewOwnerDetailsActivity activityContext;
  
  public ViewOwnerDetailsLoadTask(ViewOwnerDetailsActivity activityContext)
  {
    this.activityContext = activityContext;
  }

  @Override
  protected Owner doInBackground(Void... params)
  {
    Log.d(TAG, "doInBackground");
    /*
     * TODO
     * 
     * Call a Service Object for retrieving the data from a 
     * Web Service call.
     */
    Owner owner = OwnerDataFactory.getOwner();
    
    return owner;
  }
  
  @Override
  public void onPostExecute(Owner owner)
  {
    super.onPostExecute(owner);
    
    loadOwnerOnUi(owner);
  }

  private void loadOwnerOnUi(Owner owner)
  {
    // owner name
    TextView ownerNameTextView
      = (TextView) this.activityContext
        .findViewById(R.id.owner_view_owner_details_name_value);
    ownerNameTextView.setText(owner.getFullName());
    
    // owner address
    TextView addressTextView
      = (TextView) this.activityContext
        .findViewById(R.id.owner_view_owner_details_address_value);
    addressTextView.setText("49 Annapolis St. Greenhills San Juan City NCR PH"); // TODO
    
    // contacts
    List<Contact> contacts = owner.getContacts();
    
    if (contacts != null && contacts.size() > 0)
    {
      LinearLayout contactSection
        = (LinearLayout) this.activityContext
          .findViewById(R.id.owner_view_owner_details_contacts_section);
      contactSection.removeAllViews();
      
      for (Contact contact : contacts)
      {
        /*
         * Layout for a specific contact
         */
        LinearLayout contactLayout
          = (LinearLayout) this.activityContext
            .getLayoutInflater().inflate(R.layout.core_contact_layout, null);
        
        /*
         * Contact type (TextView)
         */
        TextView contactTypeTextView
          = (TextView) contactLayout.findViewById(R.id.core_contact_type_value);
        ContactType contactType = contact.getType();
        contactTypeTextView.setText(contactType.getName());
        
        /*
         * Contact Value (TextView)
         */
        TextView contactValueTextView
          = (TextView) contactLayout.findViewById(R.id.core_contact_value_value);
        contactValueTextView.setText(contact.getValue());
        
        contactSection.addView(contactLayout);
      }
    }
    
  }
}
