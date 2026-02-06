package com.amazon.device.iap.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.internal.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37978a = (a.class.getName() + "_PREFS");

    public static String a(String str) {
        f.a((Object) str, "userId");
        Context b10 = d.f().b();
        f.a((Object) b10, "context");
        return b10.getSharedPreferences(f37978a, 0).getString(str, (String) null);
    }

    public static void a(String str, String str2) {
        f.a((Object) str, "userId");
        Context b10 = d.f().b();
        f.a((Object) b10, "context");
        SharedPreferences.Editor edit = b10.getSharedPreferences(f37978a, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
