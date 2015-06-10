package com.ilyarudyak.android.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button buttonSpotifyStreamer;
    private Button buttonScoresApp;
    private Button buttonLibraryApp;
    private Button buttonBuildItBigger;
    private Button buttonXyzReader;
    private Button buttonCapstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSpotifyStreamer = (Button) findViewById(R.id.buttonSpotifyStreamer);
        buttonScoresApp = (Button) findViewById(R.id.buttonScoresApp);
        buttonLibraryApp = (Button) findViewById(R.id.buttonLibraryApp);
        buttonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        buttonXyzReader = (Button) findViewById(R.id.buttonXyzReader);
        buttonCapstone = (Button) findViewById(R.id.buttonCapstone);

        buttonSpotifyStreamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_spotify_streamer),
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttonScoresApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_scores_app),
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttonLibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_library_app),
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_build_it_bigger),
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttonXyzReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_xyz_reader),
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        getString(R.string.toast_capstone),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
