package es.upm.miw.bantumi;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import es.upm.miw.bantumi.model.ScoreViewModel;
import es.upm.miw.bantumi.views.ScoreListAdapter;

public class TopScoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top_scores);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final ScoreListAdapter adapter = new ScoreListAdapter(new ScoreListAdapter.ScoreDiff());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ScoreViewModel scoreViewModel = new ViewModelProvider(this).get(ScoreViewModel.class);
        scoreViewModel.getTop10Scores().observe(this, adapter::submitList);
    }

    public void goBack(View view) {
        finish();
    }
}
