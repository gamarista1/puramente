package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

public abstract class A extends n implements B {
    public A() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        o.b(parcel);
        b((Bundle) o.a(parcel, Bundle.CREATOR));
        return true;
    }
}
