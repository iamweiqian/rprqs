package wqyap762.rprqs;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;


public class OrderFoodActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_food);

        // set lunch / set dinner
        Button setOrderButton = (Button) findViewById(R.id.setOrderButton);
        setOrderButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToSetOrderActivity();
                    }
                }
        );

        // rice
        Button riceOrderButton = (Button) findViewById(R.id.riceOrderButton);
        riceOrderButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToRiceOrderActivity();
                    }
                }
        );

        // noodles
        Button noodlesOrderButton = (Button) findViewById(R.id.noodlesOrderButton);
        noodlesOrderButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToNoodlesOrderActivity();
                    }
                }
        );

        // beverages
        Button beveragesOrderButton = (Button) findViewById(R.id.beveragesOrderButton);
        beveragesOrderButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToBeveragesOrderActivity();
                    }
                }
        );

        // homemade desserts
        Button homemadedessertsOrderButton = (Button) findViewById(R.id.homemadeDessertsOrderButton);
        homemadedessertsOrderButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToHomemadeDessertsOrderActivity();
                    }
                }
        );

        // homemade beverages
        Button homemadebeveragesOrderButton = (Button) findViewById(R.id.homemadeBeveragesOrderButton);
        homemadebeveragesOrderButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        goToHomemadeBeveragesOrderActivity();
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_order_food, menu);
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

    public void goToSetOrderActivity() {
        Intent intent = new Intent(this, SetOrderActivity.class);
        startActivity(intent);
    }

    public void goToRiceOrderActivity() {
        Intent intent = new Intent(this, RiceOrderActivity.class);
        startActivity(intent);
    }

    public void goToNoodlesOrderActivity() {
        Intent intent = new Intent(this, NoodlesOrderActivity.class);
        startActivity(intent);
    }

    public void goToBeveragesOrderActivity() {
        Intent intent = new Intent(this, BeveragesOrderActivity.class);
        startActivity(intent);
    }

    public void goToHomemadeDessertsOrderActivity() {
        Intent intent = new Intent(this, HomemadeDessertsOrderActivity.class);
        startActivity(intent);
    }

    public void goToHomemadeBeveragesOrderActivity() {
        Intent intent = new Intent(this, HomemadeBeveragesOrderActivity.class);
        startActivity(intent);
    }
}
