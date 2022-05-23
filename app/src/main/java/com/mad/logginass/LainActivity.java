package com.mad.logginass;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class LainActivity extends AppCompatActivity {
    //creating the art collection
    ArrayList<Art> Myart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Myart = new ArrayList<>();

        // Creating art
        Art painting1 = new Art("One car collision",R.drawable.onecaracc, "1700 piece", 11.800);
        Art painting2 = new Art("Three cars accident", R.drawable.threecars, "itachi modern painting", 230.500);
        Art painting3 = new Art("Street closed", R.drawable.streetclosed, "weird babies", 7.500);
        Art painting4 = new Art("Road traffic jam", R.drawable.roadtrafficjam, "Monster sheee", 18.300);
        Art painting5 = new Art("Road rebuild", R.drawable.potholesfix, "Horse and man", 20.800);
        Art painting6 = new Art("Police stop inspection", R.drawable.policeinspection, "Dog", 15.320);
        Art painting7 = new Art("Police road block", R.drawable.policeroadblock, "mother and kids", 17.400);

        //adding fruits into the array List
        Myart.add(painting1);
        Myart.add(painting2);
        Myart.add(painting3);
        Myart.add(painting4);
        Myart.add(painting5);
        Myart.add(painting6);
        Myart.add(painting7);

        RecyclerView recyclerView = findViewById(R.id.RecyclerView);

        LinearLayoutManager llManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(llManager);

        ArtAdapter artAdapter =  new ArtAdapter(LainActivity.this,Myart);
        recyclerView.setAdapter(artAdapter);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.openOptionsMenu();
        getMenuInflater().inflate(R.menu.my_menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mn_add) {
            startActivity(new Intent(this, AddPainting.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}