package com.example.sjdeuces.hackucsc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CollegeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);
        //TieredDiningHallList();

    }

    private void TieredDiningHallList(){
        //get public eatingtime to know how to tier
        CollegeInfo cInfo = new CollegeInfo();


        /*request ethan's server for the DH rating at
        that eating time.
        */


        // 1 highest tier, 5 lowest


        /*
        //Stack Overflow code for adding buttons dynamically


         */



        /*call ethan's data via gson to know the avg tier
        for that eating time*/

        /*set the buttons from highest tier DH to lowest
        with the avg rating.
         */
    }

    public void goToMenu(View v) {
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("menuView", v.getId());
        startActivity(intent);
    }


}
