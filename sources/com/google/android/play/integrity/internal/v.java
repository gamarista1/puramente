package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;

public abstract class v extends n implements w {
    public v() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 2) {
            o.b(parcel);
            e((Bundle) o.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 == 3) {
            o.b(parcel);
            c((Bundle) o.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 == 4) {
            o.b(parcel);
            d((Bundle) o.a(parcel, Bundle.CREATOR));
            return true;
        } else if (i10 != 5) {
            return false;
        } else {
            o.b(parcel);
            b((Bundle) o.a(parcel, Bundle.CREATOR));
            return true;
        }
    }
}
