package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6511J;
import lf.C6512K;

public final class M0 extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final M0 f71616c = new M0();

    private M0() {
        super(C5998a.I(C6511J.f71808b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6512K) obj).I());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6512K) obj).I());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return C6512K.a(w());
    }

    public /* bridge */ /* synthetic */ void u(d dVar, Object obj, int i10) {
        z(dVar, ((C6512K) obj).I(), i10);
    }

    /* access modifiers changed from: protected */
    public int v(short[] sArr) {
        C6496s.h(sArr, "$this$collectionSize");
        return C6512K.z(sArr);
    }

    /* access modifiers changed from: protected */
    public short[] w() {
        return C6512K.b(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, L0 l02, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(l02, "builder");
        l02.e(C6511J.b(cVar.e(getDescriptor(), i10).t()));
    }

    /* access modifiers changed from: protected */
    public L0 y(short[] sArr) {
        C6496s.h(sArr, "$this$toBuilder");
        return new L0(sArr, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public void z(d dVar, short[] sArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(sArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.k(getDescriptor(), i11).s(C6512K.v(sArr, i11));
        }
    }
}
