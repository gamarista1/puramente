package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;

public abstract class y extends n implements z {
    public static z b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        if (queryLocalInterface instanceof z) {
            return (z) queryLocalInterface;
        }
        return new x(iBinder);
    }
}
