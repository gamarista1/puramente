package cg;

import Fg.C5366d0;
import Fg.I0;
import Of.m0;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.Y;

/* renamed from: cg.b  reason: case insensitive filesystem */
public abstract class C5799b {
    public static final C5798a a(I0 i02, boolean z10, boolean z11, m0 m0Var) {
        Set set;
        C6496s.h(i02, "<this>");
        if (m0Var != null) {
            set = Y.d(m0Var);
        } else {
            set = null;
        }
        return new C5798a(i02, (C5800c) null, z11, z10, set, (C5366d0) null, 34, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ C5798a b(I0 i02, boolean z10, boolean z11, m0 m0Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            m0Var = null;
        }
        return a(i02, z10, z11, m0Var);
    }
}
