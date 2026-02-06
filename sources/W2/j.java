package W2;

import i2.C2076a;
import java.nio.ByteBuffer;
import l2.h;

public abstract class j extends h implements l {

    /* renamed from: o  reason: collision with root package name */
    private final String f8644o;

    class a extends q {
        a() {
        }

        public void t() {
            j.this.t(this);
        }
    }

    protected j(String str) {
        super(new p[2], new q[2]);
        this.f8644o = str;
        w(1024);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final m k(Throwable th2) {
        return new m("Unexpected decode error", th2);
    }

    /* access modifiers changed from: protected */
    public abstract k B(byte[] bArr, int i10, boolean z10);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final m l(p pVar, q qVar, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) C2076a.e(pVar.f23520d);
            q qVar2 = qVar;
            qVar2.u(pVar.f23522f, B(byteBuffer.array(), byteBuffer.limit(), z10), pVar.f8660j);
            qVar.f23530d = false;
            return null;
        } catch (m e10) {
            return e10;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final p i() {
        return new p();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final q j() {
        return new a();
    }

    public void b(long j10) {
    }
}
