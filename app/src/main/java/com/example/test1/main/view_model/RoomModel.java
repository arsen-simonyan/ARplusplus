package com.example.test1.main.view_model;

import android.content.Context;

import androidx.room.Room;

import com.example.test1.main.database.AppDatabase;
import com.example.test1.main.main_data.Items;

import java.util.List;

public class RoomModel {

    private static RoomModel mInstance;

    AppDatabase db;

    private RoomModel() {
    }

    public static RoomModel getInstance() {
        if (mInstance == null) {
            mInstance = new RoomModel();

        }
        return mInstance;
    }

    public List<Items> getOfflineNews()
    {
        return db.getItemsDao().getAllItems();
    }

    public RoomModel setContext(Context context) {
        db = Room.databaseBuilder(context,
                AppDatabase.class, "items_database").allowMainThreadQueries().build();
        return mInstance;
    }
}
