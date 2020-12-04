package com.example.newtownfitness;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SelectLocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_location);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.location, menu);
        return true;
    }

    private void launchActivityWBev() {
        Intent intentwb = new Intent(this, UnlockActivity_wbev.class);
        startActivity(intentwb);
    }
    private void launchActivityFourth() {
        Intent intentfour = new Intent(this, UnlockActivity_fourth.class);
        startActivity(intentfour);
    }
    private void launchActivityNorth() {
        Intent intentnor = new Intent(this, UnlockActivity_north.class);
        startActivity(intentnor);
    }
    private void launchActivitySouth() {
        Intent intentsou = new Intent(this, UnlockActivity_south.class);
        startActivity(intentsou);
    }
    private void launchActivityEast() {
        Intent intenteast = new Intent(this, UnlockActivity_east.class);
        startActivity(intenteast);
    }
    private void launchActivityWest() {
        Intent intentwest = new Intent(this, UnlockActivity_west.class);
        startActivity(intentwest);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.charl:
                Toast.makeText(this, "Charlottesville selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.fourth:
                Toast.makeText(this, "108 4th Street selected", Toast.LENGTH_SHORT).show();
                launchActivityFourth();
                return true;
            case R.id.eighth:
                Toast.makeText(this, "103 8th Street selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.eighthn:
                Toast.makeText(this, "103 8th St North side selected", Toast.LENGTH_SHORT).show();
                launchActivityNorth();
                return true;
            case R.id.eighths:
                Toast.makeText(this, "103 8th St South side selected", Toast.LENGTH_SHORT).show();
                launchActivitySouth();
                return true;
            case R.id.staun:
                Toast.makeText(this, "Staunton selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.wbev:
                Toast.makeText(this, "West Beverley selected", Toast.LENGTH_SHORT).show();
                launchActivityWBev();
                return true;
            case R.id.naug:
                Toast.makeText(this, "N Augusta selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.nauge:
                Toast.makeText(this, "N Augusta East side selected", Toast.LENGTH_SHORT).show();
                launchActivityEast();
                return true;
            case R.id.naugw:
                Toast.makeText(this, "N Augusta West side selected", Toast.LENGTH_SHORT).show();
                launchActivityWest();
                return true;
            default:
                Toast.makeText(this, "no item selected", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}