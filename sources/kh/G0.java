package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6506E;
import lf.C6507F;

public final class G0 extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final G0 f71600c = new G0();

    private G0() {
        super(C5998a.G(C6506E.f71797b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6507F) obj).I());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6507F) obj).I());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return C6507F.a(w());
    }

    public /* bridge */ /* synthetic */ void u(d dVar, Object obj, int i10) {
        z(dVar, ((C6507F) obj).I(), i10);
    }

    /* access modifiers changed from: protected */
    public int v(int[] iArr) {
        C6496s.h(iArr, "$this$collectionSize");
        return C6507F.z(iArr);
    }

    /* access modifiers changed from: protected */
    public int[] w() {
        return C6507F.b(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, F0 f02, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(f02, "builder");
        f02.e(C6506E.b(cVar.e(getDescriptor(), i10).h()));
    }

    /* access modifiers changed from: protected */
    public F0 y(int[] iArr) {
        C6496s.h(iArr, "$this$toBuilder");
        return new F0(iArr, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public void z(d dVar, int[] iArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(iArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.k(getDescriptor(), i11).D(C6507F.v(iArr, i11));
        }
    }
}
