package com.google.android.gms.measurement.internal;

import androidx.collection.C1609x;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.measurement.internal.v2  reason: case insensitive filesystem */
final class C4710v2 extends C1609x {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4681q2 f55372a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4710v2(C4681q2 q2Var, int i10) {
        super(20);
        this.f55372a = q2Var;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        C4536s.f(str);
        return C4681q2.v(this.f55372a, str);
    }
}
