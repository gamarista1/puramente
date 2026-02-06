package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.d0  reason: case insensitive filesystem */
final class C4521d0 implements C4532n {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f54148a;

    C4521d0(IBinder iBinder) {
        this.f54148a = iBinder;
    }

    public final void B0(C4531m mVar, C4525g gVar) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (mVar != null) {
                iBinder = mVar.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (gVar != null) {
                obtain.writeInt(1);
                t0.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f54148a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th2) {
            obtain2.recycle();
            obtain.recycle();
            throw th2;
        }
    }

    public final IBinder asBinder() {
        return this.f54148a;
    }
}
