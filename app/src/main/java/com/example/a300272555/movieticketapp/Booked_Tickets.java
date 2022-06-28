package com.example.a300272555.movieticketapp;

import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.ListView;
import android.widget.TextView;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booked_Tickets extends AppCompatActivity {
    SQLiteDatabase wdb;
    final String selectQuery = "select * from MovieDetails,USER ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        wdb = databaseMovieDetailsClass.getWritable(this);
        setContentView(R.layout.booked_movies);
        Cursor cursor = wdb.rawQuery(selectQuery, null);

        TextView text1 = (TextView) findViewById(R.id.textView7);

                if (cursor.moveToFirst()) {

                    text1.setText(cursor.getString(cursor.getColumnIndex("MovieName")));
                    text1.append(" \t ");
                    text1.append(cursor.getString(cursor.getColumnIndex("BookedSeatNo")));
                    text1.append(" \n ");
                    for(int j=0;j<cursor.getCount();j++) {
                        Log.i("Booked_Tickets", "test");
                        if (cursor.moveToNext()) {
                            text1.append((cursor.getString(cursor.getColumnIndex("MovieName"))));
                            text1.append(" \t ");
                            text1.append(cursor.getString(cursor.getColumnIndex("BookedSeatNo")));
                            text1.append(" \t ");
                            text1.append(cursor.getString(cursor.getColumnIndex("UserName")));
                            text1.append(" \n ");
                        }
                    }
                }else if(cursor.moveToNext()){
                    if (cursor.moveToNext()) {
                        text1.append((cursor.getString(cursor.getColumnIndex("MovieName"))));
                        text1.append(" \t ");
                        text1.append(cursor.getString(cursor.getColumnIndex("BookedSeatNo")));
                        text1.append(" \t ");
                        text1.append(cursor.getString(cursor.getColumnIndex("UserName")));
                        text1.append(" \n ");
                    }

                }
                else {
                    text1.setText("No Entries");
                }

        cursor.close();
    }
}




