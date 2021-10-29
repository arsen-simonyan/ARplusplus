package com.example.test1.main.database;

import androidx.room.*;

import com.example.test1.main.main_data.Items;

import java.util.List;

@Dao
public interface ItemDao {

    @Insert
    void insertAll(Items... items);

    @Delete
    void delete(Items item);

    @Query("SELECT * FROM items")
    List<Items> getAllItems();
}