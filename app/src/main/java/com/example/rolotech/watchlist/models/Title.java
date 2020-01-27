package com.example.rolotech.watchlist.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by RoLoTech on 26/01/2020.
 */

@Entity
public class Title {
    @PrimaryKey
    public int tid;

    @ColumnInfo(name = "name")
    public String name;

    @ColumnInfo(name = "year")
    public String year;

    @ColumnInfo(name = "type")
    public String type;
}