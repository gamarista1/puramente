package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6508G;
import lf.C6509H;

public final class J0 extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final J0 f71608c = new J0();

    private J0() {
        super(C5998a.H(C6508G.f71802b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6509H) obj).I());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6509H) obj).I());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return C6509H.a(w());
    }

    public /* bridge */ /* synthetic */ void u(d dVar, Object obj, int i10) {
        z(dVar, ((C6509H) obj).I(), i10);
    }

    /* access modifiers changed from: protected */
    public int v(long[] jArr) {
        C6496s.h(jArr, "$this$collectionSize");
        return C6509H.z(jArr);
    }

    /* access modifiers changed from: protected */
    public long[] w() {
        return C6509H.b(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, I0 i02, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(i02, "builder");
        i02.e(C6508G.b(cVar.e(getDescriptor(), i10).m()));
    }

    /* access modifiers changed from: protected */
    public I0 y(long[] jArr) {
        C6496s.h(jArr, "$this$toBuilder");
        return new I0(jArr, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public void z(d dVar, long[] jArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.k(getDescriptor(), i11).n(C6509H.v(jArr, i11));
        }
    }
}
