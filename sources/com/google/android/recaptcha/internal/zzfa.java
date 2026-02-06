package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.Map;
import lf.C6502A;
import mf.O;

public final class zzfa {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public static final Map zza() {
        Map n10 = O.n(C6502A.a(-4, zzl.zzz), C6502A.a(-12, zzl.zzA), C6502A.a(-6, zzl.zzv), C6502A.a(-11, zzl.zzx), C6502A.a(-13, zzl.zzB), C6502A.a(-14, zzl.zzC), C6502A.a(-2, zzl.zzw), C6502A.a(-7, zzl.zzD), C6502A.a(-5, zzl.zzE), C6502A.a(-9, zzl.zzF), C6502A.a(-8, zzl.zzP), C6502A.a(-15, zzl.zzy), C6502A.a(-1, zzl.zzG), C6502A.a(-3, zzl.zzI), C6502A.a(-10, zzl.zzJ));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            n10.put(-16, zzl.zzH);
        }
        if (i10 >= 27) {
            n10.put(1, zzl.zzL);
            n10.put(2, zzl.zzM);
            n10.put(0, zzl.zzN);
            n10.put(3, zzl.zzO);
        }
        if (i10 >= 29) {
            n10.put(4, zzl.zzK);
        }
        return n10;
    }
}
