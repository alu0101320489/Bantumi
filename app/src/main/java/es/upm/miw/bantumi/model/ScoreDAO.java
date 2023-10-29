package es.upm.miw.bantumi.model;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ScoreDAO {

    @Insert
    void insert(ScoreModel scoreModel);

    @Query("SELECT * FROM score")
    LiveData<List<ScoreModel>> getAllScores();

    @Query("SELECT playerName, store1 FROM score ORDER BY store1 DESC LIMIT 10")
    LiveData<List<BestScore>> getTop10Scores();

    @Delete
    void deleteAll(ScoreModel... scoreModels);
}