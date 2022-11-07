package com.example.myapplication.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Clothing.class},version =1,exportSchema = false)
public abstract class ClothingDatabase extends RoomDatabase {
    private static ClothingDatabase clothingDatabase;
    public static ClothingDatabase getClothingDatabase(Context context){
        if (clothingDatabase == null){
            clothingDatabase = Room.databaseBuilder(context,ClothingDatabase.class,"Clothing")
                    .allowMainThreadQueries()
                    .build();
        }
          return clothingDatabase;
    }
    public abstract ClothingDao getDao();
}
