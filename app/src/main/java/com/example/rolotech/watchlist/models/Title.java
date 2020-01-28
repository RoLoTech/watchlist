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

    public Title(String name, String year, String type) {
        this.name = name;
        this.year = year;
        this.type = type;
    }


    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}