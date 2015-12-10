package com.cxria.myapplication;

/**
 * Created by xiaoyu-liu on 15-12-10.
 */
public class Utils {
    private static Utils mUtils = new Utils();
    public static Utils instance(){return mUtils;}

    public int add(int x, int y){
        return x + y;
    }
}
