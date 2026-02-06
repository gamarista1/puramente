package com.google.android.gms.measurement.internal;

import Pa.e;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.C4518c;

public final class T1 extends C4518c {
    public T1(Context context, Looper looper, C4518c.a aVar, C4518c.b bVar) {
        super(context, looper, 93, aVar, bVar, (String) null);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new O1(iBinder);
    }

    public final int getMinApkVersion() {
        return d.f54103a;
    }

    /* access modifiers changed from: protected */
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
