package com.leentantu.stackoverflowers.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.leentantu.stackoverflowers.model.StackoverflowUser;

import java.util.List;

@Dao
public interface StackoverflowUserDao {

        @Insert
        void insert(StackoverflowUser stackoverflowUser);

        @Query("DELETE FROM stackoverflow_user")
        void deleteAll();

        @Query("SELECT * from stackoverflow_user ORDER BY userName ASC")
        LiveData<List<StackoverflowUser>> getAllStackoverflowUsers();

}
