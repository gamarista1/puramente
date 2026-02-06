package com.bugsnag.android;

import K4.r;
import com.bugsnag.android.v1;
import kotlin.Pair;
import mf.O;
import yf.C6798l;

/* renamed from: com.bugsnag.android.v  reason: case insensitive filesystem */
public final class C3276v implements r {

    /* renamed from: a  reason: collision with root package name */
    private final A f38901a;

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f38902b;

    public C3276v(A a10, C6798l lVar) {
        this.f38901a = a10;
        this.f38902b = lVar;
    }

    public void onStateChange(v1 v1Var) {
        X0 x02;
        boolean z10;
        if (v1Var instanceof v1.n) {
            x02 = new X0("ContextUpdate", ((v1.n) v1Var).f38935a);
        } else {
            boolean z11 = true;
            if (v1Var instanceof v1.c) {
                z10 = true;
            } else {
                z10 = v1Var instanceof v1.f;
            }
            if (!z10) {
                z11 = v1Var instanceof v1.g;
            }
            if (z11) {
                x02 = new X0("MetadataUpdate", this.f38901a.u());
            } else if (v1Var instanceof v1.s) {
                v1.s sVar = (v1.s) v1Var;
                x02 = new X0("UserUpdate", O.l(new Pair("id", sVar.f38943a.b()), new Pair("email", sVar.f38943a.a()), new Pair("name", sVar.f38943a.c())));
            } else if (v1Var instanceof v1.b) {
                v1.b bVar = (v1.b) v1Var;
                x02 = new X0("AddFeatureFlag", O.l(new Pair("name", bVar.f38908a), new Pair("variant", bVar.f38909b)));
            } else if (v1Var instanceof v1.d) {
                x02 = new X0("ClearFeatureFlag", O.f(new Pair("name", ((v1.d) v1Var).f38913a)));
            } else {
                x02 = null;
                if (v1Var instanceof v1.e) {
                    x02 = new X0("ClearFeatureFlag", (Object) null);
                }
            }
        }
        if (x02 != null) {
            this.f38902b.invoke(x02);
        }
    }
}
