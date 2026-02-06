package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.C4536s;

public final class zzbj {
    public static Looper zza(Looper looper) {
        if (looper != null) {
            return looper;
        }
        return zzb();
    }

    public static Looper zzb() {
        boolean z10;
        if (Looper.myLooper() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C4536s.p(z10, "Can't create handler inside thread that has not called Looper.prepare()");
        return Looper.myLooper();
    }
}
