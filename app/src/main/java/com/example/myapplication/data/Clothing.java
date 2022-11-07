package com.example.myapplication.data;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Clothing {
    @PrimaryKey(autoGenerate = true)
    private long clothingId;
    private String name;
    private String color;
    private long clothingTypeId;
    private Boolean isDirty;
    private Boolean inWash;
    private String imageUri;

    public Clothing(Long clothingId,String name,String color,Long clothingTypeId,Boolean isDirty,Boolean inWash,String imageUri){
        this.clothingId = clothingId;
        this.name = name;
        this.color = color;
        this.clothingTypeId = clothingTypeId;
        this.isDirty = isDirty;
        this.inWash = inWash;
        this.imageUri = imageUri;
    }
    public long getClothingId() {
        return clothingId;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public Boolean getInWash() {
        return inWash;
    }

    public Long getClothingTypeId() {
        return clothingTypeId;
    }

    public String getColor() {
        return color;
    }

    public void setClothingId(long clothingId) {
        this.clothingId = clothingId;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getName() {
        return name;
    }

    public void setClothingTypeId(Long clothingTypeId) {
        this.clothingTypeId = clothingTypeId;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public void setInWash(Boolean inWash) {
        this.inWash = inWash;
    }

    public void setName(String name) {
        this.name = name;
    }
}
