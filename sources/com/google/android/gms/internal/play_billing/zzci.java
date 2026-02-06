package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.a;

public class zzci {
    zzci() {
    }

    static int zzc(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        } else if (i11 <= i10) {
            return i10;
        } else {
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                int highestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = highestOneBit + highestOneBit;
            }
            if (i12 < 0) {
                return a.e.API_PRIORITY_OTHER;
            }
            return i12;
        }
    }
}
