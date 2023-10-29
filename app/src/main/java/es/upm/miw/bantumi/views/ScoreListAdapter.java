package es.upm.miw.bantumi.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import es.upm.miw.bantumi.model.BestScore;
import es.upm.miw.bantumi.R;

public class ScoreListAdapter extends ListAdapter<BestScore, ScoreViewHolder> {

    public ScoreListAdapter(@NonNull DiffUtil.ItemCallback<BestScore> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public ScoreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return ScoreViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull ScoreViewHolder holder, int position) {
        BestScore current = getItem(position);
        holder.bind(current.toString());
    }

    public static class ScoreDiff extends DiffUtil.ItemCallback<BestScore> {

        @Override
        public boolean areItemsTheSame(@NonNull BestScore oldItem, @NonNull BestScore newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull BestScore oldItem, @NonNull BestScore newItem) {
            return false;
        }
    }
}


