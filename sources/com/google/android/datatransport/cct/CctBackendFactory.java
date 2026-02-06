package com.google.android.datatransport.cct;

import Z8.d;
import Z8.h;
import Z8.m;
import androidx.annotation.Keep;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new d(hVar.b(), hVar.e(), hVar.d());
    }
}
