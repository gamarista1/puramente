package W9;

import ja.C3645a;
import java.nio.ByteBuffer;
import n9.C3874j;

public abstract class g extends C3874j implements i {

    /* renamed from: n  reason: collision with root package name */
    private final String f34973n;

    class a extends m {
        a() {
        }

        public void u() {
            g.this.r(this);
        }
    }

    protected g(String str) {
        super(new l[2], new m[2]);
        this.f34973n = str;
        u(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final j j(l lVar, m mVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C3645a.e(lVar.f46950c);
            m mVar2 = mVar;
            mVar2.x(lVar.f46952e, z(byteBuffer.array(), byteBuffer.limit(), z10), lVar.f34976i);
            mVar.j(Integer.MIN_VALUE);
            return null;
        } catch (j e10) {
            return e10;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final l g() {
        return new l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final m h() {
        return new a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final j i(Throwable th2) {
        return new j("Unexpected decode error", th2);
    }

    /* access modifiers changed from: protected */
    public abstract h z(byte[] bArr, int i10, boolean z10);

    public void b(long j10) {
    }
}
