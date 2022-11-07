package com.example.myapplication.data;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

public interface ClothingDao {
    @Query("SELECT * FROM clothing WHERE clothingTypeId = :id")
    void QuerytypeId(Long id);
    @Query("SELECT * FROM clothing")
    void Queryclothing();
    @Insert()
    void insertClothing(Clothing clothing);

    @Update
   void updateClothing(Clothing clothing);

    @Delete
    void deleteClothing(Clothing clothing);
}
