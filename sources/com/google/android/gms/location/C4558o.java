package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.location.o  reason: case insensitive filesystem */
public abstract class C4558o {
    public static int a(int i10) {
        if ((i10 < 0 || i10 > 1) && (i10 < 1000 || i10 >= 1006)) {
            return 1;
        }
        return i10;
    }

    public static Status b(int i10) {
        if (i10 == 1) {
            i10 = 13;
        }
        return new Status(i10);
    }
}
