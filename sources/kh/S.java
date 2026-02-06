package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6499v;

public final class S extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final S f71626c = new S();

    private S() {
        super(C5998a.C(C6499v.f71791a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(long[] jArr) {
        C6496s.h(jArr, "<this>");
        return jArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public long[] r() {
        return new long[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, Q q10, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(q10, "builder");
        q10.e(cVar.G(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Q k(long[] jArr) {
        C6496s.h(jArr, "<this>");
        return new Q(jArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, long[] jArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(jArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.C(getDescriptor(), i11, jArr[i11]);
        }
    }
}
