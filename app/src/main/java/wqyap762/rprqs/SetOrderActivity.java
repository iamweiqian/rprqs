package wqyap762.rprqs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class SetOrderActivity extends ActionBarActivity {

    String menu_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_order);

        // set A
        Button setAButton = (Button) findViewById(R.id.setAButton);
        setAButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        menu_id = "S001";
                        goToItemActivity();
                    }
                }
        );

        // set B
        Button setBButton = (Button) findViewById(R.id.setBButton);
        setBButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        menu_id = "S002";
                        goToItemActivity();
                    }
                }
        );

        // set C
        Button setCButton = (Button) findViewById(R.id.setCButton);
        setCButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        menu_id = "S003";
                        goToItemActivity();
                    }
                }
        );

        // set D
        Button setDButton = (Button) findViewById(R.id.setDButton);
        setDButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        menu_id = "S004";
                        goToItemActivity();
                    }
                }
        );

        // set E
        Button setEButton = (Button) findViewById(R.id.setEButton);
        setEButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        menu_id = "S005";
                        goToItemActivity();
                    }
                }
        );

        // set F
        Button setFButton = (Button) findViewById(R.id.setFButton);
        setFButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        menu_id = "S006";
                        goToItemActivity();
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_set_order, menu);
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

    public void goToItemActivity() {
        Intent intent = new Intent(this, ItemActivity.class);
        intent.putExtra("menu_id", menu_id);
        startActivity(intent);
    }
}
