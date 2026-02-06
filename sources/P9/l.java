package P9;

import ia.C3612j;
import ia.m;
import ia.n;
import ja.M;
import java.util.Arrays;
import k9.C3717q0;

public abstract class l extends f {

    /* renamed from: j  reason: collision with root package name */
    private byte[] f33645j;

    /* renamed from: k  reason: collision with root package name */
    private volatile boolean f33646k;

    public l(C3612j jVar, n nVar, int i10, C3717q0 q0Var, int i11, Object obj, byte[] bArr) {
        super(jVar, nVar, i10, q0Var, i11, obj, -9223372036854775807L, -9223372036854775807L);
        l lVar;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = M.f44986f;
            lVar = this;
        } else {
            lVar = this;
            bArr2 = bArr;
        }
        lVar.f33645j = bArr2;
    }

    private void i(int i10) {
        byte[] bArr = this.f33645j;
        if (bArr.length < i10 + 16384) {
            this.f33645j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    public final void a() {
        try {
            this.f33608i.m(this.f33601b);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f33646k) {
                i(i11);
                i10 = this.f33608i.read(this.f33645j, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f33646k) {
                g(this.f33645j, i11);
            }
            m.a(this.f33608i);
        } catch (Throwable th2) {
            m.a(this.f33608i);
            throw th2;
        }
    }

    public final void b() {
        this.f33646k = true;
    }

    /* access modifiers changed from: protected */
    public abstract void g(byte[] bArr, int i10);

    public byte[] h() {
        return this.f33645j;
    }
}
