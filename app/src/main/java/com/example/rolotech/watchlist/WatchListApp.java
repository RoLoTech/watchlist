package com.example.rolotech.watchlist;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.example.rolotech.watchlist.persistence.AppDatabase;

import androidx.room.Room;

public class WatchListApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        WatchListApp.context = getApplicationContext();
        AppDatabase db = AppDatabase.getAppDatabase(getApplicationContext());
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    public static Context getAppContext() {
        return WatchListApp.context;
    }
}
