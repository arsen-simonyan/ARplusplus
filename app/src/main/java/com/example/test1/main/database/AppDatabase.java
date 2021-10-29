package com.example.test1.main.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.test1.main.main_data.Items;

@Database(entities = {Items.class }, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ItemDao getItemsDao();
}