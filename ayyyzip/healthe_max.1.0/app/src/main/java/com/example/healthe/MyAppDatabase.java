package com.example.healthe;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {User.class},version = 1,exportSchema = false)
public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao MyDao();


}
