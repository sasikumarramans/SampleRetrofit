package com.example.myproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter extends BaseAdapter {
    ArrayList<UserModel> userList=new ArrayList<>();
    LayoutInflater inflter;

    public UserAdapter(Context applicationContext, ArrayList<UserModel> countryList) {
        this.userList = countryList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.user_adapter, null);
        TextView nameText = (TextView) view.findViewById(R.id.nameText);
        nameText.setText(userList.get(i).getName());

        TextView idText = (TextView) view.findViewById(R.id.idText);
        nameText.setText(userList.get(i).getName());

        TextView emailText = (TextView) view.findViewById(R.id.emailText);
        nameText.setText(userList.get(i).getName());

        TextView phoneText = (TextView) view.findViewById(R.id.phoneText);
        nameText.setText(userList.get(i).getName());
        return view;
    }
}
