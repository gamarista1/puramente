package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.play.integrity.internal.a  reason: case insensitive filesystem */
public abstract class C4738a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f56563a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56564b;

    protected C4738a(IBinder iBinder, String str) {
        this.f56563a = iBinder;
        this.f56564b = str;
    }

    public final IBinder asBinder() {
        return this.f56563a;
    }

    /* access modifiers changed from: protected */
    public final Parcel r1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f56564b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void s1(int i10, Parcel parcel) {
        try {
            this.f56563a.transact(i10, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
