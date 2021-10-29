package com.example.myproject;

import com.google.gson.annotations.SerializedName;

public class MarvelObj {
    @SerializedName("localized_name")
    private String Name;

    public String getName() {
        return Name;
    }
}
