package com.example.darthvader.notifications;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by darthvader on 13/7/18.
 */

public class DatabaseAccess {
    DatabaseHelper helper;
    SQLiteDatabase database;
    private static DatabaseAccess instance;

    public DatabaseAccess(Context context)
    {
        this.helper = new DatabaseHelper(context);
    }

    public static DatabaseAccess getInstance(Context context) {
        if(instance == null)
        {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    public void  open()
    {
        this.database = helper.getWritableDatabase();
    }

    public void close()
    {
        if(database!=null)
        {
            this.database.close();
        }
    }

    public List<String> getTables()
    {
        List<String> tables = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT dbver from db_information",null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast())
        {
            tables.add(cursor.getString(0));
            cursor.moveToNext();
        }
        cursor.close();
        return tables;
    }
}
