package com.example.darthvader.notifications;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;


public class DatabaseHelper extends SQLiteAssetHelper {
    public static  String DB_NAME = "trainsDB.sqlite3";

    public DatabaseHelper(Context context) {
        super(context, DB_NAME,null,2);
    }

//    private boolean checkDatabase()
//    {
//        SQLiteDatabase checkDB = null;
//        try
//        {
//            String path = DB_PATH+DB_NAME;
//            Log.i("Hello",path);
//            checkDB = SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READONLY);
//
//        }catch (SQLiteException e)
//        {
//
//        }
//        if(checkDB !=null)
//        {
//            Log.i("Hello1","True");
//            checkDB.close();
//        }
//
//        return checkDB!=null?true:false;
//
//    }
//
//    private void copyDatabase() throws IOException
//    {
//        InputStream in = mContext.getAssets().open(DB_NAME);
//
//        Log.i("Input", String.valueOf(in.read()));
//
//        String outFileName=DB_PATH+DB_NAME;
//
//        OutputStream outputStream = new FileOutputStream(outFileName);
//        byte[] bytes = new byte[1024];
//
//        int length;
//
//        while ((length = in.read(bytes))>0)
//        {
//            outputStream.write(bytes,0,length);
//            Log.i("Ok","Ok");
//        }
//
//        Log.i("Data",outputStream.toString());
//
//        outputStream.flush();
//        outputStream.close();
//        in.close();
//    }
//
//    public void openDatabase() throws SQLiteException
//    {
//        String path = DB_PATH+DB_NAME;
//        database = SQLiteDatabase.openDatabase(path,null,SQLiteDatabase.OPEN_READONLY);
//    }
//
//    @Override
//    public synchronized void close() {
//        if(database!=null)
//        {
//            database.close();
//        }
//        super.close();
//    }
//
//    public void createDatabase() throws IOException
//    {
//        boolean dbExist = checkDatabase();
//        SQLiteDatabase data_read=null;
//
//        if(dbExist)
//        {
//            Log.i("Copied1","Copied1");
//
//        }
//
//        else
//        {
//            data_read=this.getReadableDatabase();
//            data_read.close();
//            try {
//                Log.i("Copied","Copied");
//                    copyDatabase();
//            }catch (IOException e)
//            {
//                throw new Error("Error while copying");
//            }
//
//        }
//    }
//
//    @Override
//    public SQLiteDatabase getReadableDatabase() {
//        return super.getReadableDatabase();
//    }

}
