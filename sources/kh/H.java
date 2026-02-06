package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.r;

public final class H extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final H f71601c = new H();

    private H() {
        super(C5998a.B(r.f71790a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(int[] iArr) {
        C6496s.h(iArr, "<this>");
        return iArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int[] r() {
        return new int[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, G g10, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(g10, "builder");
        g10.e(cVar.E(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public G k(int[] iArr) {
        C6496s.h(iArr, "<this>");
        return new G(iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, int[] iArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.i(getDescriptor(), i11, iArr[i11]);
        }
    }
}
