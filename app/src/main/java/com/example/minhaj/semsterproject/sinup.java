package com.example.minhaj.semsterproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

/**
 * Created by Minhaj on 11/21/2017.
 */

public class sinup extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sinup);
    }

    public void onClick1(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

}
