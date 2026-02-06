package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.internal.p002firebaseauthapi.zzah;
import za.c;

public class C0 extends M {
    public static final Parcelable.Creator<C0> CREATOR = new B0();

    /* renamed from: a  reason: collision with root package name */
    private final String f56865a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56866b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56867c;

    /* renamed from: d  reason: collision with root package name */
    private final zzags f56868d;

    /* renamed from: e  reason: collision with root package name */
    private final String f56869e;

    /* renamed from: f  reason: collision with root package name */
    private final String f56870f;

    /* renamed from: g  reason: collision with root package name */
    private final String f56871g;

    C0(String str, String str2, String str3, zzags zzags, String str4, String str5, String str6) {
        this.f56865a = zzah.zzb(str);
        this.f56866b = str2;
        this.f56867c = str3;
        this.f56868d = zzags;
        this.f56869e = str4;
        this.f56870f = str5;
        this.f56871g = str6;
    }

    public static zzags u0(C0 c02, String str) {
        C4536s.l(c02);
        zzags zzags = c02.f56868d;
        if (zzags != null) {
            return zzags;
        }
        return new zzags(c02.s0(), c02.r0(), c02.o0(), (String) null, c02.t0(), (String) null, str, c02.f56869e, c02.f56871g);
    }

    public static C0 v0(zzags zzags) {
        C4536s.m(zzags, "Must specify a non-null webSignInCredential");
        return new C0((String) null, (String) null, (String) null, zzags, (String) null, (String) null, (String) null);
    }

    public static C0 w0(String str, String str2, String str3) {
        return y0(str, str2, str3, (String) null, (String) null);
    }

    static C0 x0(String str, String str2, String str3, String str4) {
        C4536s.g(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new C0(str, str2, str3, (zzags) null, (String) null, (String) null, str4);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public static C0 y0(String str, String str2, String str3, String str4, String str5) {
        C4536s.g(str, "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new C0(str, str2, str3, (zzags) null, str4, str5, (String) null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    public String o0() {
        return this.f56865a;
    }

    public String p0() {
        return this.f56865a;
    }

    public final C4789h q0() {
        return new C0(this.f56865a, this.f56866b, this.f56867c, this.f56868d, this.f56869e, this.f56870f, this.f56871g);
    }

    public String r0() {
        return this.f56867c;
    }

    public String s0() {
        return this.f56866b;
    }

    public String t0() {
        return this.f56870f;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, o0(), false);
        c.D(parcel, 2, s0(), false);
        c.D(parcel, 3, r0(), false);
        c.B(parcel, 4, this.f56868d, i10, false);
        c.D(parcel, 5, this.f56869e, false);
        c.D(parcel, 6, t0(), false);
        c.D(parcel, 7, this.f56871g, false);
        c.b(parcel, a10);
    }
}
