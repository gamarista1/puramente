package u2;

import W2.j;
import W2.k;
import W2.s;

/* renamed from: u2.b  reason: case insensitive filesystem */
final class C2698b extends j {

    /* renamed from: p  reason: collision with root package name */
    private final s f26555p;

    public C2698b(String str, s sVar) {
        super(str);
        this.f26555p = sVar;
    }

    /* access modifiers changed from: protected */
    public k B(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f26555p.reset();
        }
        return this.f26555p.b(bArr, 0, i10);
    }
}
