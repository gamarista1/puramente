package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4529k;
import ya.C5286c;
import za.C5298a;

/* renamed from: com.google.android.gms.common.internal.g  reason: case insensitive filesystem */
public class C4525g extends C5298a {
    public static final Parcelable.Creator<C4525g> CREATOR = new t0();

    /* renamed from: o  reason: collision with root package name */
    static final Scope[] f54170o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    static final C5286c[] f54171p = new C5286c[0];

    /* renamed from: a  reason: collision with root package name */
    final int f54172a;

    /* renamed from: b  reason: collision with root package name */
    final int f54173b;

    /* renamed from: c  reason: collision with root package name */
    final int f54174c;

    /* renamed from: d  reason: collision with root package name */
    String f54175d;

    /* renamed from: e  reason: collision with root package name */
    IBinder f54176e;

    /* renamed from: f  reason: collision with root package name */
    Scope[] f54177f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f54178g;

    /* renamed from: h  reason: collision with root package name */
    Account f54179h;

    /* renamed from: i  reason: collision with root package name */
    C5286c[] f54180i;

    /* renamed from: j  reason: collision with root package name */
    C5286c[] f54181j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f54182k;

    /* renamed from: l  reason: collision with root package name */
    final int f54183l;

    /* renamed from: m  reason: collision with root package name */
    boolean f54184m;

    /* renamed from: n  reason: collision with root package name */
    private final String f54185n;

    C4525g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C5286c[] cVarArr, C5286c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f54170o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f54171p : cVarArr;
        cVarArr2 = cVarArr2 == null ? f54171p : cVarArr2;
        this.f54172a = i10;
        this.f54173b = i11;
        this.f54174c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f54175d = "com.google.android.gms";
        } else {
            this.f54175d = str;
        }
        if (i10 < 2) {
            this.f54179h = iBinder != null ? C4514a.b(C4529k.a.a(iBinder)) : null;
        } else {
            this.f54176e = iBinder;
            this.f54179h = account;
        }
        this.f54177f = scopeArr;
        this.f54178g = bundle;
        this.f54180i = cVarArr;
        this.f54181j = cVarArr2;
        this.f54182k = z10;
        this.f54183l = i13;
        this.f54184m = z11;
        this.f54185n = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        t0.a(this, parcel, i10);
    }

    public final String zza() {
        return this.f54185n;
    }
}
