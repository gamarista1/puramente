package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6490l;
import kotlin.jvm.internal.C6496s;

public final class B extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final B f71585c = new B();

    private B() {
        super(C5998a.A(C6490l.f71789a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(float[] fArr) {
        C6496s.h(fArr, "<this>");
        return fArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public float[] r() {
        return new float[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, C6438A a10, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(a10, "builder");
        a10.e(cVar.f(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C6438A k(float[] fArr) {
        C6496s.h(fArr, "<this>");
        return new C6438A(fArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, float[] fArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(fArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.o(getDescriptor(), i11, fArr[i11]);
        }
    }
}
