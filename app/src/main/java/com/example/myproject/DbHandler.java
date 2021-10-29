package com.example.myproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DbHandler extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "MyDbName.db";
    public static final String TABLE_NAME = "users";
    public static final String USER_ID = "id";
    public static final String USER_NAME = "name";
    public static final String USER_EMAIL = "email";
    public static final int DB_VERSION=1;


    public DbHandler(Context context) {
        super(context, DATABASE_NAME , null,DB_VERSION );
    }
private static final String create_DB_query="CREATE TABLE "+TABLE_NAME+"("+USER_ID+
        "INTEGER PRIMARY KEY AUTOINCREMENT," +USER_ID+ "TEXT NOT NULL,"+USER_EMAIL+");";
    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL(create_DB_query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
db.execSQL("DROP TABLE IF EXISTS  "+TABLE_NAME);
    }

}
