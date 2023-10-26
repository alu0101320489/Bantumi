package es.upm.miw.bantumi.model;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import android.content.Context;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import es.upm.miw.bantumi.DateTypeConverter;

@Database(entities = {ScoreModel.class}, version = 1, exportSchema = false)
@TypeConverters({DateTypeConverter.class})
public abstract class ScoreRoomDatabase extends RoomDatabase {
    public static final String DATABASE_NAME = "score_database";

    public abstract ScoreDAO scoreDao();

    private static volatile ScoreRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    static ScoreRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (ScoreRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    ScoreRoomDatabase.class, DATABASE_NAME)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}

