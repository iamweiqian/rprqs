package wqyap762.rprqs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class TrackWaitingTimeAdminActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_waiting_time_admin);

        // listed order to track
        Button trackAdminButton = (Button) findViewById(R.id.trackAdminButton);
        trackAdminButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToTrackOrderAdminActivity();
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_track_waiting_time_admin, menu);
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

    public void goToTrackOrderAdminActivity() {
        Intent intent = new Intent(this, TrackOrderAdminActivity.class);
        startActivity(intent);
    }
}
