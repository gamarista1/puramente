package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class t extends n implements u {
    public static u b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        if (queryLocalInterface instanceof u) {
            return (u) queryLocalInterface;
        }
        return new s(iBinder);
    }
}
