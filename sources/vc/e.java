package Vc;

import Wc.a;

final class e extends g {

    /* renamed from: c  reason: collision with root package name */
    private final short f53446c;

    /* renamed from: d  reason: collision with root package name */
    private final short f53447d;

    e(g gVar, int i10, int i11) {
        super(gVar);
        this.f53446c = (short) i10;
        this.f53447d = (short) i11;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, byte[] bArr) {
        aVar.d(this.f53446c, this.f53447d);
    }

    public String toString() {
        short s10 = this.f53446c;
        short s11 = this.f53447d;
        short s12 = (s10 & ((1 << s11) - 1)) | (1 << s11);
        return "<" + Integer.toBinaryString(s12 | (1 << this.f53447d)).substring(1) + '>';
    }
}
