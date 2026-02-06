package com.revenuecat.purchases.common;

import Sg.C5541d;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u000e\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0004H\u0000\u001a\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u001a\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\u0011"}, d2 = {"MICROS_MULTIPLIER", "", "playServicesVersionName", "", "Landroid/content/Context;", "getPlayServicesVersionName", "(Landroid/content/Context;)Ljava/lang/String;", "playStoreVersionName", "getPlayStoreVersionName", "versionName", "getVersionName", "getLocale", "Ljava/util/Locale;", "packageVersionName", "packageName", "sha1", "sha256", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class UtilsKt {
    public static final int MICROS_MULTIPLIER = 1000000;

    public static final Locale getLocale(Context context) {
        C6496s.h(context, "<this>");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static final String getPlayServicesVersionName(Context context) {
        C6496s.h(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        C6496s.h(context, "<this>");
        return packageVersionName(context, "com.android.vending");
    }

    public static final String getVersionName(Context context) {
        C6496s.h(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String sha1(String str) {
        C6496s.h(str, "<this>");
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        Charset charset = C5541d.f65029b;
        byte[] bytes = str.getBytes(charset);
        C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] encode = Base64.encode(instance.digest(bytes), 2);
        C6496s.g(encode, "encode(it, Base64.NO_WRAP)");
        return new String(encode, charset);
    }

    public static final String sha256(String str) {
        C6496s.h(str, "<this>");
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        Charset charset = C5541d.f65029b;
        byte[] bytes = str.getBytes(charset);
        C6496s.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] encode = Base64.encode(instance.digest(bytes), 2);
        C6496s.g(encode, "encode(it, Base64.NO_WRAP)");
        return new String(encode, charset);
    }
}
