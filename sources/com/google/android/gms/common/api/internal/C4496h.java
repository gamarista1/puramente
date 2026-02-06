package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: com.google.android.gms.common.api.internal.h  reason: case insensitive filesystem */
public interface C4496h extends IInterface {

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static abstract class a extends zab implements C4496h {
        public a() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static C4496h asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            if (queryLocalInterface instanceof C4496h) {
                return (C4496h) queryLocalInterface;
            }
            return new U(iBinder);
        }

        /* access modifiers changed from: protected */
        public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                return false;
            }
            zac.zab(parcel);
            onResult((Status) zac.zaa(parcel, Status.CREATOR));
            return true;
        }
    }

    void onResult(Status status);
}
