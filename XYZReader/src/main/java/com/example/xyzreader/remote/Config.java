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
    private static final String URL_JSON= "https://firebasestorage.googleapis.com/v0/b/friendychat-1e0b0.appspot.com/" +
            "o/zyx%2Fxyz-reader.json?alt=media&token=84e30dc4-a6ce-4dfa-8277-18f869b08d32";

    public Config(Context context){
        mContext= context;
    }

    static {
        URL url = null;
        try {
            url = new URL(URL_JSON);
            //I use data.json from above instead of "https://go.udacity.com/xyz-reader-json" because it seems to cause a bad refreshing in the app.
            //The original:
            //url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
            Toast.makeText(mContext, R.string.error_config, Toast.LENGTH_LONG).show();
            Log.e(TAG, "Please check your internet connection.");
        }

        BASE_URL = url;
    }



}
