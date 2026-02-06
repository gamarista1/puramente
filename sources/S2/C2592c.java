package s2;

import I2.a;
import I2.b;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.C1806d;
import androidx.media3.exoplayer.r0;
import f2.s;
import f2.z;
import i2.C2076a;
import i2.L;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m2.w;
import t2.C2615C;

/* renamed from: s2.c  reason: case insensitive filesystem */
public final class C2592c extends C1806d implements Handler.Callback {

    /* renamed from: A  reason: collision with root package name */
    private z f25888A;

    /* renamed from: B  reason: collision with root package name */
    private long f25889B;

    /* renamed from: r  reason: collision with root package name */
    private final C2590a f25890r;

    /* renamed from: s  reason: collision with root package name */
    private final C2591b f25891s;

    /* renamed from: t  reason: collision with root package name */
    private final Handler f25892t;

    /* renamed from: u  reason: collision with root package name */
    private final b f25893u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f25894v;

    /* renamed from: w  reason: collision with root package name */
    private a f25895w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f25896x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f25897y;

    /* renamed from: z  reason: collision with root package name */
    private long f25898z;

    public C2592c(C2591b bVar, Looper looper) {
        this(bVar, looper, C2590a.f25887a);
    }

    private void p0(z zVar, List list) {
        for (int i10 = 0; i10 < zVar.e(); i10++) {
            s m10 = zVar.d(i10).m();
            if (m10 == null || !this.f25890r.a(m10)) {
                list.add(zVar.d(i10));
            } else {
                a b10 = this.f25890r.b(m10);
                byte[] bArr = (byte[]) C2076a.e(zVar.d(i10).t());
                this.f25893u.i();
                this.f25893u.u(bArr.length);
                ((ByteBuffer) L.h(this.f25893u.f23520d)).put(bArr);
                this.f25893u.x();
                z a10 = b10.a(this.f25893u);
                if (a10 != null) {
                    p0(a10, list);
                }
            }
        }
    }

    private long q0(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        if (this.f25889B != -9223372036854775807L) {
            z11 = true;
        }
        C2076a.g(z11);
        return j10 - this.f25889B;
    }

    private void r0(z zVar) {
        Handler handler = this.f25892t;
        if (handler != null) {
            handler.obtainMessage(1, zVar).sendToTarget();
        } else {
            s0(zVar);
        }
    }

    private void s0(z zVar) {
        this.f25891s.I(zVar);
    }

    private boolean t0(long j10) {
        boolean z10;
        z zVar = this.f25888A;
        if (zVar == null || (!this.f25894v && zVar.f20392b > q0(j10))) {
            z10 = false;
        } else {
            r0(this.f25888A);
            this.f25888A = null;
            z10 = true;
        }
        if (this.f25896x && this.f25888A == null) {
            this.f25897y = true;
        }
        return z10;
    }

    private void u0() {
        if (!this.f25896x && this.f25888A == null) {
            this.f25893u.i();
            w V10 = V();
            int m02 = m0(V10, this.f25893u, 0);
            if (m02 == -4) {
                if (this.f25893u.m()) {
                    this.f25896x = true;
                } else if (this.f25893u.f23522f >= X()) {
                    b bVar = this.f25893u;
                    bVar.f2813j = this.f25898z;
                    bVar.x();
                    z a10 = ((a) L.h(this.f25895w)).a(this.f25893u);
                    if (a10 != null) {
                        ArrayList arrayList = new ArrayList(a10.e());
                        p0(a10, arrayList);
                        if (!arrayList.isEmpty()) {
                            this.f25888A = new z(q0(this.f25893u.f23522f), (List) arrayList);
                        }
                    }
                }
            } else if (m02 == -5) {
                this.f25898z = ((s) C2076a.e(V10.f23734b)).f20088s;
            }
        }
    }

    public int a(s sVar) {
        int i10;
        if (!this.f25890r.a(sVar)) {
            return r0.o(0);
        }
        if (sVar.f20068K == 0) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        return r0.o(i10);
    }

    public boolean b() {
        return this.f25897y;
    }

    /* access modifiers changed from: protected */
    public void b0() {
        this.f25888A = null;
        this.f25895w = null;
        this.f25889B = -9223372036854775807L;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void e0(long j10, boolean z10) {
        this.f25888A = null;
        this.f25896x = false;
        this.f25897y = false;
    }

    public void g(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            u0();
            z10 = t0(j10);
        }
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            s0((z) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void k0(s[] sVarArr, long j10, long j11, C2615C.b bVar) {
        this.f25895w = this.f25890r.b(sVarArr[0]);
        z zVar = this.f25888A;
        if (zVar != null) {
            this.f25888A = zVar.c((zVar.f20392b + this.f25889B) - j11);
        }
        this.f25889B = j11;
    }

    public C2592c(C2591b bVar, Looper looper, C2590a aVar) {
        this(bVar, looper, aVar, false);
    }

    public C2592c(C2591b bVar, Looper looper, C2590a aVar, boolean z10) {
        super(5);
        Handler handler;
        this.f25891s = (C2591b) C2076a.e(bVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = L.y(looper, this);
        }
        this.f25892t = handler;
        this.f25890r = (C2590a) C2076a.e(aVar);
        this.f25894v = z10;
        this.f25893u = new b();
        this.f25889B = -9223372036854775807L;
    }
}
