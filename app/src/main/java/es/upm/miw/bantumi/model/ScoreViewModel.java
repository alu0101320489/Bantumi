package es.upm.miw.bantumi.model;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ScoreViewModel extends AndroidViewModel {

    private ScoreRepository scoreRepository;

    private final LiveData<List<ScoreModel>> allScores;

    public ScoreViewModel(Application application) {
        super(application);
        this.scoreRepository = new ScoreRepository(application);
        this.allScores = scoreRepository.getAllScores();
    }

    public LiveData<List<ScoreModel>> getAllScores() {
        return allScores;
    }

    public void insert(ScoreModel scoreModel) {
        scoreRepository.insert(scoreModel);
    }

    public LiveData<List<BestScore>> getTop10Scores() {
        return scoreRepository.getTop10Scores();
    }
}
