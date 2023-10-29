package es.upm.miw.bantumi.model;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;

public class ScoreRepository {
    private ScoreDAO mScoreDao;
    private LiveData<List<ScoreModel>> mAllScores;

    ScoreRepository(Application application) {
        ScoreRoomDatabase db = ScoreRoomDatabase.getDatabase(application);
        mScoreDao = db.scoreDao();
        mAllScores = mScoreDao.getAllScores();
    }

    LiveData<List<ScoreModel>> getAllScores() {
        return mAllScores;
    }

    void insert(ScoreModel scoreModel) {
        ScoreRoomDatabase.databaseWriteExecutor.execute(() -> {
            mScoreDao.insert(scoreModel);
        });
    }

    LiveData<List<BestScore>> getTop10Scores() {
        return mScoreDao.getTop10Scores();
    }
}

