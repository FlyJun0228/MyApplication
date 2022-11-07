package com.example.myapplication.data;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@androidx.room.Dao
public interface ClothingDao {
    @Query("SELECT * FROM clothing WHERE clothingTypeId = :id")
    List<Clothing> QuerytypeId(Long id);
    @Query("SELECT * FROM clothing")
    List<Clothing> Queryclothing();
    @Insert()
    void insertClothing(Clothing clothing);

    @Update
   void updateClothing(Clothing clothing);

    @Delete
    void deleteClothing(Clothing clothing);
}
