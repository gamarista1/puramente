package com.dylanvann.fastimage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.C1769q;
import androidx.fragment.app.C1773v;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import java.io.File;

public final class GlideApp {
    private GlideApp() {
    }

    @SuppressLint({"VisibleForTests"})
    public static void enableHardwareBitmaps() {
        c.d();
    }

    public static c get(Context context) {
        return c.e(context);
    }

    public static File getPhotoCacheDir(Context context) {
        return c.l(context);
    }

    @SuppressLint({"VisibleForTests"})
    @Deprecated
    public static void init(c cVar) {
        c.r(cVar);
    }

    @SuppressLint({"VisibleForTests"})
    public static void isInitialized() {
        c.u();
    }

    @SuppressLint({"VisibleForTests"})
    public static void tearDown() {
        c.x();
    }

    public static GlideRequests with(Context context) {
        return (GlideRequests) c.D(context);
    }

    public static File getPhotoCacheDir(Context context, String str) {
        return c.m(context, str);
    }

    @SuppressLint({"VisibleForTests"})
    public static void init(Context context, d dVar) {
        c.q(context, dVar);
    }

    @Deprecated
    public static GlideRequests with(Activity activity) {
        return (GlideRequests) c.B(activity);
    }

    public static GlideRequests with(C1773v vVar) {
        return (GlideRequests) c.G(vVar);
    }

    public static GlideRequests with(C1769q qVar) {
        return (GlideRequests) c.F(qVar);
    }

    @Deprecated
    public static GlideRequests with(Fragment fragment) {
        return (GlideRequests) c.C(fragment);
    }

    public static GlideRequests with(View view) {
        return (GlideRequests) c.E(view);
    }
}
