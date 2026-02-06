package kh;

import gh.C5978b;
import hh.C5998a;
import jh.c;
import jh.d;
import kotlin.jvm.internal.C6483e;
import kotlin.jvm.internal.C6496s;

/* renamed from: kh.k  reason: case insensitive filesystem */
public final class C6459k extends C6468o0 implements C5978b {

    /* renamed from: c  reason: collision with root package name */
    public static final C6459k f71683c = new C6459k();

    private C6459k() {
        super(C5998a.x(C6483e.f71777a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int e(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public byte[] r() {
        return new byte[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void h(c cVar, int i10, C6457j jVar, boolean z10) {
        C6496s.h(cVar, "decoder");
        C6496s.h(jVar, "builder");
        jVar.e(cVar.k(getDescriptor(), i10));
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public C6457j k(byte[] bArr) {
        C6496s.h(bArr, "<this>");
        return new C6457j(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void u(d dVar, byte[] bArr, int i10) {
        C6496s.h(dVar, "encoder");
        C6496s.h(bArr, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            dVar.l(getDescriptor(), i11, bArr[i11]);
        }
    }
}
