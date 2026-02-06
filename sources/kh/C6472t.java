package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6489k;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.t  reason: case insensitive filesystem */
public final class C6472t extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final C6472t f71705c = new C6472t();

    private C6472t() {
        super(C5998a.z(C6489k.f71788a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(double[] dArr) {
        C6496s.h(dArr, "<this>");
        return dArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public double[] r() {
        return new double[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, C6471s sVar, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(sVar, "builder");
        sVar.e(cVar.x(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C6471s k(double[] dArr) {
        C6496s.h(dArr, "<this>");
        return new C6471s(dArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, double[] dArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(dArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.g(getDescriptor(), i11, dArr[i11]);
        }
    }
}
