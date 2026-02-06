package com.facebook.soloader;

import w8.C4146b;

public class u implements C4146b {
    public boolean a(String str, int i10) {
        int i11;
        if ((i10 & 1) != 0) {
            i11 = 16;
        } else {
            i11 = 0;
        }
        return SoLoader.u(str, i11);
    }
}
