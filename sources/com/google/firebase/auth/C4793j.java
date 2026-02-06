package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import za.c;

/* renamed from: com.google.firebase.auth.j  reason: case insensitive filesystem */
public class C4793j extends C4789h {
    public static final Parcelable.Creator<C4793j> CREATOR = new D0();

    /* renamed from: a  reason: collision with root package name */
    private String f57044a;

    /* renamed from: b  reason: collision with root package name */
    private String f57045b;

    /* renamed from: c  reason: collision with root package name */
    private final String f57046c;

    /* renamed from: d  reason: collision with root package name */
    private String f57047d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f57048e;

    C4793j(String str, String str2) {
        this(str, str2, (String) null, (String) null, false);
    }

    public static boolean s0(String str) {
        C4785f c10;
        if (!TextUtils.isEmpty(str) && (c10 = C4785f.c(str)) != null && c10.b() == 4) {
            return true;
        }
        return false;
    }

    public String o0() {
        return "password";
    }

    public String p0() {
        if (!TextUtils.isEmpty(this.f57045b)) {
            return "password";
        }
        return "emailLink";
    }

    public final C4789h q0() {
        return new C4793j(this.f57044a, this.f57045b, this.f57046c, this.f57047d, this.f57048e);
    }

    public final C4793j r0(A a10) {
        this.f57047d = a10.zze();
        this.f57048e = true;
        return this;
    }

    public final String t0() {
        return this.f57047d;
    }

    public final boolean u0() {
        if (!TextUtils.isEmpty(this.f57046c)) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f57044a, false);
        c.D(parcel, 2, this.f57045b, false);
        c.D(parcel, 3, this.f57046c, false);
        c.D(parcel, 4, this.f57047d, false);
        c.g(parcel, 5, this.f57048e);
        c.b(parcel, a10);
    }

    public final String zzc() {
        return this.f57044a;
    }

    public final String zzd() {
        return this.f57045b;
    }

    public final String zze() {
        return this.f57046c;
    }

    public final boolean zzg() {
        return this.f57048e;
    }

    C4793j(String str, String str2, String str3, String str4, boolean z10) {
        this.f57044a = C4536s.f(str);
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f57045b = str2;
            this.f57046c = str3;
            this.f57047d = str4;
            this.f57048e = z10;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }
}
