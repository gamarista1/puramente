package com.facebook.imagepipeline.producers;

import W6.g;
import c7.C3189i;

public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final v0 f40085a = new v0();

    private v0() {
    }

    public static final int a(int i10) {
        return (int) (((float) i10) * 1.3333334f);
    }

    public static final boolean b(int i10, int i11, g gVar) {
        if (gVar == null) {
            if (((float) a(i10)) < 2048.0f || a(i11) < 2048) {
                return false;
            }
        } else if (a(i10) < gVar.f34903a || a(i11) < gVar.f34904b) {
            return false;
        }
        return true;
    }

    public static final boolean c(C3189i iVar, g gVar) {
        if (iVar == null) {
            return false;
        }
        int M02 = iVar.M0();
        if (M02 == 90 || M02 == 270) {
            return b(iVar.d(), iVar.e(), gVar);
        }
        return b(iVar.e(), iVar.d(), gVar);
    }
}
