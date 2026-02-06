package com.google.android.exoplayer2.source.smoothstreaming;

import N9.C3053b;
import P9.e;
import P9.f;
import P9.g;
import P9.h;
import P9.k;
import P9.n;
import V9.a;
import android.net.Uri;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import ga.r;
import ga.z;
import ia.A;
import ia.C;
import ia.C3612j;
import ia.J;
import ja.C3645a;
import ja.I;
import java.io.IOException;
import java.util.List;
import k9.C3717q0;
import k9.e1;
import y9.o;
import y9.p;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final C f42976a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42977b;

    /* renamed from: c  reason: collision with root package name */
    private final g[] f42978c;

    /* renamed from: d  reason: collision with root package name */
    private final C3612j f42979d;

    /* renamed from: e  reason: collision with root package name */
    private r f42980e;

    /* renamed from: f  reason: collision with root package name */
    private V9.a f42981f;

    /* renamed from: g  reason: collision with root package name */
    private int f42982g;

    /* renamed from: h  reason: collision with root package name */
    private IOException f42983h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a  reason: collision with other inner class name */
    public static final class C0661a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        private final C3612j.a f42984a;

        public C0661a(C3612j.a aVar) {
            this.f42984a = aVar;
        }

        public b a(C c10, V9.a aVar, int i10, r rVar, J j10) {
            C3612j a10 = this.f42984a.a();
            if (j10 != null) {
                a10.n(j10);
            }
            return new a(c10, aVar, i10, rVar, a10);
        }
    }

    private static final class b extends P9.b {

        /* renamed from: e  reason: collision with root package name */
        private final a.b f42985e;

        /* renamed from: f  reason: collision with root package name */
        private final int f42986f;

        public b(a.b bVar, int i10, int i11) {
            super((long) i11, (long) (bVar.f34775k - 1));
            this.f42985e = bVar;
            this.f42986f = i10;
        }

        public long a() {
            c();
            return this.f42985e.e((int) d());
        }

        public long b() {
            return a() + this.f42985e.c((int) d());
        }
    }

    public a(C c10, V9.a aVar, int i10, r rVar, C3612j jVar) {
        p[] pVarArr;
        int i11;
        V9.a aVar2 = aVar;
        int i12 = i10;
        r rVar2 = rVar;
        this.f42976a = c10;
        this.f42981f = aVar2;
        this.f42977b = i12;
        this.f42980e = rVar2;
        this.f42979d = jVar;
        a.b bVar = aVar2.f34759f[i12];
        this.f42978c = new g[rVar.length()];
        for (int i13 = 0; i13 < this.f42978c.length; i13++) {
            int c11 = rVar2.c(i13);
            C3717q0 q0Var = bVar.f34774j[c11];
            if (q0Var.f45773o != null) {
                pVarArr = ((a.C0563a) C3645a.e(aVar2.f34758e)).f34764c;
            } else {
                pVarArr = null;
            }
            int i14 = bVar.f34765a;
            if (i14 == 2) {
                i11 = 4;
            } else {
                i11 = 0;
            }
            o oVar = r7;
            o oVar2 = new o(c11, i14, bVar.f34767c, -9223372036854775807L, aVar2.f34760g, q0Var, 0, pVarArr, i11, (long[]) null, (long[]) null);
            this.f42978c[i13] = new e(new y9.g(3, (I) null, oVar), bVar.f34765a, q0Var);
        }
    }

    private static n j(C3717q0 q0Var, C3612j jVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, g gVar) {
        C3612j jVar2 = jVar;
        long j13 = j11;
        long j14 = j12;
        int i12 = i11;
        Object obj2 = obj;
        ia.n nVar = r0;
        ia.n nVar2 = new ia.n(uri);
        return new k(jVar2, nVar, q0Var, i12, obj2, j10, j13, j14, -9223372036854775807L, (long) i10, 1, j10, gVar);
    }

    private long k(long j10) {
        V9.a aVar = this.f42981f;
        if (!aVar.f34757d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f34759f[this.f42977b];
        int i10 = bVar.f34775k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    public void a(r rVar) {
        this.f42980e = rVar;
    }

    public boolean b(f fVar, boolean z10, A.c cVar, A a10) {
        A.b d10 = a10.d(z.c(this.f42980e), cVar);
        if (z10 && d10 != null && d10.f44356a == 2) {
            r rVar = this.f42980e;
            if (rVar.o(rVar.l(fVar.f33603d), d10.f44357b)) {
                return true;
            }
        }
        return false;
    }

    public void e() {
        IOException iOException = this.f42983h;
        if (iOException == null) {
            this.f42976a.e();
            return;
        }
        throw iOException;
    }

    public boolean f(long j10, f fVar, List list) {
        if (this.f42983h != null) {
            return false;
        }
        return this.f42980e.n(j10, fVar, list);
    }

    public final void g(long j10, long j11, List list, h hVar) {
        int i10;
        long j12 = j11;
        h hVar2 = hVar;
        if (this.f42983h == null) {
            V9.a aVar = this.f42981f;
            a.b bVar = aVar.f34759f[this.f42977b];
            if (bVar.f34775k == 0) {
                hVar2.f33610b = !aVar.f34757d;
                return;
            }
            if (list.isEmpty()) {
                i10 = bVar.d(j12);
                List list2 = list;
            } else {
                i10 = (int) (((n) list.get(list.size() - 1)).g() - ((long) this.f42982g));
                if (i10 < 0) {
                    this.f42983h = new C3053b();
                    return;
                }
            }
            if (i10 >= bVar.f34775k) {
                hVar2.f33610b = !this.f42981f.f34757d;
                return;
            }
            long j13 = j12 - j10;
            long k10 = k(j10);
            int length = this.f42980e.length();
            P9.o[] oVarArr = new P9.o[length];
            for (int i11 = 0; i11 < length; i11++) {
                oVarArr[i11] = new b(bVar, this.f42980e.c(i11), i10);
            }
            this.f42980e.m(j10, j13, k10, list, oVarArr);
            long e10 = bVar.e(i10);
            long c10 = e10 + bVar.c(i10);
            if (!list.isEmpty()) {
                j12 = -9223372036854775807L;
            }
            long j14 = j12;
            int i12 = i10 + this.f42982g;
            int a10 = this.f42980e.a();
            g gVar = this.f42978c[a10];
            Uri a11 = bVar.a(this.f42980e.c(a10), i10);
            hVar2.f33609a = j(this.f42980e.j(), this.f42979d, a11, i12, e10, c10, j14, this.f42980e.s(), this.f42980e.q(), gVar);
        }
    }

    public int h(long j10, List list) {
        if (this.f42983h != null || this.f42980e.length() < 2) {
            return list.size();
        }
        return this.f42980e.r(j10, list);
    }

    public void i(V9.a aVar) {
        a.b[] bVarArr = this.f42981f.f34759f;
        int i10 = this.f42977b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f34775k;
        a.b bVar2 = aVar.f34759f[i10];
        if (i11 == 0 || bVar2.f34775k == 0) {
            this.f42982g += i11;
        } else {
            int i12 = i11 - 1;
            long e10 = bVar.e(i12) + bVar.c(i12);
            long e11 = bVar2.e(0);
            if (e10 <= e11) {
                this.f42982g += i11;
            } else {
                this.f42982g += bVar.d(e11);
            }
        }
        this.f42981f = aVar;
    }

    public long l(long j10, e1 e1Var) {
        long j11;
        a.b bVar = this.f42981f.f34759f[this.f42977b];
        int d10 = bVar.d(j10);
        long e10 = bVar.e(d10);
        if (e10 >= j10 || d10 >= bVar.f34775k - 1) {
            j11 = e10;
        } else {
            j11 = bVar.e(d10 + 1);
        }
        return e1Var.a(j10, e10, j11);
    }

    public void release() {
        for (g release : this.f42978c) {
            release.release();
        }
    }

    public void d(f fVar) {
    }
}
