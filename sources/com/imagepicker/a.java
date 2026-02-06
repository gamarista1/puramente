package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

public class a extends d {
    public a(Uri uri, Context context) {
        try {
            String h10 = new R1.a(context.getContentResolver().openInputStream(uri)).h("DateTime");
            if (h10 != null) {
                this.f59110a = a(h10, "yyyy:MM:dd HH:mm:ss");
            }
        } catch (Exception e10) {
            Log.e("RNIP", "Could not load image metadata: " + e10.getMessage());
        }
    }

    public String b() {
        return this.f59110a;
    }
}
