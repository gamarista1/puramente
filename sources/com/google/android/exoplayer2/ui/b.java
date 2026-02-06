package com.google.android.exoplayer2.ui;

import android.graphics.Color;
import ja.M;

abstract class b {
    public static String a(String str) {
        return "." + str + ",." + str + " *";
    }

    public static String b(int i10) {
        return M.C("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(((double) Color.alpha(i10)) / 255.0d));
    }
}
