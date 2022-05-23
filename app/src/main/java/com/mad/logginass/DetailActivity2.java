package com.mad.logginass;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mad.logginass.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DetailActivity2 extends AppCompatActivity {
    ArrayList<com.mad.logginass.Art> Myart;

    TextView txtPaintingName;
    TextView txtPaintingDescription;
    TextView txtPaintingPrice;
    ImageView imagePainting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        txtPaintingName = findViewById(R.id.tv_PaintingName);
        txtPaintingDescription = findViewById(R.id.tv_PaintingDescription);
        txtPaintingPrice = findViewById(R.id.tv_PaintingPrice);
        imagePainting = findViewById(R.id.img_PaintingImage);

        Intent detail = getIntent();
        int selectedReceivedPaintingPostion = detail.getIntExtra("pos",0);

        Myart = new ArrayList<com.mad.logginass.Art>();

        //creating art
        com.mad.logginass.Art painting1 = new com.mad.logginass.Art("One car collision", R.drawable.onecaracc, "1700 piece", 11.800);
        com.mad.logginass.Art painting2 = new com.mad.logginass.Art("Three cars accident", R.drawable.threecars, "itachi modern painting", 230.500);
        com.mad.logginass.Art painting3 = new com.mad.logginass.Art("Street closed", R.drawable.streetclosed, "weird babies", 7.500);
        com.mad.logginass.Art painting4 = new com.mad.logginass.Art("Road traffic jam", R.drawable.roadtrafficjam, "Monster sheee", 18.300);
        com.mad.logginass.Art painting5 = new com.mad.logginass.Art("Road rebuild", R.drawable.potholesfix, "Horse and man", 20.800);
        com.mad.logginass.Art painting6 = new com.mad.logginass.Art("Police stop inspection", R.drawable.policeinspection, "Dog", 15.320);
        com.mad.logginass.Art painting7 = new com.mad.logginass.Art("Police road block", R.drawable.policeroadblock, "mother and kids", 17.400);



        //adding fruits into the array List
        Myart.add(painting1);
        Myart.add(painting2);
        Myart.add(painting3);
        Myart.add(painting4);
        Myart.add(painting5);
        Myart.add(painting6);
        Myart.add(painting7);



        txtPaintingName.setText(Myart.get(selectedReceivedPaintingPostion).getArtName());
        txtPaintingDescription.setText(Myart.get(selectedReceivedPaintingPostion).getArtDescription());
        txtPaintingPrice.setText(String.valueOf(Myart.get(selectedReceivedPaintingPostion).getArtPrice()));
        Picasso.get().load(Myart.get(selectedReceivedPaintingPostion).getArtImage()).into(imagePainting);

    }
}