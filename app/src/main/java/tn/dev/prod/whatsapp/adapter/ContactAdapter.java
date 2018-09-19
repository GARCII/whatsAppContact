package tn.dev.prod.whatsapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import tn.dev.prod.whatsapp.R;
import tn.dev.prod.whatsapp.entity.Contact;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactHolder> {


    private Context context;
    private List<Contact> contacts;

    public ContactAdapter(Context context, List<Contact> contacts) {
        this.context = context;
        this.contacts = contacts;
    }


    @Override
    public ContactHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_contact, parent, false);

        return new ContactHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final ContactHolder holder, int position) {


        Contact contact = contacts.get(position);
        holder.name.setText(contact.getName());
        holder.number.setText(contact.getNumber());

    }


    @Override
    public int getItemCount() {
        return contacts.size();
    }



    public  class ContactHolder extends RecyclerView.ViewHolder {


        TextView name, number;
        public ContactHolder(View view) {
            super(view);

            name =  view.findViewById(R.id.name);
            number =  view.findViewById(R.id.number);


        }
    }


}
