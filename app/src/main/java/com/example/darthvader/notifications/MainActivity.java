package com.example.darthvader.notifications;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseAccess access = DatabaseAccess.getInstance(this);
        access.open();
        List<String> tables = access.getTables();
        access.close();

        for (String e:tables)
        {
            Log.i("Strings",e);
        }
    }
}
