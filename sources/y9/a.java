package Y9;

import W9.g;
import W9.h;
import ja.B;
import java.util.List;

public final class a extends g {

    /* renamed from: o  reason: collision with root package name */
    private final b f35784o;

    public a(List list) {
        super("DvbDecoder");
        B b10 = new B((byte[]) list.get(0));
        this.f35784o = new b(b10.J(), b10.J());
    }

    /* access modifiers changed from: protected */
    public h z(byte[] bArr, int i10, boolean z10) {
        if (z10) {
            this.f35784o.r();
        }
        return new c(this.f35784o.b(bArr, i10));
    }
}
