package com.example.rolotech.watchlist.models;

/**
 * Created by RoLoTech on 26/01/2020.
 */

public class Title {
    private String name;
    private String year;
    private String type;

    public Title(String name, String year, String type) {
        this.name = name;
        this.year = year;
        this.type = type;
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
