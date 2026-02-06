package com.google.common.primitives;

import nb.o;

public abstract class i {
    public static byte a(long j10) {
        boolean z10;
        if ((j10 >> 8) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.g(z10, "out of range: %s", j10);
        return (byte) ((int) j10);
    }

    public static int b(byte b10) {
        return b10 & 255;
    }
}
