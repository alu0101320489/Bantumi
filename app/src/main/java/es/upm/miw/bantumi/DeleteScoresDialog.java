package es.upm.miw.bantumi;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.DialogFragment;

public class DeleteScoresDialog extends DialogFragment{
        @NonNull
        @Override
        public AppCompatDialog onCreateDialog(Bundle savedInstanceState) {
            final TopScoresActivity topScoresActivity = (TopScoresActivity) requireActivity();

            assert topScoresActivity != null;
            AlertDialog.Builder builder = new AlertDialog.Builder(topScoresActivity);
            builder
                    .setTitle("Borrar puntuaciones")
                    .setMessage("Desea borrar las puntuaciones?")
                    .setPositiveButton(
                            getString(android.R.string.yes),
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    topScoresActivity.deleteAllScores();
                                }
                            }
                    )
                    .setNegativeButton(
                            getString(android.R.string.cancel),
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            }
                    );

            return builder.create();
        }
}
