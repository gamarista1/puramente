package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.S;

public final class v0 extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final v0 f71712c = new v0();

    private v0() {
        super(C5998a.D(S.f71762a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(short[] sArr) {
        C6496s.h(sArr, "<this>");
        return sArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public short[] r() {
        return new short[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, u0 u0Var, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(u0Var, "builder");
        u0Var.e(cVar.r(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public u0 k(short[] sArr) {
        C6496s.h(sArr, "<this>");
        return new u0(sArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, short[] sArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.E(getDescriptor(), i11, sArr[i11]);
        }
    }
}
