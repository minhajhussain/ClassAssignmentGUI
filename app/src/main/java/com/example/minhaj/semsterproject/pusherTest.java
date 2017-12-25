package com.example.minhaj.semsterproject;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Minhaj on 11/22/2017.
 */

public class pusherTest extends Activity {

    private static final String TAG ="MyTag" ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pushertest);

        Log.d(TAG, "onCreate: We are in onCreate ");
    }
}
