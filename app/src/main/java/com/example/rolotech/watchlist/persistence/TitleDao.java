package com.example.rolotech.watchlist.persistence;

import com.example.rolotech.watchlist.models.Title;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

/**
 * Created by RoLoTech on 27/01/2020.
 */

@Dao
public interface TitleDao {
    @Query("SELECT * FROM title")
    List<Title> getAll();

    @Query("SELECT * FROM title WHERE tid IN (:titleIds)")
    List<Title> loadAllByIds(int[] titleIds);

    @Query("SELECT * FROM title WHERE name LIKE :titleName LIMIT 1")
    Title findByName(String titleName);

    @Insert
    void insertAll(Title... titles);

    @Delete
    void delete(Title title);

}
