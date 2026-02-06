package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6482d;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.h  reason: case insensitive filesystem */
public final class C6453h extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final C6453h f71661c = new C6453h();

    private C6453h() {
        super(C5998a.w(C6482d.f71776a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(boolean[] zArr) {
        C6496s.h(zArr, "<this>");
        return zArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public boolean[] r() {
        return new boolean[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, C6451g gVar, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(gVar, "builder");
        gVar.e(cVar.s(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C6451g k(boolean[] zArr) {
        C6496s.h(zArr, "<this>");
        return new C6451g(zArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, boolean[] zArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(zArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.A(getDescriptor(), i11, zArr[i11]);
        }
    }
}
