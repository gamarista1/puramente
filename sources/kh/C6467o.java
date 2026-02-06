package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6485g;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.o  reason: case insensitive filesystem */
public final class C6467o extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final C6467o f71690c = new C6467o();

    private C6467o() {
        super(C5998a.y(C6485g.f71779a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(char[] cArr) {
        C6496s.h(cArr, "<this>");
        return cArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public char[] r() {
        return new char[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, C6465n nVar, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(nVar, "builder");
        nVar.e(cVar.v(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C6465n k(char[] cArr) {
        C6496s.h(cArr, "<this>");
        return new C6465n(cArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, char[] cArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(cArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.v(getDescriptor(), i11, cArr[i11]);
        }
    }
}
