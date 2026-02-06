package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6504C;
import lf.C6505D;

public final class D0 extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final D0 f71591c = new D0();

    private D0() {
        super(C5998a.F(C6504C.f71792b));
    }

    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((C6505D) obj).I());
    }

    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((C6505D) obj).I());
    }

    public /* bridge */ /* synthetic */ Object r() {
        return C6505D.a(w());
    }

    public /* bridge */ /* synthetic */ void u(d dVar, Object obj, int i10) {
        z(dVar, ((C6505D) obj).I(), i10);
    }

    /* access modifiers changed from: protected */
    public int v(byte[] bArr) {
        C6496s.h(bArr, "$this$collectionSize");
        return C6505D.z(bArr);
    }

    /* access modifiers changed from: protected */
    public byte[] w() {
        return C6505D.b(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, C0 c02, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(c02, "builder");
        c02.e(C6504C.b(cVar.e(getDescriptor(), i10).H()));
    }

    /* access modifiers changed from: protected */
    public C0 y(byte[] bArr) {
        C6496s.h(bArr, "$this$toBuilder");
        return new C0(bArr, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    public void z(d dVar, byte[] bArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.k(getDescriptor(), i11).h(C6505D.v(bArr, i11));
        }
    }
}
