package com.google.android.exoplayer2.source.dash;

import D9.d;
import N9.L;
import P9.f;
import android.os.Handler;
import android.os.Message;
import ia.C3604b;
import ia.C3610h;
import ja.B;
import ja.M;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import k9.C3717q0;
import k9.C3718r0;
import k9.L0;
import q9.C3962B;

public final class e implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final C3604b f42901a;

    /* renamed from: b  reason: collision with root package name */
    private final b f42902b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final F9.b f42903c = new F9.b();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Handler f42904d = M.x(this);

    /* renamed from: e  reason: collision with root package name */
    private final TreeMap f42905e = new TreeMap();

    /* renamed from: f  reason: collision with root package name */
    private R9.c f42906f;

    /* renamed from: g  reason: collision with root package name */
    private long f42907g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f42908h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f42909i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f42910j;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f42911a;

        /* renamed from: b  reason: collision with root package name */
        public final long f42912b;

        public a(long j10, long j11) {
            this.f42911a = j10;
            this.f42912b = j11;
        }
    }

    public interface b {
        void a(long j10);

        void b();
    }

    public final class c implements C3962B {

        /* renamed from: a  reason: collision with root package name */
        private final L f42913a;

        /* renamed from: b  reason: collision with root package name */
        private final C3718r0 f42914b = new C3718r0();

        /* renamed from: c  reason: collision with root package name */
        private final d f42915c = new d();

        /* renamed from: d  reason: collision with root package name */
        private long f42916d = -9223372036854775807L;

        c(C3604b bVar) {
            this.f42913a = L.l(bVar);
        }

        private d g() {
            this.f42915c.i();
            if (this.f42913a.S(this.f42914b, this.f42915c, 0, false) != -4) {
                return null;
            }
            this.f42915c.y();
            return this.f42915c;
        }

        private void k(long j10, long j11) {
            e.this.f42904d.sendMessage(e.this.f42904d.obtainMessage(1, new a(j10, j11)));
        }

        private void l() {
            while (this.f42913a.K(false)) {
                d g10 = g();
                if (g10 != null) {
                    long j10 = g10.f46952e;
                    D9.a a10 = e.this.f42903c.a(g10);
                    if (a10 != null) {
                        F9.a aVar = (F9.a) a10.c(0);
                        if (e.h(aVar.f30802a, aVar.f30803b)) {
                            m(j10, aVar);
                        }
                    }
                }
            }
            this.f42913a.s();
        }

        private void m(long j10, F9.a aVar) {
            long c10 = e.f(aVar);
            if (c10 != -9223372036854775807L) {
                k(j10, c10);
            }
        }

        public void b(B b10, int i10, int i11) {
            this.f42913a.d(b10, i10);
        }

        public void c(C3717q0 q0Var) {
            this.f42913a.c(q0Var);
        }

        public int e(C3610h hVar, int i10, boolean z10, int i11) {
            return this.f42913a.a(hVar, i10, z10);
        }

        public void f(long j10, int i10, int i11, int i12, C3962B.a aVar) {
            this.f42913a.f(j10, i10, i11, i12, aVar);
            l();
        }

        public boolean h(long j10) {
            return e.this.j(j10);
        }

        public void i(f fVar) {
            long j10 = this.f42916d;
            if (j10 == -9223372036854775807L || fVar.f33607h > j10) {
                this.f42916d = fVar.f33607h;
            }
            e.this.m(fVar);
        }

        public boolean j(f fVar) {
            boolean z10;
            long j10 = this.f42916d;
            if (j10 == -9223372036854775807L || j10 >= fVar.f33606g) {
                z10 = false;
            } else {
                z10 = true;
            }
            return e.this.n(z10);
        }

        public void n() {
            this.f42913a.T();
        }
    }

    public e(R9.c cVar, b bVar, C3604b bVar2) {
        this.f42906f = cVar;
        this.f42902b = bVar;
        this.f42901a = bVar2;
    }

    private Map.Entry e(long j10) {
        return this.f42905e.ceilingEntry(Long.valueOf(j10));
    }

    /* access modifiers changed from: private */
    public static long f(F9.a aVar) {
        try {
            return M.J0(M.D(aVar.f30806e));
        } catch (L0 unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j10, long j11) {
        Long l10 = (Long) this.f42905e.get(Long.valueOf(j11));
        if (l10 == null) {
            this.f42905e.put(Long.valueOf(j11), Long.valueOf(j10));
        } else if (l10.longValue() > j10) {
            this.f42905e.put(Long.valueOf(j11), Long.valueOf(j10));
        }
    }

    /* access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        if (!"urn:mpeg:dash:event:2012".equals(str) || (!"1".equals(str2) && !"2".equals(str2) && !"3".equals(str2))) {
            return false;
        }
        return true;
    }

    private void i() {
        if (this.f42908h) {
            this.f42909i = true;
            this.f42908h = false;
            this.f42902b.b();
        }
    }

    private void l() {
        this.f42902b.a(this.f42907g);
    }

    private void p() {
        Iterator it = this.f42905e.entrySet().iterator();
        while (it.hasNext()) {
            if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < this.f42906f.f33760h) {
                it.remove();
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f42910j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f42911a, aVar.f42912b);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean j(long j10) {
        R9.c cVar = this.f42906f;
        boolean z10 = false;
        if (!cVar.f33756d) {
            return false;
        }
        if (this.f42909i) {
            return true;
        }
        Map.Entry e10 = e(cVar.f33760h);
        if (e10 != null && ((Long) e10.getValue()).longValue() < j10) {
            this.f42907g = ((Long) e10.getKey()).longValue();
            l();
            z10 = true;
        }
        if (z10) {
            i();
        }
        return z10;
    }

    public c k() {
        return new c(this.f42901a);
    }

    /* access modifiers changed from: package-private */
    public void m(f fVar) {
        this.f42908h = true;
    }

    /* access modifiers changed from: package-private */
    public boolean n(boolean z10) {
        if (!this.f42906f.f33756d) {
            return false;
        }
        if (this.f42909i) {
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f42910j = true;
        this.f42904d.removeCallbacksAndMessages((Object) null);
    }

    public void q(R9.c cVar) {
        this.f42909i = false;
        this.f42907g = -9223372036854775807L;
        this.f42906f = cVar;
        p();
    }
}
