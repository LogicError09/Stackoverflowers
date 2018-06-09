package com.leentantu.stackoverflowers.database;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.leentantu.stackoverflowers.model.StackoverflowUser;

@Database(entities = {StackoverflowUser.class}, version = 1)
public abstract class StackofUserRoomDatabase extends RoomDatabase {

        public abstract StackoverflowUserDao stackoverflowUserDAO();

        private static StackofUserRoomDatabase INSTANCE;

        public static StackofUserRoomDatabase getDatabase(final Context context) {
            if (INSTANCE == null) {
                synchronized (StackofUserRoomDatabase.class) {
                    if (INSTANCE == null) {
                        // Create database here
                        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                StackofUserRoomDatabase.class, "stackoverflowuser_database")
                                .addCallback(sRoomDatabaseCallback)
                                .build();
                    }
                }
            }
            return INSTANCE;
        }
        private static RoomDatabase.Callback sRoomDatabaseCallback =
                new RoomDatabase.Callback(){

                    @Override
                    public void onOpen (@NonNull SupportSQLiteDatabase db){
                        super.onOpen(db);
                        new PopulateDbAsync(INSTANCE).execute();
                    }
                };

        private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

            private final StackoverflowUserDao mDao;

            PopulateDbAsync(StackofUserRoomDatabase db) {
                mDao = db.stackoverflowUserDAO();
            }

            @Override
            protected Void doInBackground(final Void... params) {
                mDao.deleteAll();
                StackoverflowUser stackoverflowUser = new StackoverflowUser("John Doe", "New York City, NY", "www.google.com");
                mDao.insert(stackoverflowUser);
                StackoverflowUser stackoverflowUser2 = new StackoverflowUser("Dave Jenkins", "Los Angeles", "www.got.com");
                mDao.insert(stackoverflowUser2);
                return null;
            }
        }
}
