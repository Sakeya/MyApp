package com.cxria.myapplication;

/**
 * Created by xiaoyu-liu on 15-12-10.
 */
public class CCallNative {
    private static CCallNative mNative = new CCallNative();
    public static CCallNative instance(){return mNative;}

    public native void hello();
}
