package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import za.C5298a;
import za.c;

public final class T extends C5298a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    /* renamed from: a  reason: collision with root package name */
    final int f54128a;

    /* renamed from: b  reason: collision with root package name */
    private final Account f54129b;

    /* renamed from: c  reason: collision with root package name */
    private final int f54130c;

    /* renamed from: d  reason: collision with root package name */
    private final GoogleSignInAccount f54131d;

    T(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f54128a = i10;
        this.f54129b = account;
        this.f54130c = i11;
        this.f54131d = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f54128a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.B(parcel, 2, this.f54129b, i10, false);
        c.t(parcel, 3, this.f54130c);
        c.B(parcel, 4, this.f54131d, i10, false);
        c.b(parcel, a10);
    }

    public T(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
