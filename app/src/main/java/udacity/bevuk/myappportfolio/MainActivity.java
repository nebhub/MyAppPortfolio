package udacity.bevuk.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button btnPopularMovies = (Button)findViewById(R.id.btn_popular_movies);
        btnPopularMovies.setOnClickListener(this);

        Button btnStockHawk= (Button)findViewById(R.id.btn_stock_hawk);
        btnStockHawk.setOnClickListener(this);

        Button btnBuildItBetter = (Button)findViewById(R.id.btn_build_it_bigger);
        btnBuildItBetter.setOnClickListener(this);

        Button btnMakeYourAppBigger = (Button)findViewById(R.id.btn_make_your_app_material);
        btnMakeYourAppBigger.setOnClickListener(this);

        Button btnGoUbiquitous = (Button)findViewById(R.id.btn_go_ubiquitous);
        btnGoUbiquitous.setOnClickListener(this);

        Button btnCapstone = (Button)findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(this);


    }

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

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btn_popular_movies:

                Toast.makeText(this, "This button will Launch my Popular Movies App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_stock_hawk:

                Toast.makeText(this, "This button will Launch my Stock hawk App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_build_it_bigger:

                Toast.makeText(this, "This button will Launch my Build It Better App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_make_your_app_material:

                Toast.makeText(this, "This button will Launch my Make Your App Material App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_go_ubiquitous:

                Toast.makeText(this, "This button will Launch my Go Ubiquitous App!", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_capstone:

                Toast.makeText(this, "This button will Launch my Capstone App!", Toast.LENGTH_SHORT).show();
                break;

        }

    }
}
