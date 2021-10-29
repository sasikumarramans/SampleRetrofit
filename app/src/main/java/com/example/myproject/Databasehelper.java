package com.example.myproject;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class Databasehelper extends SQLiteOpenHelper {
    private static final String TABLE_NAME = "User ";
    private static final String COL1 = "ID";
    private static final String COL2 = "NAME";

    public Databasehelper(Context context) {
        super(context, "myproject", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createtable = "create table " + TABLE_NAME + "(id integer primary key," + " name text, phone text, email text)";
        db.execSQL(createtable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS User");
        onCreate(db);
    }


    public boolean insertContact (String name, String phone, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("phone", phone);
        contentValues.put("email", email);
        db.insert("User", null, contentValues);
        return true;
    }
    public boolean updateContact (Integer id, String name, String phone, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put("phone", phone);
        contentValues.put("email", email);
        db.update("User", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }
    public Integer deleteContact (Integer id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("User",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }

    @SuppressLint("Range")
    public ArrayList<UserModel> getAllUser() {
        ArrayList<UserModel> array_list = new ArrayList<UserModel>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from User", null );
        res.moveToFirst();

        while(!res.isAfterLast()){;
            Log.d("twsgsgsgs",res.getString(res.getColumnIndex("name")));
            UserModel userModel=new UserModel();
            userModel.setEmail(res.getString(res.getColumnIndex("email")));
            userModel.setName(res.getString(res.getColumnIndex("name")));
            userModel.setPhone_no(res.getString(res.getColumnIndex("phone")));


            array_list.add(userModel);
            res.moveToNext();
        }
        return array_list;
    }
}

