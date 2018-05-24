package com.example.xyzreader.remote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.xyzreader.R;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
    static final URL BASE_URL;
    private static String TAG = Config.class.toString();
    @SuppressLint("StaticFieldLeak")
    private static Context mContext;


    public Config(Context context){
        mContext= context;
    }

    static {
        URL url = null;
        try {
            url = new URL("https://raw.githubusercontent.com/TNTest/xyzreader/master/data.json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Toast.makeText(mContext, R.string.error_config, Toast.LENGTH_LONG).show();
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }



}
