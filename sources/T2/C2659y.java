package t2;

import androidx.media3.exoplayer.U;
import i2.C2076a;
import i2.L;
import java.io.IOException;
import m2.C2190B;
import t2.C2614B;
import t2.C2615C;
import v2.x;
import w2.C2820b;

/* renamed from: t2.y  reason: case insensitive filesystem */
public final class C2659y implements C2614B, C2614B.a {

    /* renamed from: a  reason: collision with root package name */
    public final C2615C.b f26335a;

    /* renamed from: b  reason: collision with root package name */
    private final long f26336b;

    /* renamed from: c  reason: collision with root package name */
    private final C2820b f26337c;

    /* renamed from: d  reason: collision with root package name */
    private C2615C f26338d;

    /* renamed from: e  reason: collision with root package name */
    private C2614B f26339e;

    /* renamed from: f  reason: collision with root package name */
    private C2614B.a f26340f;

    /* renamed from: g  reason: collision with root package name */
    private a f26341g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f26342h;

    /* renamed from: i  reason: collision with root package name */
    private long f26343i = -9223372036854775807L;

    /* renamed from: t2.y$a */
    public interface a {
        void a(C2615C.b bVar);

        void b(C2615C.b bVar, IOException iOException);
    }

    public C2659y(C2615C.b bVar, C2820b bVar2, long j10) {
        this.f26335a = bVar;
        this.f26337c = bVar2;
        this.f26336b = j10;
    }

    private long q(long j10) {
        long j11 = this.f26343i;
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return j10;
    }

    public long a() {
        return ((C2614B) L.h(this.f26339e)).a();
    }

    public boolean b() {
        C2614B b10 = this.f26339e;
        if (b10 == null || !b10.b()) {
            return false;
        }
        return true;
    }

    public long c() {
        return ((C2614B) L.h(this.f26339e)).c();
    }

    public boolean e(U u10) {
        C2614B b10 = this.f26339e;
        if (b10 == null || !b10.e(u10)) {
            return false;
        }
        return true;
    }

    public void f(long j10) {
        ((C2614B) L.h(this.f26339e)).f(j10);
    }

    public long g(long j10) {
        return ((C2614B) L.h(this.f26339e)).g(j10);
    }

    public long h() {
        return ((C2614B) L.h(this.f26339e)).h();
    }

    public void i(C2614B b10) {
        ((C2614B.a) L.h(this.f26340f)).i(this);
        a aVar = this.f26341g;
        if (aVar != null) {
            aVar.a(this.f26335a);
        }
    }

    public void j() {
        try {
            C2614B b10 = this.f26339e;
            if (b10 != null) {
                b10.j();
                return;
            }
            C2615C c10 = this.f26338d;
            if (c10 != null) {
                c10.c();
            }
        } catch (IOException e10) {
            a aVar = this.f26341g;
            if (aVar == null) {
                throw e10;
            } else if (!this.f26342h) {
                this.f26342h = true;
                aVar.b(this.f26335a, e10);
            }
        }
    }

    public void k(C2615C.b bVar) {
        long q10 = q(this.f26336b);
        C2614B o10 = ((C2615C) C2076a.e(this.f26338d)).o(bVar, this.f26337c, q10);
        this.f26339e = o10;
        if (this.f26340f != null) {
            o10.p(this, q10);
        }
    }

    public long l() {
        return this.f26343i;
    }

    public long m() {
        return this.f26336b;
    }

    public j0 n() {
        return ((C2614B) L.h(this.f26339e)).n();
    }

    public void o(long j10, boolean z10) {
        ((C2614B) L.h(this.f26339e)).o(j10, z10);
    }

    public void p(C2614B.a aVar, long j10) {
        this.f26340f = aVar;
        C2614B b10 = this.f26339e;
        if (b10 != null) {
            b10.p(this, q(this.f26336b));
        }
    }

    /* renamed from: r */
    public void d(C2614B b10) {
        ((C2614B.a) L.h(this.f26340f)).d(this);
    }

    public long s(long j10, C2190B b10) {
        return ((C2614B) L.h(this.f26339e)).s(j10, b10);
    }

    public long t(x[] xVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j10) {
        long j11;
        long j12 = this.f26343i;
        if (j12 == -9223372036854775807L || j10 != this.f26336b) {
            j11 = j10;
        } else {
            j11 = j12;
        }
        this.f26343i = -9223372036854775807L;
        return ((C2614B) L.h(this.f26339e)).t(xVarArr, zArr, zArr2, zArr3, j11);
    }

    public void u(long j10) {
        this.f26343i = j10;
    }

    public void v() {
        if (this.f26339e != null) {
            ((C2615C) C2076a.e(this.f26338d)).j(this.f26339e);
        }
    }

    public void w(C2615C c10) {
        boolean z10;
        if (this.f26338d == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        C2076a.g(z10);
        this.f26338d = c10;
    }
}
