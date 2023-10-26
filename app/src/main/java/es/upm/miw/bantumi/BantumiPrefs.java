package es.upm.miw.bantumi;

import android.os.Bundle;
import android.util.Log;

import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class BantumiPrefs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bantumi_prefs);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);

            findPreference("playerName").setOnPreferenceChangeListener(
                    new Preference.OnPreferenceChangeListener() {
                        @Override
                        public boolean onPreferenceChange(@NonNull Preference preference, Object newValue) {
                            Log.i(
                                    MainActivity.LOG_TAG,
                                    "onCreatePreferences(): " + preference + " = " + newValue
                            );
                            return true;
                        }
                    }
            );
        }
    }
}
