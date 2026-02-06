package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class r1 implements C3235f0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38859b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f38860a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r1(Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences("com.bugsnag.android", 0);
        } catch (RuntimeException unused) {
            sharedPreferences = null;
        }
        this.f38860a = sharedPreferences;
    }

    public String a(boolean z10) {
        SharedPreferences sharedPreferences = this.f38860a;
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.getString("install.iud", (String) null);
    }

    public final void b() {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        if (c() && (sharedPreferences = this.f38860a) != null && (edit = sharedPreferences.edit()) != null && (clear = edit.clear()) != null) {
            clear.commit();
        }
    }

    public final boolean c() {
        SharedPreferences sharedPreferences = this.f38860a;
        if (sharedPreferences != null && sharedPreferences.contains("install.iud")) {
            return true;
        }
        return false;
    }

    public final L1 d(String str) {
        String str2;
        String str3;
        SharedPreferences sharedPreferences = this.f38860a;
        String str4 = null;
        if (sharedPreferences == null) {
            str2 = null;
        } else {
            str2 = sharedPreferences.getString("user.id", str);
        }
        SharedPreferences sharedPreferences2 = this.f38860a;
        if (sharedPreferences2 == null) {
            str3 = null;
        } else {
            str3 = sharedPreferences2.getString("user.email", (String) null);
        }
        SharedPreferences sharedPreferences3 = this.f38860a;
        if (sharedPreferences3 != null) {
            str4 = sharedPreferences3.getString("user.name", (String) null);
        }
        return new L1(str2, str3, str4);
    }
}
