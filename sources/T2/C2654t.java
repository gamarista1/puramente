package t2;

import android.net.Uri;
import androidx.media3.exoplayer.U;
import com.google.common.util.concurrent.g;
import f2.I;
import f2.s;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l2.f;
import m2.C2190B;
import m2.w;
import nb.C5110e;
import t2.C2614B;
import t2.C2653s;
import v2.x;

/* renamed from: t2.t  reason: case insensitive filesystem */
final class C2654t implements C2614B {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f26310a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final j0 f26311b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f26312c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f26313d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference f26314e = new AtomicReference();

    /* renamed from: f  reason: collision with root package name */
    private g f26315f;

    /* renamed from: t2.t$a */
    private final class a implements Z {

        /* renamed from: a  reason: collision with root package name */
        private int f26316a = 0;

        public a() {
        }

        public int a(w wVar, f fVar, int i10) {
            int i11 = this.f26316a;
            if (i11 == 2) {
                fVar.f(4);
                return -4;
            } else if ((i10 & 2) != 0 || i11 == 0) {
                wVar.f23734b = C2654t.this.f26311b.b(0).a(0);
                this.f26316a = 1;
                return -5;
            } else if (!C2654t.this.f26313d.get()) {
                return -3;
            } else {
                int length = C2654t.this.f26312c.length;
                fVar.f(1);
                fVar.f23522f = 0;
                if ((i10 & 4) == 0) {
                    fVar.u(length);
                    fVar.f23520d.put(C2654t.this.f26312c, 0, length);
                }
                if ((i10 & 1) == 0) {
                    this.f26316a = 2;
                }
                return -4;
            }
        }

        public boolean d() {
            return C2654t.this.f26313d.get();
        }

        public void e() {
            Throwable th2 = (Throwable) C2654t.this.f26314e.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        public int k(long j10) {
            return 0;
        }
    }

    public C2654t(Uri uri, String str, C2653s sVar) {
        this.f26310a = uri;
        this.f26311b = new j0(new I(new s.b().o0(str).K()));
        this.f26312c = uri.toString().getBytes(C5110e.f61085c);
    }

    public long a() {
        if (this.f26313d.get()) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public boolean b() {
        return !this.f26313d.get();
    }

    public long c() {
        if (this.f26313d.get()) {
            return Long.MIN_VALUE;
        }
        return 0;
    }

    public boolean e(U u10) {
        return !this.f26313d.get();
    }

    public long h() {
        return -9223372036854775807L;
    }

    public void m() {
        g gVar = this.f26315f;
        if (gVar != null) {
            gVar.cancel(false);
        }
    }

    public j0 n() {
        return this.f26311b;
    }

    public void p(C2614B.a aVar, long j10) {
        aVar.i(this);
        new C2653s.a(this.f26310a);
        throw null;
    }

    public long t(x[] xVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j10) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (zArr2[i10] != null && (xVarArr[i10] == null || !zArr[i10])) {
                zArr2[i10] = null;
            }
            if (zArr2[i10] == null && xVarArr[i10] != null) {
                zArr2[i10] = new a();
                zArr3[i10] = true;
            }
        }
        return j10;
    }

    public void j() {
    }

    public void f(long j10) {
    }

    public long g(long j10) {
        return j10;
    }

    public void o(long j10, boolean z10) {
    }

    public long s(long j10, C2190B b10) {
        return j10;
    }
}
