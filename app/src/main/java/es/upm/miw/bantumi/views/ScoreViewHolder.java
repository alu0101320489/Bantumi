package es.upm.miw.bantumi.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import es.upm.miw.bantumi.R;

public class ScoreViewHolder extends RecyclerView.ViewHolder {
    private final TextView scoreItemView;

    public ScoreViewHolder(View itemView) {
        super(itemView);
        scoreItemView = itemView.findViewById(R.id.item_textView);
    }

    public void bind(String text) {
        scoreItemView.setText(text);
    }

    static ScoreViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new ScoreViewHolder(view);
    }
}