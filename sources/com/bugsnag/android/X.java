package com.bugsnag.android;

import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class X {

    /* renamed from: j  reason: collision with root package name */
    public static final a f38629j = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f38630a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38631b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38632c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f38633d;

    /* renamed from: e  reason: collision with root package name */
    private final String f38634e;

    /* renamed from: f  reason: collision with root package name */
    private final String f38635f;

    /* renamed from: g  reason: collision with root package name */
    private final String f38636g;

    /* renamed from: h  reason: collision with root package name */
    private final String f38637h;

    /* renamed from: i  reason: collision with root package name */
    private final String[] f38638i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final X a() {
            int i10 = Build.VERSION.SDK_INT;
            return new X(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(i10), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.SUPPORTED_ABIS);
        }

        private a() {
        }
    }

    public X(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String[] strArr) {
        this.f38630a = str;
        this.f38631b = str2;
        this.f38632c = str3;
        this.f38633d = num;
        this.f38634e = str4;
        this.f38635f = str5;
        this.f38636g = str6;
        this.f38637h = str7;
        this.f38638i = strArr;
    }

    public final Integer a() {
        return this.f38633d;
    }

    public final String b() {
        return this.f38637h;
    }

    public final String[] c() {
        return this.f38638i;
    }

    public final String d() {
        return this.f38635f;
    }

    public final String e() {
        return this.f38630a;
    }

    public final String f() {
        return this.f38631b;
    }

    public final String g() {
        return this.f38634e;
    }

    public final String h() {
        return this.f38632c;
    }

    public final String i() {
        return this.f38636g;
    }
}
