package com.example.rolotech.watchlist.persistence;

import com.example.rolotech.watchlist.models.Title;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by RoLoTech on 27/01/2020.
 */

@Database(entities = {Title.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TitleDao titleDao();
}