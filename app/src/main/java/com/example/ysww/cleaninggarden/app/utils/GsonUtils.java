package com.example.ysww.cleaninggarden.app.utils;

import android.util.Log;

import com.google.gson.Gson;

import static android.content.ContentValues.TAG;

/**
 * Gson解析
 */

public class GsonUtils<T> {
    public static <T> T getGson(String str, Class<T> classes){
        try {
            Gson gson = new Gson();
            T t = gson.fromJson(str, classes);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(TAG, "getGson: "+e.getMessage());
        }
        return null;
    }
}
