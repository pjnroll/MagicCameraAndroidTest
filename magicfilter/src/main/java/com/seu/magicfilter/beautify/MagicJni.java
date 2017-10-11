package com.seu.magicfilter.beautify;

import android.graphics.Bitmap;
import android.util.Log;

import java.nio.ByteBuffer;

/**
 * Created by why8222 on 2016/2/29.
 */
public class MagicJni {
    static{
        System.loadLibrary("MagicBeautify");
    }

    private static native void jniInitMagicBeautify(ByteBuffer handler);
    public static void callJniInitMagicBeautify(ByteBuffer handler) {
        jniInitMagicBeautify(handler);
    };

    private static native void jniUnInitMagicBeautify();
    public static void callJniUnInitMagicBeautify() {
        jniUnInitMagicBeautify();
    };


    private static native void jniStartSkinSmooth(float denoiseLevel);
    public static void callJniStartSkinSmooth(float denoiseLevel) {
        jniStartSkinSmooth(denoiseLevel);
    };


    private static native void jniStartWhiteSkin(float whitenLevel);
    public static void callJniStartWhiteSkin(float whitenLevel) {
        jniStartWhiteSkin(whitenLevel);
    };



    private static native ByteBuffer jniStoreBitmapData(Bitmap bitmap);
    public static ByteBuffer callJniStoreBitmapData(Bitmap bitmap) {
        return jniStoreBitmapData(bitmap);
    };


    private static native void jniFreeBitmapData(ByteBuffer handler);
    public static void callJniFreeBitmapData(ByteBuffer handler) {
        jniFreeBitmapData(handler);
    };


    private static native Bitmap jniGetBitmapFromStoredBitmapData(ByteBuffer handler);
    public static Bitmap callJniGetBitmapFromStoredBitmapData(ByteBuffer handler) {
        return jniGetBitmapFromStoredBitmapData(handler);
    };

}
